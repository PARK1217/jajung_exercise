package ch3;

public class Ex3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = ('a' <= ch && ch >= 'z' || 'A' <= ch && ch >= 'Z' || '0'<= ch && '9' <=ch );

        System.out.println(b);
    }
}
