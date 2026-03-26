package OOP_영화표예매;

import java.util.Scanner;

public class MovieTicketAnswer {
    // 인스턴스 필드로 좌석 10개를 저장하는 배열 생성
    // private - 클래스 내부 메서드로만 접근 가능
    // final - 선언 후 변경 불가 (아래 배열의 경우 주소값을 저장하기 때문에 배열 내의 값은 변경 가능)
    private final int[] seat;   // 10개 좌석에 대한 배열의 참조 변수 생성
    int price;
    private Scanner sc;

    // 생성자를 통해서 가격을 전달 받음
    MovieTicketAnswer (int price) {
        seat = new int[10]; // 참조 변수에 생성된 배열의 주소를 대입
        this.price = price;
        sc = new Scanner(System.in);
    }

    // 좌석 상태 출력
    public void printSeat() {
        for (int e : seat) {
            System.out.print(e == 0 ? "[ ]" : "[V]");   // 0 : 비었음, 1 : 예매됨
        }
        System.out.println();
    }

    // 입력 받은 좌석 번호 유효성 체크 : 1 ~ 10 사이 확인
    private boolean isValidSeatNum(int seatPosition) {
        return (seatPosition >= 1 && seatPosition <= 10);
    }

    // 좌석 예매
    public void selectSeat() {
        printSeat();    // 현재 좌석 상태 확인
        System.out.print("예매할 좌석 번호(1 ~ 10) : ");
        int num = sc.nextInt(); sc.nextLine();
        if (!isValidSeatNum(num)) {
            System.out.println("좌석번호가 잘못 입력되었습니다.");
            return;
        }
        if ((seat[num - 1]) == 0) {
            seat[num - 1] = 1;  // 예매 하기
            System.out.println(num + "번 좌석 예매 완료");
            printSeat();    // 예매 완료 후 좌석 상태 확인
        } else {
            System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
        }
    }

    // 좌석 취소
    public void cancelSeat() {
        printSeat();    // 현재 좌석 상태 확인
        System.out.print("취소할 좌석 번호(1 ~ 10) : ");
        int num = sc.nextInt(); sc.nextLine();
        if (!isValidSeatNum(num)) {
            System.out.println("좌석번호가 잘못 입력되었습니다.");
            return;
        }
        if ((seat[num - 1]) == 1) {
            seat[num - 1] = 0;  // 취소 하기
            System.out.println(num + "번 좌석 예매 취소 완료");
            printSeat();    // 취소 완료 후 좌석 상태 확인
        } else {
            System.out.println("해당 좌석은 예매되어 있지 않습니다.");
        }
    }

    // 총 판매 금액 반환
    public int getTotalPrice() {
        int cnt = 0;
        for (int e : seat) {
            if (e == 1) cnt++;  // 판매된 좌석개수 누적
        }
        return cnt * price;
    }
}
