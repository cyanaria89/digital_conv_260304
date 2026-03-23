package HashMap응용;

import java.util.Scanner;

public class HashMainA {
    // 다른 메서드에서 사용하게 하기 위해서 main 밖에 작성함
    private static final MenuServiceA serviceA = new MenuServiceA();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        serviceA.initMenu();

        while (true) {
            System.out.println("[1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt(); sc.nextLine();
            String key, category, description;
            int price;

            switch (menu) {
                case 1:
                    serviceA.menuList();
                    break;
                case 2:
                    System.out.print("조회 할 메뉴 입력 : ");
                    serviceA.searchMenu(sc.nextLine());
                    break;
                case 3:
                    System.out.print("추가 할 메뉴 입력 : ");
                    key = sc.nextLine();
                    System.out.print("가격 : ");
                    price = sc.nextInt(); sc.nextLine();
                    System.out.print("분류 : ");
                    category = sc.nextLine();
                    System.out.print("설명 : ");
                    description = sc.nextLine();
                    serviceA.insertMenu(key, price, category, description);
                    break;
                case 4:
                    System.out.print("삭제 할 메뉴 입력 : ");
                    serviceA.removeMenu(sc.nextLine());
                    break;
                case 5:
                    System.out.print("수정 할 메뉴 입력 : ");
                    key = sc.nextLine();
                    System.out.print("가격 : ");
                    price = sc.nextInt(); sc.nextLine();
                    System.out.print("분류 : ");
                    category = sc.nextLine();
                    System.out.print("설명 : ");
                    description = sc.nextLine();
                    serviceA.updateMenu(key, price, category, description);
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴 선택이 잘못 되었습니다.");
            }
        }
    }
}
