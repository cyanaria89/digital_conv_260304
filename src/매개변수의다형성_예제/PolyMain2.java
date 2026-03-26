package 매개변수의다형성_예제;

import java.util.Scanner;

public class PolyMain2 {
    public static void main(String[] args) {
        Driver driver = new Driver("JH");
        Scanner sc = new Scanner(System.in);
        System.out.print("어떤거 운전함?\n[1] Bus [2] Taxi [3] Sport Car [4] Boat\n-> ");
        int v = sc.nextInt();

        switch (v) {
            case 1:
                driver.drive(new Bus());
                break;
            case 2:
                driver.drive(new Taxi());
                break;
            case 3:
                driver.drive(new SportCar());
                break;
            case 4:
                driver.drive(new Boat());
                break;
            default:
                System.out.println("그런거 없다.");
        }
    }
}
