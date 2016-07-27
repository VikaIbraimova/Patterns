package ex1;

/**
 * Created by vika on 26.07.16.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Создаются два подпичика на события издателя
         */
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();

        //Издатель
        Publisher publisher = new Publisher();
        /**
         * Подписчики добавляются в список слушателей событий издателя
         */
        publisher.addListener(subscriber1);
        publisher.addListener(subscriber2);

        /**
         * Издатель выдает сообщение, тоесть типо произошло событие
         */
        publisher.createMessage("Message");


    }
}
