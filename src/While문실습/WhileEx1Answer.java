package While문실습;

import java.util.Scanner;

public class WhileEx1Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next();

        int age;
        while (true) {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            if (age >= 0 && age < 200) break;
            System.out.println("나이 입력이 잘 못 되었습니다.");
        }

        char gender;
        while (true) {
            System.out.print("성별을 입력 하세요 [M/F] : ");
            gender = sc.next().toLowerCase().charAt(0);
            if (gender == 'm' || gender == 'f') break;
            System.out.print("성별을 잘 못 입력하였습니다.");
        }

        int job;
        while (true) {
            System.out.print("직업을 입력 하세요\n[1]회사원 [2]학생 [3]주부 [4]무직\n : ");
            char jobTmp = sc.next().charAt(0);
            if (Character.isDigit(jobTmp)) { // 숫자로 변환 가능 한지 확인
                job = (int) jobTmp - '0'; // ASCII 코드 값으로 계산, '0' = 48
                if (job >= 1 && job <= 4) break;
                else System.out.println("직업 선택 코드가 잘 못 되었습니다.");
            } else {
                System.out.println("직업 코드는 숫자로 입력 하세요.");
            }
        }

//        final String[] jobs = {"", "회사원", "학생", "주부", "무직"};
        final String[] jobs = {"회사원", "학생", "주부", "무직"};

        System.out.println("=".repeat(6) + "회원정보" + "=".repeat(6));
        System.out.println("\t이름 : " + name);
        System.out.println("\t나이 : " + age);
        System.out.println("\t성별 : " + (gender == 'm' ? "남성" : "여성"));
        System.out.println("\t직업 : " + jobs[job-1]);
        System.out.println("=".repeat(19));
    }
}
