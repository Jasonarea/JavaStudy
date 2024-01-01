package inheritance;

public class AnimalPrint {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal areyoudog = new Dog(); // 가능
        Dog dog2 = (Dog)areyoudog; // 명시적형변환

        dog2.move();
        cat.eatFood();
        //Dog dog2 = new Animal();
    }    
}
