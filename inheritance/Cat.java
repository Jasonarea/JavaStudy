package inheritance;

public class Cat extends Animal{
    public Cat() {
        super("Dog", "Poyuryu", 4, 50, false);
    }

    public void move() {
        System.out.println("Cat Move!!");
    }

    public void eatFood() {
        System.out.println("Cat Eat Food!!");
    }
}
