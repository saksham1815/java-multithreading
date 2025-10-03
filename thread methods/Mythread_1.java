
public class Mythread_1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "-  Priority -" + Thread.currentThread().getPriority()
                    + "- count - " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {

                // TODO: handle exception

            }
        }

    }

    public static void main(String[] args) {
        Mythread_1 t2 = new Mythread_1();
        t2.start();

    }
}
