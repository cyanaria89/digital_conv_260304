package OOP_필드와메서드;

// 입력 받은 수가 소수인지 판별하는 메서드
// 소수 : 나누었을때 1과 자기자신 뿐인 수

import java.util.Scanner;

public class MethodEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        primeNumber pn = new primeNumber();

        System.out.print("숫자 입력 : ");
        int num = sc.nextInt(); sc.nextLine();
        System.out.println(pn.pNumber(num));
        System.out.println(num + "은 " + (pn.isPrime(num) ? "소수입니다." : "소수가 아닙니다."));
    }
}

class primeNumber {
    String pNumber(int n) {
//        int k = (int)Math.sqrt(n);
        int cnt = 0;
        if (n <= 1) return n + "(은)는 소수가 아닙니다.";
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) cnt++;
        }
        if (cnt > 2) return n + "(은)는 소수가 아닙니다.";
        return n + "(은)는 소수 입니다.";
    }
    // Answer
    boolean isPrime (int num) {
        if (num <= 1) return false;         // 1과 같거나 작으면 소수가 아님
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false; // 1과 자기자신 외의 수로 나누어지면 소수가 아님
        }
        return true;                        // 나누어지지 않았기 때문에 소수
    }
}
