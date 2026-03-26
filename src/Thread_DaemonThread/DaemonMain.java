package Thread_DaemonThread;
/*
    Daemon Thread : 다른 스레드의 작업을 돕는 보조적인 역할
    데몬스레드 외의 모든 스레드가 종료되면 데몬스레드도 강제 종료 됨
*/
public class DaemonMain {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread ast = new AutoSaveThread();
        ast.setDaemon(true);            // 데몬 스레드 옵션
        ast.start();
        Thread.sleep(10000);
    }
}

class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("ㅈ ㅏ ㄱ ㅇ ㅓ ㅂ ㄴ ㅐ ㅇ ㅛ ㅇ ㅈ ㅓ ㅈ ㅏ ㅇ");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) { break; }
            save();
        }
    }
}