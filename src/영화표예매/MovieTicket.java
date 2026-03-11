package 영화표예매;

// 좌석 10개 (배열)
// 빈 좌석 [ ], 예매 좌석 [V]
// 영화표 가격은 생성자에서 매개변수로 전달 받음
// 필요 메서드 - 생성자, 좌석 상태 출력, 예매, 취소, 총 판매금액

import java.util.Scanner;

public class MovieTicket {
    // 좌석 10개 생성
    int[] seat;

    // 좌석 가격에 대한 인스턴스 필드 생성
    private int cost;

    // 입력을 받기 위한 스캐너 생성
    Scanner sc;

    // 생성자 - 매개변수로 가격을 전달 받음
    MovieTicket(int cost) {
        seat = new int[10];
        this.cost = cost;
        sc = new Scanner(System.in);
    }

    // 좌석 상태 출력
    void printSeat() {
         for (int e : seat) {
             System.out.print(e == 0 ? "[ ]" : "[V]");
         }
         System.out.println();
    }

    // 예매 Reservation
    void selectSeat() {
        printSeat();
        System.out.print("예매할 좌석 번호(1 ~ 10) : ");
        int seatNum = sc.nextInt(); sc.nextLine();
        System.out.println();

        if (seatNum > 10 || seatNum < 1) {
            System.out.println("좌석은 1번 부터 10번 까지만 있습니다.");
            System.out.println("-".repeat(37));
            return;
        }

        if (seat[seatNum - 1] == 0) {
            seat[seatNum - 1] = 1;
            System.out.println(seatNum + "번 좌석 예매 완료");
            printSeat();
            System.out.println("-".repeat(37));
        } else {
            System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
            System.out.println("-".repeat(37));
        }
    }

    // 취소 Cancel
    void cancelSeat() {
        printSeat();
        System.out.print("취소할 좌석 번호(1 ~ 10) : ");
        int seatNum = sc.nextInt(); sc.nextLine();
        System.out.println();

        if (seatNum > 10 || seatNum < 1) {
            System.out.println("좌석은 1번 부터 10번 까지만 있습니다.");
            System.out.println("-".repeat(37));
            return;
        }

        if (seat[seatNum - 1] == 1) {
            seat[seatNum - 1] = 0;
            System.out.println(seatNum + "번 좌석 예매 취소 완료");
            printSeat();
            System.out.println("-".repeat(37));
        } else {
            System.out.println("예약 되지 않은 좌석입니다.");
            System.out.println("-".repeat(37));
        }
    }

    // 총 판매 금액 TotalCost
    int totalCost() {
        int cnt = 0;
        for (int e : seat) {
            if (e == 1) cnt++;
        }
        return (cost * cnt);
    }

}
