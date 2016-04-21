<<<<<<< Updated upstream
import RevengeOfThePancakes.RevengeOfThePancakes;
=======
import CoinJam.CoinJam;
import CountingSheep.CountingSheep;
import RevengeOfThePancakes.Pancakes;
>>>>>>> Stashed changes

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
<<<<<<< Updated upstream
        RevengeOfThePancakes pancakes = new RevengeOfThePancakes();
=======
        /*
        Pancakes p = new Pancakes();
>>>>>>> Stashed changes
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("fileLarge.txt"));
            for (int i = 1; i <= t; ++i) {
                String n = in.next();
<<<<<<< Updated upstream
                out.write("Case #" + i + ": " + pancakes.serve(n) + "\n");
=======
                out.write("Case #" + i + ": " +p.serve(n) + "\n");
>>>>>>> Stashed changes
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        int n = 16;
        CoinJam c = new CoinJam(n);
        System.out.println(c.coinJam);
        for (int i = 0; i < 20; i++) {
            System.out.println(c.toGenerateOneMore(n));

        }

    }
}
