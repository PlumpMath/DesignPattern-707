package Template;

/**
 * Created by kami.wm on 06/02/2017.
 *
 */
class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brew Tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Lemon...");
    }
}
