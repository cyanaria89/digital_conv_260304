package 예외처리_실습;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);
        Scanner sc = new Scanner(System.in);
        int menu = 0, amount = 0;

        while (true) {
            try {
                System.out.println("========== BANK MENU ==========");
                System.out.println("[1]입금 [2]출금 [3]조회 [0]종료");
                System.out.print("▶ ");
                menu = sc.nextInt();
                sc.nextLine();
                switch (menu) {
                    case 1:
                        System.out.print("입금할 금액 입력 : ");
                        amount = sc.nextInt();
                        sc.nextLine();
                        account.desosit(amount);
                        break;
                    case 2:
                        System.out.print("출금할 금액 입력 : ");
                        amount = sc.nextInt();
                        sc.nextLine();
                        account.withdraw(amount);
                        break;
                    case 3:
                        System.out.printf("잔액 : %,d원\n", account.getBalance());
                        break;
                    case 0:
                        System.out.printf("최종 잔액 : %,d원\n", account.getBalance());
                        System.out.println("메뉴를 종료합니다.");
                        return;
                    default:
                        System.out.println("메뉴 선택 오류");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
