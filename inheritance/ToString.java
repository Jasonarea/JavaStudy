package inheritance;

import model.MemberDTO;

public class ToString {
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        thisObject.toStringMethod(thisObject);
        System.out.println();
        thisObject.toStringMethod2();


        MemberDTO dto = new MemberDTO("Sangmin", "01012345679", "helloworld@naver.com");
        System.out.println(dto);
    }

    public void toStringMethod(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus " + obj);
    }

    public void toStringMethod2() {
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus " + this);
    }

    @Override
    public String toString() {
        return "ToString Class";
    }
}
