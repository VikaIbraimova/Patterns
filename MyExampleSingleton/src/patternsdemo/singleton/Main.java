package patternsdemo.singleton;

/**
 * Created by vika on 21.06.16.
 */
//Данная реализация подходит для одного потока
/**
 * Для использования этого объекта мы
 * пишем нзвание класса, где описан этот шаблон,
 * далее getInstance(тем самым мы получаем ссылку на объект Singleton)
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Результат: работает один и тот же объект
         */
        TestSingleton.getInstancee().print();
        TestSingleton.getInstancee().print();
        TestSingleton.getInstancee().print();

        /**
         * Тоесть, чтобы получить доступ к этому экземпляру - к Singleton
         * Нужно:
         * 1)Написать имя класса, где описан этот шаблон
         * 2)После точки вызвать метод getInstance
         * 3)Дальше, метод который нам нужен и есть у класса, где описан шаблон проектирования
         * ВАЖНО!!!!Класс TestSingleton будет работать для одного потока
         */
    }
}
