package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class loop_math_10950 {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    String[] str = br.readLine().split(" ");
    int num = Integer.parseInt(str[0]);
    
    for(int i=0; i<num; i++){
        String[] testCase = br.readLine().split(" ");
        
        int a = Integer.parseInt(testCase[0]);
        int b = Integer.parseInt(testCase[1]);
        bw.write(a+b+"\n");
    }
    
    bw.flush();
    bw.close();
    }
}
