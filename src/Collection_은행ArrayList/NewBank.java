package Collection_은행ArrayList;

// ArrayList 활용 예제

public class NewBank {
    private static int count = 0;   // 총 계좌 수 count
    private int id;                 // 계좌 식별용 id
    private int account;            // 계좌 잔액
    private String bank;            // 은행명
    private String name;            // 예금주명

    public NewBank(String bank, String name, int account) {
        this.bank = bank;
        this.name = name;
        this.account = account;
        count++;                    // 계좌 생성 개수
        this.id = count + 10000;    // 계좌 식별용 번호(= 계좌 번호)는 자동 생성
    }

    public static int getCount() {  // 계좌 생성 개수 반환, 클래스 메서드
        return count;
    }

    public int getId() { return id; }

    // 입금(deposit)
    public void deposit(final int money) {
        this.account += money;
    }

    // 출금(withdraw)
    public void withdraw(final int money) {
        if (this.account < money) {
            System.out.println("잔액이 부족합니다.");
        } else {
            this.account -= money;
        }
    }

    // 잔액 보기
    public void printAccount() {
        System.out.printf("은행명\t : %s\n예금주\t : %s\n계좌번호  : %d\n잔액\t\t : %,d원\n", bank, name, id, account);
    }
}
