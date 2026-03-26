package 예외처리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
    예외처리 : 프로그램의 비정상적인 상황을 감지해 적절한 예외처리를 해서 정상적인 실행상태를 유지하도록 하는 것
    checked 예외 : 자바 컴파일러가 반드시 예외처리를 확인 (예외처리가 안되어 있으면 컴파일 오류 발생)
    - ex) IOException
    unchecked 예외 : 컴파일러가 예외처리를 강제하지 않음 (따로 예외처리를 하지 않아도 되지만 실행 중 예외가 발생하면 프로그램 중단)
    - ex) NullPointerException
*/
public class ExceptionMain {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException
        int[] arr = new int[5];             // 5칸 짜리 정수형 배열 생성

        for (int i = 0; i < arr.length; i++) {  // 정상
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        try {
            for (int i = 0; i <= arr.length; i++) { // ArrayIndexOutOfBoundsException 발생
                arr[i] = i;
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // InputMismatchException, ArithmeticException
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, rst = 0;
        while (true) {
            try {
                System.out.println("나눗셈 계산기");
                System.out.print("첫 번째 수 : ");
                num1 = sc.nextInt();
                System.out.print("두 번째 수 : ");
                num2 = sc.nextInt();
                rst = num1 / num2;
                break;
            } catch (InputMismatchException e) {
                System.out.println("문자 입력 NoNo~\n정수로 입력 OK~");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("0으로 나누면 오류생김!");
            }
        }
        System.out.println(num1 + " / " + num2 + " = " + rst);

        // IOException
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("없는 파일"));
            br.readLine();
        } catch (IOException e) {
            System.out.println("파일이 없거나 읽을 수 없습니다.");
        } finally {     // Exception 여부와 관계없이 실행
            try {
                if (br != null) br.close();
            } catch (IOException ignored) {
            }
        }
    }
}
