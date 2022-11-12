package one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class array_remainder_3052 {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] nums =new int[10];
    boolean tf;

    for(int i=0;i<10;i++){
        nums[i]=Integer.parseInt(br.readLine())%42;
    }
    int cnt=0;
    for(int i=0;i<10;i++){
        tf=false;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                tf=true;
                break;
            }
        }
        if(tf == false){
            cnt++;
        }
    }
    bw.write(cnt+"\n");
    bw.flush();
    bw.close();
    }
}
