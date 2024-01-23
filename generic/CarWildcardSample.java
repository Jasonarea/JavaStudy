package generic;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
    }

    public void callBoundedWildcardMethod() {
        WildcardGeneric<Car> wildcardCar = new WildcardGeneric<>();
        WildcardGeneric<Bus> wildcardBus = new WildcardGeneric<>();
        genericMethod(wildcardCar, new Car("Mustang"), new String("6900"));
        genericMethod(wildcardBus, new Bus("6900"), new String("hello"));
    }


    public <S, T extends Car> void genericMethod(WildcardGeneric<T> c, T addValue, S another) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        S str = another;
        System.out.println(value + " " + str);
    }

    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
