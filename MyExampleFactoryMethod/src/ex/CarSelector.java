package ex;

/**
 * Данный класс является фабрикой по созданию автомобилей
 */
public class CarSelector {

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