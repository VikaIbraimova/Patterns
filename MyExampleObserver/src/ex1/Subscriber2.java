package ex1;

/**
 * Created by vika on 27.07.16.
 */
public class Subscriber2 implements PublisherActionListener {
    @Override
    public void doAction(String message) {
        System.out.println(message + " from " + this.getClass().getName());
    }
}
