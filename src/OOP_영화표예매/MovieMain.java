package OOP_영화표예매;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // MovieTicket Class를 사용해 객체 생성
        MovieTicket ticket = new MovieTicket(12000);

        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 반복문 (메뉴 구현)
        while (true) {
            // 메뉴 출력 및 메뉴 선택
            System.out.println("-------- OX 영화관 예매 시스템 --------");
            System.out.println(" [1] 예매하기 [2] 취소하기 [3] 종료하기");
            System.out.println("-".repeat(37));
            System.out.print("메뉴를 선택해주세요 : ");
            int menu = sc.nextInt(); sc.nextLine();

            System.out.println();

            // 선택 메뉴 실행
            switch (menu) {
                case 1:
                    ticket.selectSeat();
                    break;
                case 2:
                    ticket.cancelSeat();
                    break;
                case 3:
                    System.out.printf("총 판매 금액 : %,d원\n", ticket.totalCost());
                    System.out.println("-".repeat(37));
                    return;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}
