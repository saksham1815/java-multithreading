public class Test {
    public static void main(String[] args) {
        World world = new World();
        world.start();

        World_runnable world_run = new World_runnable();
        Thread t1 = new Thread(world_run);
        t1.start();
        // world_run.run();
        System.out.println("HEllo ");
        System.out.println(Thread.currentThread().getName());
    }
}
