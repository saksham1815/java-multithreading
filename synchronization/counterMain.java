public class counterMain {

    public static void main(String[] fe) {
        Counter cobj = new Counter();
        Mythread t1 = new Mythread(cobj);
        Mythread t2 = new Mythread(cobj);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.print(cobj.getcount());
    }
}
