package Template;

/**
 * Created by kami.wm on 06/02/2017.
 *
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerNeedsCondiments()) {
            addCondiments();
        }
    }
    private void boilWater() {
        System.out.println("Boiling Water...");
    }
    private void pourInCup() {
        System.out.println("Pour into Cup...");
    }
    abstract void brew();

    abstract void addCondiments();

    boolean customerNeedsCondiments() {
        return true;
    }

}
