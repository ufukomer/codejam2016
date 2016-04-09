import CountingSheep.CountingSheep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CountingSheep sheep = new CountingSheep();
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            if (sheep.sleep(n) == 0) {
                System.out.println("Case #" + i + ": " + "INSOMNIA" + " ");
                continue;
            }
            System.out.println("Case #" + i + ": " + sheep.sleep(n));
        }
    }
}
