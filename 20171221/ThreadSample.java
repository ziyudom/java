import java.util.*;

class PrintingThred extends Thread {
    public void run(){
        System.out.println("test");
    }
}

public class ThreadSample {
    public static void main(String[] args){
        System.out.println("入力してください。");
        Thread t = new PrintingThred();
        t.start();
        new Scanner(System.in).nextLine();
        System.out.println("TEST");
    }
}
