package 예외처리_사용자예외클래스;

import java.util.Scanner;

/*
    자바에서 제공하는 예외클래스가 사용 목적에 맞지 않을 때 직접 예외 클래스를 만들어 사용할 수 있음
*/
public class CustomEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 값 입력 : ");
        int n = sc.nextInt();

        CheckEven ce = new CheckEven();     // 짝수 체크 객체 생성
        ce.setNum(n);

        try {
            System.out.println(ce.printEven());
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

class CustomException extends Exception {
    private Integer number = null;

    public CustomException(Integer number) {
        this.number = number;
    }

    @Override
    public String getMessage() {
        if (number == null) return "Number is Null";
        else return Integer.toString(number) + " is Not Even";
    }
}

class CheckEven {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int printEven() throws CustomException {     // 예외 던지기
        if (num % 2 == 0) return num;
        else throw new CustomException(num);            // 예외 객체 생성
    }
}