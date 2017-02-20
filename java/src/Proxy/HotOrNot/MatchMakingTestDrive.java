package Proxy.HotOrNot;

import java.lang.reflect.Proxy;

/**
 * Created by kami.wm on 17/02/2017.
 *
 */
public class MatchMakingTestDrive {
    public static void main(String[] arges) {
        MatchMakingTestDrive matchMakingTestDrive = new MatchMakingTestDrive();
        matchMakingTestDrive.drive();

    }
    private void drive() {
        PersonBean joe = new PersonBeanImp();
        joe.setGender("Male");
        joe.setName("Joe");
        joe.setHotOrNotRating(10);
        joe.setInterests("ACG");
        PersonBean user_joe = getOwnerProxy(joe);

        try {
            user_joe.setHotOrNotRating(100);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("can't change your own hot or not rating");
        }

    }

    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),     // getClass(): 取得当前对象所属的Class对象,
                                                        // getClassLoader(): 取得该Class对象的类装载器
                person.getClass().getInterfaces(),      // 代理对象的接口和实际对象是一样的
                new OwnerInovacationHandler(person));   // 对代理对象的调用请求交给InovacationHanlder处理
    }
}
