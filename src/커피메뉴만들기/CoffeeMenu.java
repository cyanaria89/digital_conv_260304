package 커피메뉴만들기;
/*
    커피 메뉴에 대한 객체 생성을 위한 클래스
*/
public class CoffeeMenu {
    private String name;
    private int price;
    private String category;
    private String decription;
    // * desc = DB 에서 예약어로 잡혀버림, 오류가 나지 않으면서 의도하지 않게 동작할 수 있음
    private  boolean isTax;

    public CoffeeMenu(String name, int price, String category, String decription, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.decription = decription;
        this.isTax = isTax;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDecription() { return decription; }
    public void setDecription(String decription) { this.decription = decription; }

    public boolean isTax() { return isTax; }
    public void setTax(boolean tax) { isTax = tax; }

    @Override
    public String toString() {
        return String.format(
                "이름 : %-10s | 가격 : %d | 카테고리 : %-5s | 설명 : %s | 세금 : %-5s",
                name, price, category, decription, (isTax ? "포함" : "미포함")
        );
    }
}
