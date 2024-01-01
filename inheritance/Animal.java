package inheritance;

public class Animal {
    String name;
    String kind;
    int legCount;
    int iq;
    boolean hasWing;

    public Animal(String name, String kind, int legCount, int iq, boolean hasWing) {
        this.name = name;
        this.kind = kind;
        this.iq = iq;
        this.legCount = legCount;
        this.hasWing = hasWing;
    }

    public void move() {
        System.out.println("Move!!");
    }

    public void eatFood() {
        System.out.println("EatFood!");
    }
}
