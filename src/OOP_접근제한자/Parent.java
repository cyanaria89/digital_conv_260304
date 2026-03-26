package OOP_접근제한자;

public class Parent {
    protected String name;    // 부모님 성함
    protected String address; // 부모님 주소
    protected int money;      // 부모님 재산

    public Parent() {
        name = "Hong";
        address = "서울특별시";
        money = 1000000000;
    }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getMoney() { return money; }
}
