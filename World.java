import java.util.*;

public class World extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int temp_value = sc.nextInt();

        System.out.println("hi from thread and the value of temp from here is : " + temp_value);
    }
}
