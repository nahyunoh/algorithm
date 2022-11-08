package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class loop_receipt_25304 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        int sum = Integer.parseInt(str1[0]);
        int total = Integer.parseInt(str2[0]);
        int totalPrice = 0;
        for(int i=0; i<total; i++){
            String[] str3 = br.readLine().split(" ");
            int price =  Integer.parseInt(str3[0]);
            int cnt =  Integer.parseInt(str3[1]);
            totalPrice += price*cnt;
        }
        if(sum==totalPrice){
            bw.write("Yes"+"\n");
        }else{
            bw.write("No"+"\n");
        }
        
        
        bw.flush();
        bw.close();
        }
}
