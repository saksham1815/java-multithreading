public class Mythread extends Thread {

    @Override
    public void run() {
        System.out.println("THEAD IS RUNNING");

        // for (int i = 0; i < 5; i++) {
        try {
            System.out.println("hi thread is going sleep");
            Thread.sleep(5000);
            // System.out.println("hi i am i=" + i);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("hi from thread after waking up");
        // }
    }

    public static void main(String[] args) throws InterruptedException {
        Mythread t1 = new Mythread();
        t1.start();
        System.out.println(Thread.currentThread().getState());
        t1.join();
        System.out.println(Thread.currentThread().getState());
        System.out.print("hi from main");
    }

}
