package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class loop_plusCycle_1110 {
    public static void main(String[] args) throws IOException{
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int num = Integer.parseInt(br.readLine());
    int firstNum = num;
    int cnt =0;
    do{
        num = ((num%10)*10) + (((num/10)+(num%10))%10);
        cnt++;
    }while(firstNum!=num);

    bw.write(cnt+"\n");
    bw.flush();
    bw.close();

    }
}
