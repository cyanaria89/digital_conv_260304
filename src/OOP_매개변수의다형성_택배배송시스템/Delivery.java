package OOP_매개변수의다형성_택배배송시스템;

public class Delivery {
    String company;
    public Delivery(String company) { this.company = company; }
    public void deliver() { System.out.println("배송을 시작합니다."); }
    public String getCompany() { return company; }
}

class ParcelDelivery extends Delivery {
    public ParcelDelivery(String company) { super(company); }
    @Override
    public void deliver() { System.out.println("택배 배송을 시작합니다. 2 ~ 3일 소요됩니다."); }
}

class QuickDelivery extends Delivery {
    public QuickDelivery(String company) { super(company); }
    @Override
    public void deliver() { System.out.println("퀵 배송을 시작합니다. 당일 도착 예정입니다."); }
}

class AirDelivery extends Delivery {
    public AirDelivery(String company) { super(company); }
    @Override
    public void deliver() { System.out.println("항공 배송을 시작합니다. 해외로 출발합니다."); }
}

class Manager {
    String name;
    public Manager(String name) { this.name = name; }
    public void send(Delivery d) {
        System.out.println(name + " 매니저가 " + d.getCompany() + " 회사의 배송을 지시합니다.");
        d.deliver();
    }
}
