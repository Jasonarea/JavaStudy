package string.practice;

public class UseStringMethod {
    public static void main(String[] args) {
        UseStringMethod method = new UseStringMethod();
        String text = "The String class represents character strings";
        method.printWords(text);
        method.findString(text, "string");
        method.findAnyCaseString(text, "string");
        method.countChar(text, 's');
        method.printContainWords(text, "ss");
    }

    public void printWords(String str) {
        String []splits = str.split(" ");
        for(String temp : splits) {
            System.out.println(temp);
        }
    }

    public void findString(String str, String findStr) {
        int idx = str.indexOf(findStr);
        System.out.println(findStr + " is appeared at " + idx);
    }

    public void findAnyCaseString(String str, String findStr) {
        String lowerConvertedStr = str.toLowerCase();
        int idx = lowerConvertedStr.indexOf(findStr);
        System.out.println(findStr + " is appeared at " + idx);
    }

    public void countChar(String str, char c) {
        int count = 0;
        char []charArray = str.toCharArray();
        for(int i = 0;i<str.length();i++) {
            if(charArray[i] == c) count++;
        }
        System.out.println("char " + c + " count is " + count);
    }

    public void printContainWords(String str, String findStr) {
        String []splits = str.split(" ");
        for(String temp : splits) {
            if(temp.contains(findStr)) {
                System.out.println(temp + " contains " + findStr);
            }
        }
    }
}
