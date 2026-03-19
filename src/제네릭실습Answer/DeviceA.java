package 제네릭실습Answer;

public abstract class DeviceA {
    public abstract void turnOn();
    public abstract void turnOff();
}

class PrinterA extends DeviceA {
    @Override
    public void turnOn() { System.out.println("프린터 전원을 켭니다."); }

    @Override
    public void turnOff() {
        System.out.println("프린터 전원을 끕니다.");
    }
}

class MonitorA extends DeviceA {
    @Override
    public void turnOn() {
        System.out.println("모니터 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("모니터 전원을 끕니다.");
    }
}

class KeyBoardA extends DeviceA {
    @Override
    public void turnOn() {
        System.out.println("키보드 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("키보드 전원을 끕니다.");
    }
}