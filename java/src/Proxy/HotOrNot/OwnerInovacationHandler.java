package Proxy.HotOrNot;

/**
 * Created by kami.wm on 16/02/2017.
 *
 */

import java.lang.reflect.*;

public class OwnerInovacationHandler implements InvocationHandler {
    PersonBean personBean;

    OwnerInovacationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException("can't set your own Hot Or Not Rating");
            } else {
                return method.invoke(this.personBean, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
