package 은행ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        ArrayList<NewBank> bankList = new ArrayList<>();    // 참조 타입만 사용가능 (<int> X / <Integer> O)
        Scanner sc = new Scanner(System.in);
        String bankName, name;
        int account, id;

        while (true) {
            System.out.println("=".repeat(40));
            System.out.print("[1]계좌개설 [2]계좌선택 [3]전체조회 [4]총 계좌 수 [5]종료\n >> ");
            int menu = sc.nextInt(); sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("은행 명 : ");
                    bankName = sc.nextLine();
                    System.out.print("예금주 명 : ");
                    name = sc.nextLine();
                    System.out.print("초기 입금 액 : ");
                    account = sc.nextInt(); sc.nextLine();
                    bankList.add(new NewBank(bankName, name, account)); // list의 마지막에 새로운 객체 추가
                    break;
                case 2:
                    // 1.단 전체 계좌 목록을 보여줘!
                    System.out.println("---- 전체 계좌 목록 ----");
                    for (NewBank bank : bankList) {
                        bank.printAccount();
                        System.out.println("-".repeat(22));
                    }

                    // 2.제 계좌 번호 입력 해서 찾아!
                    System.out.print("계좌 번호 입력 : ");
                    id = sc.nextInt(); sc.nextLine();
                    NewBank selectedBank = null;    // null : 주소가 없음
                    for (NewBank bank : bankList) {
                        if (bank.getId() == id) {   // 입력 받은 계좌 번호로 조회
                            selectedBank = bank;
                            break;
                        }
                    }
                    if (selectedBank != null) {
                        while (true) {
                            System.out.print("[1]입금 [2]출금 [3]잔액 [4]이전\n >> ");
                            int subMenu = sc.nextInt();
                            sc.nextLine();

                            switch (subMenu) {
                                case 1:
                                    System.out.print("입금 금액 입력 : ");
                                    int deposit = sc.nextInt();
                                    sc.nextLine();
                                    selectedBank.deposit(deposit);
                                    break;
                                case 2:
                                    System.out.print("출금 금액 입력 : ");
                                    int withdraw = sc.nextInt();
                                    sc.nextLine();
                                    selectedBank.withdraw(withdraw);
                                    break;
                                case 3:
                                    selectedBank.printAccount();
                                    break;
                                case 4:
                                    System.out.println("이전 메뉴로 돌아갑니다.");
                                    break;
                                default:
                                    System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
                            }
                            if (subMenu == 4) break;
                        }
                    } else {
                        System.out.println("입금할 계좌가 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("---- 전체 계좌 목록 ----");
                    for (NewBank bank : bankList) {
                        bank.printAccount();
                        System.out.println("-".repeat(24));
                    }
                    break;
                case 4:
                    System.out.println("계좌 생성 개수 : " + NewBank.getCount() + "개");
                    break;
                case 5:
                    System.out.println("거래를 종료합니다.\n이용해주셔서 감사합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("없는 메뉴 입니다. 다시 선택해주세요.");
            }
        }
    }
}
