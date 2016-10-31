package ex3;

public class Porshe implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 150km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 1 sec");
    }
}
