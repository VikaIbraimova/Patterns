package ex2;

/**
 * Данный класс является фабрикой по созданию автомобилей(реализован шаблон проектирования фабричный метод)+
 * экземпляр этого класса создается в единственном экзмеляре(реализован шаблон проектирования Singleton)
 */
public class CarSelector {
    public static CarSelector instance;

    private CarSelector() {
    }

    public static CarSelector getInstance(){
        if(instance == null) {
            instance = new CarSelector();
        }
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
