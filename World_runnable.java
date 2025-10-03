import java.util.Scanner;

public class World_runnable implements Runnable {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int temp_value = sc.nextInt();

        System.out.println("hi from runnable and the value of temp from here is : " + temp_value);
    }

}
