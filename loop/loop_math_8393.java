package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class loop_math_8393 {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    String[] str = br.readLine().split(" ");
    int num = Integer.parseInt(str[0]);
    int sum=0;
    for(int i=1; i<num+1; i++){
        sum+=i;
    }
    bw.write(sum+"\n");
    
    bw.flush();
    bw.close();
    }
}
