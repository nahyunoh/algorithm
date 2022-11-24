package basicMath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class math_bigNumber_10757 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] str = br.readLine().split(" ");

        BigInteger a = new BigInteger(str[0]);
        BigInteger b = new BigInteger(str[1]);
        
        a = a.add(b);

        System.out.println(a);
    }
}