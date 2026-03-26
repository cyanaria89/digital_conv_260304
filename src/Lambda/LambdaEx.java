package Lambda;
/*
    람다(Lambda) : 간단한 익명의 함수를 생성하기 위한 방법
    - React에서 주로 사용할 예정
    - 람다 표현식은 주로 함수형 프로그래밍 스타일로 지원
    - (매개변수목록) -> {실행문};
    - 자바는 함수를 지원하지 않기 때문에 람다식을 사용하기 위해서는 함수형 인터페이스 필요
*/

class MyCalculator implements MyCalc {
    @Override
    public int sum(int x, int y) {
        return x + y;
    }
}

@FunctionalInterface
interface MyCalc { int sum(int x, int y); }

public class LambdaEx {
    public static void main(String[] args) {
        // 일반적인 자바 코드
        MyCalculator calc = new MyCalculator();
        System.out.println(calc.sum(28, 37));

        // 람다식
        MyCalc mc = (x, y) -> x + y;
        MyCalc mc1 = Integer::sum;
        System.out.println(mc.sum(28, 37) + " / " + mc1.sum(37, 28));
    }
}
