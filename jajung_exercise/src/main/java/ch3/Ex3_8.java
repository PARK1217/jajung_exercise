package ch3;

public class Ex3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = a + b;

        char ch = 'A';
        char ch2 = (char) (ch + 2);

        float f = 3/2f;
        long l = (long) 3000 * 3000 * 3000;

        float f2 = 0.1f;
        double d = 0.1;

        boolean result = (float) d==f2;

        System.out.println("c=" + c);
        System.out.println("ch=" + ch2);
        System.out.println("f=" + f);
        System.out.println("l=" + l);
        System.out.println("result = " + result);

    }
}
