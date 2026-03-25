package Thread기본;
/*
    Multi Thread : 작업을 병렬로 처리하기 위해 사용
    - BackEnd 에서 여러 사용자의 요청을 동시에 수행하기 위해 사용
    - Thread 만드는 방법 : 상속, 인터페이스 2가지
*/
public class ThreadMain {
    public static void main(String[] args) {
        // Thread Class extends
        CustomThread th1 = new CustomThread();
        th1.start();

        // Runnable Interface Implements
        // 인터페이스 상속 받아 객체 생성, 스레드 수행 작업은 가지고 있지만 스레드는 아님
        CustomRunnable runnable = new CustomRunnable();
        // 실제 스레드 만들기 위해 스레드 객체 생성
        Thread th2 = new Thread(runnable);
        th2.start();

//        int sum = 0;
//        for (int i = 0; i < 100000; i++) {
//            sum += 1;
//            System.out.print("\r" + Thread.currentThread().getName() + " : " + sum);
//        }
    }
}

// Thread 클래스 상속으로 구현 : 단일 상속만 가능
class CustomThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
            System.out.println(Thread.currentThread().getName() + " : " + sum);
        }
    }
}

// Runnable 인터페이스 구현
class CustomRunnable implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
            System.out.println(Thread.currentThread().getName() + " : " + sum);
        }
    }
}