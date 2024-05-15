package ThreadBasic;

import java.util.ArrayList;

public class ThreadBasic implements Runnable{
    int seq;

    public ThreadBasic (int seq){
        this.seq = seq;
    }
    public void run(){
        System.out.println(this.seq + " 스레드가 시작합니다.");
        try {
            Thread.sleep(1000); // 1초 대기
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.println(this.seq + " 스레드가 종료되었습니다.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i <10; i ++){
            Thread t = new Thread(new ThreadBasic(i));
            t.start();
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); i++){
            Thread t = threads.get(i);
            try {
                t.join(); // t 스레드가 종료할때까지 대기!
            }catch (Exception e){
            }
        }
        System.out.println("메인 메서드 종료!");
    }
}
