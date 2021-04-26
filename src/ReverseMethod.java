public class ReverseMethod {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(getStringReverse(str));
    }
    public static String getStringReverse(String str) {
        StringBuilder strB = new StringBuilder();
        strB = strB.append(str);
        strB = strB.reverse();
        return strB.toString();
    }
}
