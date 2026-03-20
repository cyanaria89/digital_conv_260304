package 커피메뉴만들기;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private final List<CoffeeMenu> menuList;

    // 생성자 - 인스턴스 필드를 초기화
    public MenuService() {
        menuList = new ArrayList<>();
        initMenu();
    }

    // 초기 메뉴 구성
    private void initMenu() {
        menuList.add(new CoffeeMenu("Americano", 2000, "Coffee", "Basic", true));
        menuList.add(new CoffeeMenu("Latte", 4000, "Coffee", "+ Milk", true));
        menuList.add(new CoffeeMenu("Green Tea", 4000, "Tea", "Green", false));
        menuList.add(new CoffeeMenu("Peppermint Tea", 4300, "Tea", "Peppermint", false));
        menuList.add(new CoffeeMenu("Baguette", 7000, "Bread", "BBANG!", true));
        menuList.add(new CoffeeMenu("Mocha Bun", 5000, "Bread", "Mocha + bun", true));
    }

    // 전체 메뉴 조회
    public List<CoffeeMenu> getMenuList() { return menuList; }

    // 메뉴 추가
    public void addMenu(CoffeeMenu menu) {
        menuList.add(menu);
    }

    // 메뉴 수정
    public boolean updateMenu(int index, CoffeeMenu menu) {
        if (index >= 0 && index <= menuList.size()) {
            menuList.set(index, menu);
            return true;
        } else {
            return false;
        }
    }

    // 메뉴 삭제
    public boolean deleteMenu(int index) {
        if (index >= 0 && index <= menuList.size()) {
            menuList.remove(index);
            return true;
        } else {
            return false;
        }
    }

    // 검색
    public CoffeeMenu searchMenu(String keyword) {
        for (CoffeeMenu menu : menuList) {
            if (menu.getName().equals(keyword)) return menu;
            else if ((String.valueOf(menu.getPrice())).equals(keyword)) return menu;
        }
        return null;
    }
}
