package one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class array_max_2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int[] nums = new int[9];
        int max = 0;
        int cnt=0;

        for(int i=0;i<9;i++){
            String num = br.readLine();
            nums[i]=Integer.parseInt(num);
        }
        
        
        for(int i=0;i<9;i++){
            if(max<nums[i]){
                max=nums[i];
                cnt=i+1;
            }
        }

        bw.write(max+"\n");
        bw.write(cnt+"\n");
        bw.flush();
        bw.close();
    }
}
