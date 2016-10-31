package object;

import facade.CarFacade;
import parts.Door;
import parts.Wheel;
import parts.Zazihanie;

/**
 * Created by vika on 23.06.16.
 */
public class Client {
    public static void main(String[] args) {
        //без фасада
        /*Door door1 = new Door();
        door1.open();

        Zazihanie zazihanie1 = new Zazihanie();
        zazihanie1.fire();

        Wheel wheel1 = new Wheel();
        wheel1.turn();*/

        //вызов с фасадом
        CarFacade carFacade = new CarFacade();
        /**
         * Метод go сам откороет дверь,
         * включит зажигание и поедит
         */
        carFacade.go();
    }
}
