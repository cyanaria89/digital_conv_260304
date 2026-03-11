package 필드와메서드;

// 입력 받은 수가 소수인지 판별하는 메서드
// 소수 : 나누었을때 1과 자기자신 뿐인 수

import java.util.Scanner;

public class MethodEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        primeNumber pn = new primeNumber();

        System.out.print("소수인지 확인할 숫자 입력 : ");
        int num = sc.nextInt(); sc.nextLine();
        System.out.println(pn.pNumber(num));
    }
}

class primeNumber {
    String pNumber(int n) {
//        int k = (int)Math.sqrt(n);
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) cnt++;
        }
        if (cnt > 2) return "입력 받은 수 " + n + "(은)는 소수가 아닙니다.";
        return "입력 받은 수 " + n + "(은)는 소수 입니다.";
    }
}
