import CountingSheep.CountingSheep;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CountingSheep sheep = new CountingSheep();
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("file.txt"));
            for (int i = 1; i <= t; ++i) {
                int n = in.nextInt();
                if (sheep.sleep(n) == 0) {
                    out.write("Case #" + i + ": " + "INSOMNIA" + "\n");
                    continue;
                }
                out.write("Case #" + i + ": " + sheep.sleep(n) + "\n");
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
