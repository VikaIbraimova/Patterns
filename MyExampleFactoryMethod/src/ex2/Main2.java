package ex2;

/**
 * Created by vika on 01.11.16.
 */
public class Main2 {
    public static void main(String[] args) {
        /**
         * В данном примере фабрика создается в единственном экзмепляре
         */
        Car car = CarSelector.getInstance().getCar(RoadType.CITY);
        car.drive();
        car.stop();

        Car car1 = CarSelector.getInstance().getCar(RoadType.OFF_ROAD);
        car1.drive();
        car1.stop();
    }
}
