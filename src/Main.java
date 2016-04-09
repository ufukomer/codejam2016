import CountingSheep.CountingSheep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CountingSheep sheep = new CountingSheep();
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int i = 1;

        while (in.hasNext()) {
            int n = in.nextInt();
            if (sheep.sleep(n) == 0) {
                System.out.println("Case #" + i + ": " + "INSOMNIA" + " ");
                i++;
                continue;
            }
            System.out.println("Case #" + i + ": " + sheep.sleep(n));
            i++;
        }
    }
}
