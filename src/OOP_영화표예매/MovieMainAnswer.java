package OOP_영화표예매;

// 해답 버전이므로 Answer를 붙임

import java.util.Scanner;

public class MovieMainAnswer {
    public static void main(String[] args) {
        // MovieTicket Class 에 대한 ticket 참조 변수에 MovieTicket() 객체의 주소를 대입
        MovieTicketAnswer ticket1 = new MovieTicketAnswer(12000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 영화 예매 시스템 =====");
            System.out.println("[1] 예매하기");
            System.out.println("[2] 취소하기");
            System.out.println("[3] 종료하기");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt(); sc.nextLine();

            switch (menu) {
                case 1:
                    ticket1.selectSeat();
                    break;
                case 2:
                    ticket1.cancelSeat();
                    break;
                case 3:
                    System.out.printf("총 판매 금액 : %,d원", ticket1.getTotalPrice());
                    System.exit(0);
                default:
                    System.out.println("메뉴 선택이 잘못 되었습니다.");
            }

        }
    }
}
