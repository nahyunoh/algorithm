package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class loop_fastMath_15552 {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    String[] str = br.readLine().split(" ");
    
    int T = Integer.parseInt(str[0]);
    for(int i=0; i<T; i++){
        String[] str2 = br.readLine().split(" ");
        int a = Integer.parseInt(str2[0]);
        int b = Integer.parseInt(str2[1]);
        bw.write(a+b+"\n");
    }
    
    bw.flush();
    bw.close();
    }
}
