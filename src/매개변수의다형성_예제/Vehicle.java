package 매개변수의다형성_예제;

public class Vehicle {
    public void move() {
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle {
    @Override
    public void move() {
        System.out.println("버스 달려잇~!");
    }
}

class Taxi extends Vehicle {
    @Override
    public void move() {
        System.out.println("t..a..x..i..ㄱㅏ..ㄷㅏㄹㄹㅕ~");
    }
}

class SportCar extends Vehicle {
    @Override
    public void move() {
        System.out.println("S-p-o-r-t-C-a-r-가 부와아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ앙");
    }
}

class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("M! O! T! O! R! B! O! A! T! 를 탑니다.");
    }
}

class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }

    void drive(Vehicle vehicle) {
        System.out.print(name + "의 ");
        vehicle.move();
    }

    void drive(Bus bus) { bus.move(); }
    void drive(Taxi taxi) { taxi.move(); }
    void drive(SportCar sportCar) { sportCar.move(); }
    void drive(Boat boat) { boat.move(); }
}