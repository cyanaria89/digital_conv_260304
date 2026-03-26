package OOP_에어컨만들기Notion;

public class PortableAirCon extends AirCon{
    private int battery = 100;

    @Override
    public void simulateTemperatureChange() {
        if (battery > 0) {
            super.simulateTemperatureChange();
            battery--;
        } else {
            System.out.println("배터리가 방전되어 동작할 수 없습니다.");
        }
    }

    public void displayBattery() {
        System.out.println("배터리 잔량 : " + battery + "%");
    }

    public int getBattery() {
        return battery;
    }
}
