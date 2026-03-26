package 제어문_자판기프로그램;

// 자판기 구현하기
// 투입금액, 메뉴 번호 입력
// 메뉴번호에 따른 상품명과 가격 결정 (switch문)
// 투입금액이 부족하면 부족 금액 출력
// 금액이 충분하면 상품과 거스름돈 출력
// (없는 메뉴 선택시 안내 메시지 출력하고 종료)
// 메뉴 선택이 잘못된 경우 재입력 요구

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int insertCoin = 0, menuNum = 0, change = 0, price = 0;
        int coke = 2300, cider = 2000, coffee = 2700, water = 1000;
        String choice = "";
        // 지역 변수는 Block Scope를 따르기 때문에 while 밖에서 정의

        System.out.println("=".repeat(24));
        System.out.println("\t🥤 자판기입니다~!!");
        System.out.println("=".repeat(24));
        System.out.printf("%s\t\t-\t%,d%c\n", "1. 콜라", coke, '원');
        System.out.printf("%s\t-\t%,d%c\n", "2. 사이다", cider, '원');
        System.out.printf("%s\t\t-\t%,d%c\n", "3. 커피", coffee, '원');
        System.out.printf("%s\t\t-\t%,d%c\n", "4. 생수", water, '원');
        System.out.println("0. 취소");
        System.out.println("=".repeat(24));

        System.out.print("투입 금액 입력 : ");
        insertCoin = sc.nextInt();
        sc.nextLine();

        do {
            System.out.print("메뉴 번호 선택 : ");
            menuNum = sc.nextInt();
            sc.nextLine();

            System.out.println("=".repeat(24));

            switch (menuNum) {
                case 0:
                    System.out.printf("금액을 반환합니다.\n반환 금액\t: %d원\n", insertCoin);
                    System.out.println("=".repeat(24));
                    System.out.println("이용해주셔서 감사합니다!");
                    return;
                case 1:
                    choice = "콜라";
                    price = coke;
                    change = insertCoin - price;
                    break;
                case 2:
                    choice = "사이다";
                    price = cider;
                    change = insertCoin - price;
                    break;
                case 3:
                    choice = "커피";
                    price = coffee;
                    change = insertCoin - price;
                    break;
                case 4:
                    choice = "생수";
                    price = water;
                    change = insertCoin - price;
                    break;
                default:
                    System.out.println("❌ 없는 메뉴입니다.");
                    System.out.println("메뉴를 다시 선택해주세요.");
                    System.out.println("=".repeat(24));
                    System.out.println("투입 급액\t: " + insertCoin + "원");
                    break;
            }
        } while (menuNum > 4 || menuNum < 0);

        sc.close();

        if (change >= 0) {
            System.out.printf(
                "✅%s가 나왔습니다!\n투입 금액\t: %d원\n상품 금액\t: %d원\n거스름돈\t\t: %d원\n",
                choice, insertCoin, price, change
            );
        } else {
            System.out.printf(
                    "❌ 잔액이 부족합니다.\n투입 금액\t: %d원\n필요 금액\t: %d원\n부족 금액\t: %d원\n",
                    insertCoin, price, (change * -1)
            );
        }
        System.out.println("=".repeat(24));
        System.out.println("이용해주셔서 감사합니다!");

    }
}
