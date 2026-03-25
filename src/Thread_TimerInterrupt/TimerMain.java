package Thread_TimerInterrupt;
/*
    sleep() : 주어진 시간동안 스레드를 일시정지 상태로 만듦
    interrupt() : 일시정지 상태의 스레드에서 InterruptException 을 발생시켜 예외처리 코드를 실행함
*/
public class TimerMain {
    public static void main(String[] args) throws InterruptedException {
        TimerThread tt = new TimerThread();     // Thread 생성
        tt.start();                             // Thread를 실행 대기 상태로. run은 운영체제가... ㅇㅇ
        Thread.sleep(10000);              // 10초 대기
        tt.interrupt();                         // 작업 중단
    }
}

class TimerThread extends Thread {
    @Override
    public void run() {
        System.out.println("작업 시작");
        int cnt = 0;
        for (int i = 0; i < 30; i++) {
            System.out.print("\r작업 진행 : " + ++cnt);
            try {
                sleep(500);                         // 0.5초씩 일시정지 상태로 만듦
            } catch (InterruptedException e) {            // 예외처리 코드
                System.out.println("\n작업이 인터럽트로 인해 중단");
                return;
            }
        }
        System.out.print("\r작업 완료 : " + cnt + "\n");
    }
}