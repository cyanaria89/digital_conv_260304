package 제네릭_실습;

public abstract class Device {
    public abstract void turnOn();
    public abstract void turnOff();
}

class Printer extends Device {
    @Override
    public void turnOn() { System.out.println("Printer Power On"); }

    @Override
    public void turnOff() { System.out.println("Printer Power Off"); }

    @Override
    public String toString() { return "This is Printer!"; }
}

class Monitor extends Device {
    @Override
    public void turnOn() { System.out.println("모니터 전원을 켭니다."); }

    @Override
    public void turnOff() { System.out.println("모니터 전원을 끕니다."); }

    @Override
    public String toString() { return "This is Monitor!!"; }
}

class KeyBoard extends Device {
    @Override
    public void turnOn() { System.out.println("K-Board LED ON"); }

    @Override
    public void turnOff() { System.out.println("K-Board Touch OFF"); }

    @Override
    public String toString() { return "This is KeyBoard!!!!!!!!!!!!"; }
}
