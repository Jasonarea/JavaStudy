package inheritance;

public class ChildOverriding extends ParentOverridingPrivate {
    public ChildOverriding() {
        System.out.println("ChildOverriding Constructor");
    }

    public void printName() { // 동일한 시그니쳐를 가진다.
        System.out.println("ChildOverriding printName()");
    }
}
