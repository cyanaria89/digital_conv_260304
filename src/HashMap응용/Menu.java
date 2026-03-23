package HashMap응용;

public class Menu {
    private String name;
    private int price;
    private String category;
    private String description;

    public Menu(String name, int price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return "메뉴 : " + name + "\n가격 : " + price + "\n분류 : " + category + "\n설명 : " + description + "\n";
    }
}
