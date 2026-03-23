package HashMap응용;

import java.util.Scanner;
/*
    Map : Key와 Value의 쌍으로 이루어진 데이터를 저장하는 자료구조
    Key는 중복 금지 및 불가, Value는 상관없음
    순서를 보장하지 않음

    Hash Function : 임의의 길이 데이터를 고정된 길이로 매핑하는 함수
    HashCode : 자바에서는 객체의 메모리 주소값을 바탕으로 생성된 정수 값
    Hash Collision : 서로 다른 Key가 동일한 HashCode를 갖는 경우, 버킷 내에 여러 노드가 생기며, 성능 저하의 원인이 됨

    [1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료
    1. Menu 클래스
    2. MenuService
    3. HashMain UI
*/
public class HashMain {
    private static final MenuService service = new MenuService();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MenuService.initMenu();

        while (true) {
            System.out.println("[1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt(); sc.nextLine();

            switch (menu) {
                case 1: service.menuList(); break;
                case 2: service.searchMenu(); break;
                case 3: service.insertMenu(); break;
                case 4: service.removeMenu(); break;
                case 5: service.updateMenu(); break;
                case 6: System.out.println("프로그램을 종료합니다."); return;
                default: System.out.println("메뉴 선택이 잘 못 되었습니다.");
            }
        }
    }
}
