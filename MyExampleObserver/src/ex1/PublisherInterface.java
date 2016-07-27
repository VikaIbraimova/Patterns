package ex1;

import java.util.ArrayList;

/**
 * Данный класс является наблюдателем,
 * тоесть ждет наступления какого-то события и
 * затем оповещает всех слушателей
 */
public interface PublisherInterface {

    ArrayList<PublisherActionListener> getListeners();

    void addListener(PublisherActionListener listener);
    public void removeListener(PublisherActionListener listener);
    public void removeAllListeners();

    /**
     * Оповещение о каком-то событии
     * В данном примере всем под
     */
    public void notifySubscribers(String message);
}
