package ex;

/**
 * Created by vika on 01.11.16.
 */
public class Main {
    public static void main(String[] args) {
        //Создали нашу фабрику - создали экзмепляр класса CarSelector
        CarSelector cs = new CarSelector();

        Car car = cs.getCar(RoadType.CITY);
        car.drive();
        car.stop();
    }
}
