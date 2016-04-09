import RevengeOfThePancakes.RevengeOfThePancakes;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RevengeOfThePancakes pancakes = new RevengeOfThePancakes();
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("file.txt"));
            for (int i = 1; i <= t; ++i) {
                String n = in.next();
                out.write("Case #" + i + ": " + pancakes.serve(n) + "\n");
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
