package facade;

/**
 * Created by vika on 23.06.16.
 */

import parts.Wheel;
import parts.Door;
import parts.Zazihanie;

public class CarFacade {

    private Door door1 = new Door();
    private Zazihanie zazihanie1 = new Zazihanie();
    private Wheel wheel1 = new Wheel();

    public void go(){
        door1.open();
        zazihanie1.fire();
        wheel1.turn();
    }
}
