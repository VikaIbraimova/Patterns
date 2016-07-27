package patternsdemo.singleton;

/**
 * Created by vika on 21.06.16.
 */
public class TestSingleton {
    public static TestSingleton instance;

    /**
     * Данный метод проверяет создан ли объект Singleton(переменная instance не равна нулю)
     * Если instance равен нулю, значит он возращает вам новый instance
     * @return
     */
    public static TestSingleton getInstancee() {
       if (instance == null) {
            instance = new TestSingleton();
        }
        /**
         * Если закоментить проверку то каждый раз будет работать новый объект класса
         */
        //instance = new TestSingleton();
        return instance;
    }

    /**
     * В данном примере конструктор закрывется от доступа модификатором доступа private,
     * так как если он будет написан с модификатором доступа protected или хуже public,
     * то можно будет наплодить объектов Singleton много.
     * Для создания объекта этого класса, мы предоставляем спец. управляемый метод getInstance
     */
    private TestSingleton() {

    }

    public void print() {
        System.out.println(this);
    }
}
