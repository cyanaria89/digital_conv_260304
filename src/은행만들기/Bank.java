package 은행만들기;
/*
    정적 멤버(필드) : static 키워드 사용, 클래스 생성 시 생성, 객체 생성 시 생성되지 않음
    정적 메서드 : static 키워드 사용
*/
public class Bank {
    private static int count = 0;   // 정적 필드, Bank Class 생성 시 생성되는 값
    private int money;              // 잔액 누적 위한 인스턴스 필드(객체 생성 시 만들어짐)
    private String bank;            // 은행명, 인스턴스 필드

    public Bank(String bank, int money) {
        this.bank = bank;
        this.money = money;
        count++;    // 생성자 호출 시 값 증가
        System.out.printf("%s 은행에 계좌를 개설합니다.\n" + "잔액은 %,d원 입니다.\n", bank, money);
    }

    public static int getCount() {  // 정적 메서드, 클래스 생성 시 생성
        return count;
    }

    public String getBank() { return bank; }
    // final int money -> 입금액 / 출금액 이 중간에 변하지 않도록 고정
    // 입금(deposit)
    public void deposit(final int money) {
        this.money += money;
    }
    // 출금(withdraw)
    public void withdraw(final int money) {
        if (this.money < money) {
            System.out.println("잔액이 부족합니다.");
        } else {
            this.money -= money;
        }
    }

    public void accountInfo() {
        System.out.println("-- Account Info --");
        System.out.printf("은행명 : %s\n잔액 : %,d원\n", bank, money);
        System.out.println("-".repeat(18));
    }

}
