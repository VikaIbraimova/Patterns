package ex1;

import java.util.ArrayList;

/**
 * Created by vika on 27.07.16.
 */
public class Publisher implements PublisherInterface {
    private ArrayList<PublisherActionListener> listeners = new ArrayList<>();

    //Возвращаем коллекцию, которая объявлена выше
    @Override
    public ArrayList<PublisherActionListener> getListeners() {
        //return null;
        return listeners;
    }

    //Добавление слушателя в коллекцию
    @Override
    public void addListener(PublisherActionListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(PublisherActionListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllListeners() {
        listeners.clear();
    }

    @Override
    public void notifySubscribers(String message) {
        for (PublisherActionListener actionListener:listeners) {
            actionListener.doAction(message);
        }
    }

    public void createMessage(String message) {
        System.out.println("Publisher printed massage:" + message);
        //Перебераем всех слушателей и передаем им сообщения
        notifySubscribers(message);
    }
}
