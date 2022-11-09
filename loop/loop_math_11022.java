package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class loop_math_11022 {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    String[] str = br.readLine().split(" ");
    
    int T = Integer.parseInt(str[0]);
    for(int i=1; i<T+1; i++){
        String[] str2 = br.readLine().split(" ");
        int a = Integer.parseInt(str2[0]);
        int b = Integer.parseInt(str2[1]);
        bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
    }
    
    bw.flush();
    bw.close();
    }
}
