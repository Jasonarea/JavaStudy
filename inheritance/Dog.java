package inheritance;

public class Dog extends Animal{
    public Dog() {
        super("Dog", "Poyuryu", 4, 50, false);
    }

    public void move() {
        System.out.println("Dog Move!!");
    }

    public void eatFood() {
        System.out.println("Dog Eat Food!!");
    }
}
