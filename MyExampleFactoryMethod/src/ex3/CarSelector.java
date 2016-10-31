package ex3;

/**
 * Данный класс является фабрикой по созданию автомобилей(реализован шаблон проектирования фабричный метод)+
 * экземпляр этого класса создается в единственном экзмеляре(реализован шаблон проектирования Singleton) +
 * для многопоточного режима(вариант 2): при создании класса в Main11 - уже создается переменная instance, и затем каждый поток ее использует
 */
public class CarSelector {
    private static final CarSelector instance = new CarSelector();

    private CarSelector() {
    }

    public static CarSelector getInstance(){
        return instance;
    }
    /**
     * Фабричный Метод
     * @param roadType
     * @return
     */
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType){
            case CITY:
                /**
                 * Если поменять Porshe на Moskvich, то это надо будет сделать в одном месте, здесь
                 * в CarSelector
                 */
                car = new Porshe();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
            case GAZON:
                car = new NewJeep();
                break;
        }
        return car;
    }
}
