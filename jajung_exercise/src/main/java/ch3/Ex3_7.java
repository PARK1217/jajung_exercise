package ch3;

public class Ex3_7 {
    public static void main(String[] args) {
        //화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
        //변환공식이 'C = 5/9 X (F - 32)'라고 할 때,
        //(1)에 알맞은 코드를 넣으시오.
        //단, 변환 결과값은 소수점 셋째자리에서 반올림해야 한다.(Math.round()를 사용하지 않고 처리할 것)
        int fahrenheit = 100;
        float celcius = (int)((5/9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;

        System.out.println("Fahrneheit: " + fahrenheit);
        System.out.println("celcius 1 : " + celcius);

        float celcicusD = 5/9f * (fahrenheit - 32);

        System.out.println("celcius 2 : " + String.format("%.2f", celcicusD));
    }
}
