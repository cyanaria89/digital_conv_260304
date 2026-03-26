package 제어문_While_실습;

// 이름은 문자열로 입력
// 나이는 정수로 입력, 0 ~ 199까지는 정상 입력, 그 외는 "잘못 입력 되었습니다." 출력 후 재입력 요구
// 성별은 문자로 입력, M, m, F, f 만 정상 입력, 그 외는 재입력 요구
// 직업 정수로 입력, 1. 회사원 / 2. 학생 / 3. 주부 / 4. 무직, 1 ~ 4 아니면 재입력 요구, 출력은 문자열로
// 모든 입력이 정상이면 출력

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "", job = "";
        int age = 0, jobNum = 0;
        char gender;

        System.out.print("이름 : ");
        name = sc.next();
        sc.nextLine();

        while (true) {
            System.out.print("나이 : ");
            age = sc.nextInt();
            sc.nextLine();
            if (age >= 0 && age < 200) break;
            System.out.println("=".repeat(20));
            System.out.println("나이 입력이 잘못 되었습니다.\n다시 입력해주세요.");
        }

        while (true) {
            System.out.print("성별 : ");
            gender = sc.next().toUpperCase().charAt(0);
            if (gender == 'M' || gender == 'F') break;
            System.out.println("-".repeat(20));
            System.out.println("성별 입력이 잘못되었습니다.\n\'M\' 또는 \'F\'로 입력해주세요.");
        }

        while (true) {
            System.out.print("[1]회사원 [2]학생 [3]주부 [4]무직 [5]기타\n해당하는 직업의 번호를 입력 : ");
            jobNum = sc.nextInt();
            sc.nextLine();
            switch (jobNum) {
                case 1:
                    job = "회사원";
                    break;
                case 2:
                    job = "학생";
                    break;
                case 3:
                    job = "주부";
                    break;
                case 4:
                    job = "무직";
                    break;
                case 5:
                    job = "기타";
                    break;
                default:
                    System.out.println("-".repeat(20));
                    System.out.println("직업 입력이 잘못되었습니다.\n1 ~ 5 중에서 입력해주세요.");
                    continue;
            }
            break;
        }

        System.out.println("=".repeat(20));
        System.out.println("\t이름 : " + name + "\n\t나이 : " + age + "세\n\t성별 : " + (gender == 'M' ? "남성" : "여성") + "\n\t직업 : " + job);
        System.out.println("=".repeat(20));
    }
}
