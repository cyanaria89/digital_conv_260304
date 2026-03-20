package 커피메뉴만들기;

import java.util.List;
import java.util.Scanner;

public class MenuMain {
    // MenuService 객체 생성
    private static final MenuService service = new MenuService();

    // Scanner 객체 생성
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("[1]조회 [2]등록 [3]수정 [4]삭제 [5]검색 [6]종료\n메뉴 선택 : ");
            int menu = sc.nextInt(); sc.nextLine();

            switch (menu) {
                case 1:
                    displayMenuList(service.getMenuList());
                    break;
                case 2:
                    service.addMenu(inputMenu());
                    break;
                case 3:
                    updateMenu();
                    break;
                case 4:
                    deleteMenu();
                    break;
                case 5:
                    searchMenu();
                    break;
                case 6:
                    System.out.println("메뉴를 종료합니다.");
                    return;
                default:
            }
        }
    }

    // [1] 전체 조회
    private static void displayMenuList(List<CoffeeMenu> menuList) {
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + " : " + menuList.get(i));
        }
    }

    // [2] 신규 메뉴 입력 후 메뉴 객체 반환
    private static CoffeeMenu inputMenu() {
        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("가격 : ");
        int price = sc.nextInt(); sc.nextLine();

        System.out.print("분류 : ");
        String category = sc.nextLine();

        System.out.print("설명 : ");
        String description = sc.nextLine();

        System.out.print("세금 [1]포함 [2]별도 : ");
        boolean tax = (sc.nextInt() == 1); sc.nextLine();

        return new CoffeeMenu(name, price, category, description, tax);
    }

    // [3] 메뉴 수정
    private static void updateMenu() {
        displayMenuList(service.getMenuList());
        System.out.print("수정 할 메뉴의 번호 : ");
        int index = sc.nextInt() - 1; sc.nextLine();
        if (service.updateMenu(index, inputMenu())) System.out.println("수정 완료");
        else System.out.println("수정 실패 : 번호 확인 필요");
    }

    // [4] 메뉴 삭제
    private static void deleteMenu() {
        displayMenuList(service.getMenuList());
        System.out.print("삭제 할 메뉴의 번호 : ");
        int index = sc.nextInt() - 1; sc.nextLine();
        if (service.deleteMenu(index)) System.out.println("삭제 완료");
        else System.out.println("삭제 실패 : 번호 확인 필요");
    }

    // [5] 메뉴 검색
    private static void searchMenu() {
        System.out.print("이름이나 가격 입력 : ");
        String keyword = sc.nextLine();
        System.out.println(service.searchMenu(keyword));
    }
}
