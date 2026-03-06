package 시스템출력실습;

public class SystemOutEx {
    public static void main(String[] args) {
//        System.out.println("================================");
        System.out.println("=".repeat(32));
        System.out.println("\t\t나를 소개합니다!");
        System.out.println("=".repeat(32));
        System.out.println("이름\t\t: 홍준희");
        System.out.println("나이\t\t: 37세");
        System.out.println("취미\t\t: 독서, 게임, 산책");
        System.out.println("한마디\t: \"머리가 안돌아가요..ㅠ\"");
        System.out.println("=".repeat(32));
        System.out.println("\n");
        System.out.println("=".repeat(32));
        System.out.printf("\t☕ JAVA CAFE 영수증\n");
        System.out.println("=".repeat(32));
//        System.out.printf("%-12s", "아메리카노");
//        System.out.printf("\t%d잔\t\t", 2);
//        System.out.printf("%,3d원\n", 9000);
        System.out.printf("%-10s \t%3s \t%,6d원\n", "아메리카노", "2잔", 9000);
//        System.out.printf("%-12s", "카페라떼");
//        System.out.printf("\t%d잔\t\t", 1);
//        System.out.printf("%,3d원\n", 5500);
        System.out.printf("%-10s \t%3s \t%,6d원\n", "카페라떼", "1잔", 5500);
//        System.out.printf("%-12s", "치즈케이크");
//        System.out.printf("\t%d조각\t", 1);
//        System.out.printf("%,3d원\n", 6800);
        System.out.printf("%-10s \t%3s \t%,6d원\n", "치즈케이크", "1조각", 6800);
        System.out.println("-".repeat(32));
        System.out.printf("%-16s \t%,6d원\n", "합\t계", 21300);
        System.out.println("=".repeat(32));
        System.out.printf("감사합니다. 또 방문해주세요!\n");
        System.out.println("\n");
        System.out.print("┌");
        System.out.print("─".repeat(16));
        System.out.println("┐");
        System.out.println("\t구구단 3단");
        System.out.print("└");
        System.out.print("─".repeat(16));
        System.out.println("┘");
        for (int i = 1; i < 10; i++) {
            System.out.printf("\t%d × %d = %2d\n", 3, i, 3*i);
        }


    }
}
