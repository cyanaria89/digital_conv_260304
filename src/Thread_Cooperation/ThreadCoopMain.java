package Thread_Cooperation;
/*
    두 개의 스레드가 번갈아 가면서 실행해야 하는 경우
    notify() : 일시정지 상태에 있는 다른 스레드를 실행 대기 상태로 만듦
    notifyAll() : 일시정지 상태에 있는 "모든" 스레드를 실행 대기 상태로 만듦
    wait() : 자신을 대기 상태로 만듦
    synchronized : 여러 스레드가 해당 메서드에 동시 접근 하는 것을 막기위해 사용. 티켓팅 등의 상황
    - 임계영역 관리, 실행 시간이 늘어남
*/
public class ThreadCoopMain {
    public static void main(String[] args) {
        WorkObject wo = new WorkObject();
        ThreadA thA = new ThreadA(wo);
        ThreadB thB = new ThreadB(wo);
        thA.start();
        thB.start();
    }
}

class WorkObject {
    public synchronized void methodA() {
        System.out.println("Thread의 MethodA() 작업 실행");
        notify();
        try { wait(); } catch (InterruptedException e) {
            System.out.println("Interrupt Exception!");
        }
    }

    public synchronized void methodB() {
        System.out.println("Thread의 MethodB() 작업 실행");
        notify();
        try { wait(); } catch (InterruptedException e) {
            System.out.println("Interrupt Exception!");
        }
    }
}

class ThreadA extends Thread {
    private final WorkObject wo;

    public ThreadA(WorkObject wo) {
        this.wo = wo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            wo.methodA();
        }
    }
}

class ThreadB extends Thread {
    private final WorkObject wo;

    public ThreadB(WorkObject wo) {
        this.wo = wo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            wo.methodB();
        }
    }
}