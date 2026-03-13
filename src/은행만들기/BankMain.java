package 은행만들기;

import java.util.Scanner;

// class 에 final 이 붙으면 상속 불가능
// ex) public final class Math() { ... }
// 주석 처리 부분은 해답
public class BankMain {
    public static void main(String[] args) {
        /*
            Scanner sc = new Scanner(System.in);
            Bank kakao = new Bank("kakao", 1000);
            Bank shinhan = new Bank("shinhan", 1000);
            System.out.print("[1]입금 [2]출금 [3]조회 [4]계좌 생성 수 [5]종료 : ");
            int menu = sc.nextInt();

        */
        Bank[] banks = new Bank[10];
        banks[0] = new Bank("NH", 1000000);
        banks[1] = new Bank("KB", 5000000);
        Scanner sc = new Scanner(System.in);

        // 입금, 출금, 잔액 조회 메뉴 만들기
        // 계좌 생성 갯수 확인 : count
        while (true) {
            System.out.println("----------- 24H ATM ----------");
            System.out.print("메뉴를 선택하세요.\n" +
                             "[1] 입금  [2] 출금  [3] 조회\n" +
                             "[4] 계좌 생성 수  [5] 종료\n" +
                             " >> : ");
            int menu = sc.nextInt(); sc.nextLine();
            System.out.println("------------------------------");

            int money = 0;
            String b = "";
            switch (menu) {
                case 1:
                    /*
                        System.out.print("입금 금액을 입력하세요 : ");
                        money = sc.nextInt();
                        kakao.deposit(money);
                        break;
                    */
                    System.out.print("입금하실 은행을 입력해 주십시오. : ");
                    b = sc.nextLine().toUpperCase();
                    for (int i = 0; i < banks.length; i++) {
                        if ((banks[i].getBank()).equals(b)) {
                            System.out.print("입금하실 금액을 입력해 주십시오. : ");
                            money = sc.nextInt(); sc.nextLine();
                            banks[i].deposit(money);
                            break;
                        }
                    }
                    System.out.println("해당 은행의 계좌가 없습니다.");
                    break;
                case 2:
                    /*
                        System.out.print("출금 금액을 입력하세요 : );
                        money = sc.nextInt();
                        kakao.withdraw(money);
                        break;
                    */
                    System.out.print("출금하실 은행을 입력해 주십시오. : ");
                    b = sc.nextLine().toUpperCase();
                    for (int i = 0; i < banks.length; i++) {
                        if ((banks[i].getBank()).equals(b)) {
                            System.out.print("출금하실 금액을 입력해 주십시오. : ");
                            money = sc.nextInt();
                            banks[i].withdraw(money);
                            break;
                        }
                    }
                    System.out.println("해당 은행의 계좌가 없습니다.");
                    break;
                case 3:
                    /*
                        kakao.accountInfo();
                        break;
                    */
                    System.out.print("조회할 은행명을 입력해 주십시오. : ");
                    b = sc.nextLine().toUpperCase();
                    for (int i = 0; i < banks.length; i++) {
                        if ((banks[i].getBank()).equals(b)) {
                            banks[i].accountInfo();
                            break;
                        }
                    }
                    System.out.println("해당 은행의 계좌가 없습니다.");
                    break;
                case 4:
                    /*
                        System.out.println("계좌 생성 개수 : " + Bank.getCount());
                        break;
                    */
                    System.out.println("총 생성된 계좌 수 : " + Bank.getCount() + "개");
                    break;
                case 5:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("해당 번호는 없는 메뉴입니다.");
            }
        }

    }
}
