package Collection_HashMap응용;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuService {
    private static final Map<String, Menu> map = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void initMenu() {
        map.put("Americano", new Menu("Americano", 2000, "Coffee", "기본 커피"));
        map.put("Espresso", new Menu("Espresso", 1500, "Coffee", "진한 커피"));
        map.put("Latte", new Menu("Latte", 4000, "Coffee", "우유 포함"));
    }

    // 전체 조회
    public void menuList() {
        System.out.println("========== 전체 메뉴 보기 ==========");
        for (String key : map.keySet()) {       // Map에서 Key를 뽑아서 Key를 기준으로 반복 순회
            System.out.println(map.get(key));   // Key 값으로 Entity(Key, Value) 가져옴
        }
    }

    // 메뉴 검색
    public void searchMenu() {
        System.out.print("조회할 메뉴 입력 : ");
        String key = sc.nextLine();
        if (map.containsKey(key)) {             // Map에 해당 키가 존재 하는지 여부 확인
            System.out.println(map.get(key));
        } else System.out.println("해당 메뉴가 존재하지 않습니다.");
    }

    // 메뉴 추가
    public void insertMenu() {
        System.out.print("추가 할 메뉴 입력 : ");
        String key = sc.nextLine();
        if (!map.containsKey(key)) {
            System.out.print("가격 입력 : ");
            int price = sc.nextInt(); sc.nextLine();
            System.out.print("분류 입력 : ");
            String category = sc.nextLine();
            System.out.print("설명 입력 : ");
            String description = sc.nextLine();

            map.put(key, new Menu(key, price, category, description));
        } else System.out.println("해당 메뉴가 이미 존재합니다.");
    }

    // 메뉴 삭제
    public void removeMenu() {
        System.out.print("삭제할 메뉴 입력 : ");
        String key = sc.nextLine();
        if (map.containsKey(key)) {
            map.remove(key);
            System.out.println("메뉴를 삭제 했습니다.");
        } else System.out.println("삭제할 메뉴가 없습니다.");
    }

    // 메뉴 수정
    public void updateMenu() {
        System.out.print("수정할 메뉴 입력 : ");
        String key = sc.nextLine();
        if (map.containsKey(key)) {
            System.out.print("가격 입력 : ");
            int price = sc.nextInt(); sc.nextLine();
            System.out.print("분류 입력 : ");
            String category = sc.nextLine();
            System.out.print("설명 입력 : ");
            String description = sc.nextLine();

            map.replace(key, new Menu(key, price, category, description));
        } else System.out.println("수정 할 메뉴가 없습니다.");
    }
}
