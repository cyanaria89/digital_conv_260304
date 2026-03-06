package 표준입력;

import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args) {
        // 키보드를 통한 입력을 받기 위해 스캐너 클래스에 대한 객체 생성
        Scanner sc = new Scanner(System.in);

//        byte a = sc.nextByte(); // 스캐너 객체를 통해 byte 타입의 값을 입력 받아 a 변수에 대입
//        short b = sc.nextShort();
//        int c = sc.nextInt();
//        long d = sc.nextLong();
//        float e = sc.nextFloat();
//        double f = sc.nextDouble();
//
//        // 문자와 문자열
//        String name = sc.next(); // 공백 기준으로 문자열 입력 받음
//        String addr = sc.nextLine(); // 줄 바꿈 기준으로 문자열 입력 받음
//        char ch = sc.next().charAt(0); // 문자열에서 1개의 글자만 추출, 0 부터 시작

        // 이름 next()
        // 주소 nextLine()
        // 성별 next().charAt(0) - 'M' / 'F' 로 입력 받아서 출력은 "남성", "여성" 출력
        // 직업 [1] 회사원 [2] 학생 [3] 주부 [4] 무직 - 정수로 입력 받아 문자열로 출력
        // 나이 nextInt()

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String addr = sc.nextLine();
        System.out.print("성별을 \'M\' 또는 \'F\' 로 입력하세요 : ");
        char genderChar = sc.next().toUpperCase().charAt(0);
        sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("해당하는 직업의 번호를 입력하세요\n");
        System.out.print("[1]회사원  [2]학생  [3]주부  [4]무직  [5]기타\n");
        System.out.print("입력 : ");
        int jobInt = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        String gender;
        String job;
        if (genderChar == 'M') {
            gender = "남성";
        } else if (genderChar == 'F') {
            gender = "여성";
        } else {
            gender = "입력 오류";
        }
        switch (jobInt) {
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
                job = "입력 오류";
        }
        System.out.println("=".repeat(28));
        System.out.println("\t이름\t : \t" + name);
        System.out.println("\t주소\t : \t" + addr);
        System.out.println("\t성별\t : \t" + gender);
        System.out.println("\t나이\t : \t" + age);
        System.out.println("\t직업\t : \t" + job);
        System.out.println("=".repeat(28));

        /* 삼항연산자 사용
           char genderChar = sc.next().toUpperCase().charAt(0);
           gender == 'M' ? "남성" : "여성" */
        // gender == 'M' ? "남성" : gender == 'F' ? "여성" : "입력오류"
        /* 배열 사용
           int job = sc.nextInt();
           String[] jobs = { "", "회사원", "학생", "주부", "무직", "기타" }
           jobs[job] */

    }
}
