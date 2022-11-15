package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class string_sum_11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    
        int n = Integer.parseInt(br.readLine());
        String[] nums = new String[n];
        nums = br.readLine().split("");
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Integer.parseInt(nums[i]);
        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();

    }
}
