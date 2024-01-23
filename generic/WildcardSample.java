package generic;

public class WildcardSample {

    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }

    public void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }

    /* 매개변수로 STRING을 사용한 객체만 받을 수 있다. 오버로딩도 불가하다*/
    public void wildcardStringMethod(WildcardGeneric<?> c) {
        Object value = c.getWildcard();
        if(value instanceof String) {
            System.out.println(value);
        }
    }

}
