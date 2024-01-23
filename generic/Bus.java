package generic;

public class Bus extends Car{
    public Bus(String name) {
        super(name); /* 부모 클래스의 생성자에 매개변수가 있을경우 자식클래스에서 명시적으로 호출해주어야한다.*/
    }

    public String toString() {
        return "Bus name = " + name;
    }
}
