package Thread_안전종료;

import java.util.Scanner;

/*
    stop() : 원래 스레드 종료하는 메서드인데 현재 사용중지됨 - DeadLock 발생 문제

    안전 종료 방법
    1. Stop 플래그 이용 - On / Off
    2. Interrupt 메서드 이용 - 또 다른 스레드가 필요
*/
public class Main {
    public static void main(String[] args) {
//        ThreadTest threadTest = new ThreadTest();
//        threadTest.start();
        InterruptThread threadTest = new InterruptThread();
        threadTest.start();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("[1]스레드 종료 [2]스레드 계속 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
//                threadTest.setStop(true);
                threadTest.interrupt();
                break;
            }
        }
    }
}

class InterruptThread extends Thread {
    @Override
    public void run() {
        int cnt = 0;
        try {
            while (true) {
                Thread.sleep(1000);
                System.out.printf("[%d]\r", ++cnt);
            }
        } catch (Exception e) { }
        System.out.println();
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}

class ThreadTest extends Thread {
    private boolean stop = false;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        int cnt = 0;
        while (!stop) {
            cnt++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("[%d]\r", cnt);
        }
        System.out.println();
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}