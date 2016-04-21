package CoinJam;

/**
 * Created by yusufkorkmaz on 10.04.2016.
 */
public class CoinJam {

    public String coinJam="";

    public CoinJam(int length) {
        coinJam += "1";
        for (int i = 1; i < length-1; i++) {
            coinJam +=0;
        }
        coinJam += "1";
    }

    public String toGenerateOneMore(int length){
        int i = coinJam.lastIndexOf('0');
        coinJam = coinJam.substring(0, i) + '1' ;
        for (int j = i+1; j < length-1; j++) {
            coinJam += '0';
        }
        coinJam += '1';
        return coinJam;
    }

}
