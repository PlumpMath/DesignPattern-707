package Compound;

/**
 * Created by kami.wm on 20/02/2017.
 *
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simmulate(duckFactory);
    }
    private void simmulate(AbstractDuckFactory duckFactory) {
        Observer quacklogist = new Quacklogist();

        Quackable mallaDuck = duckFactory.createMallarDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable gooseAdaptor = new GooseAdaptor(new Goose());

        Flock flockOfQuacker = new Flock();
        flockOfQuacker.add(mallaDuck);
        flockOfQuacker.add(redheadDuck);
        flockOfQuacker.add(duckCall);
        flockOfQuacker.add(gooseAdaptor);


        mallaDuck.registerObserver(quacklogist);

        simmulate(mallaDuck);
        simmulate(redheadDuck);
        simmulate(duckCall);
        simmulate(gooseAdaptor);

        simmulate(flockOfQuacker);

        System.out.println("The ducks quack " + QuackCounter.getNumberOfQuacks() + " times");

    }

    private void simmulate(Quackable duck) {
        duck.quack();
    }
}

