package one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class array_leastMaximum_10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] n = br.readLine().split(" ");
        int cnt = Integer.parseInt(n[0]);

        int[] nums = new int[cnt];
        String[] arr = br.readLine().split(" ");
        for(int i=0; i<cnt; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        int max = nums[0];
        int min = nums[0];

        for(int i=1;i<cnt;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        bw.write(min+" "+max+""+"\n");
        bw.flush();
        bw.close();
    }
}
