package one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

    
public class array_counting_10807 {
    public static void main(String[] args) throws IOException{
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 

    int num = Integer.parseInt(br.readLine());

    int[] arr = new int[num];
    String[] nums = br.readLine().split(" ");

    for (int i=0; i<num ; i++){
        arr[i]=Integer.parseInt(nums[i]);
    }
    String[] input = br.readLine().split(" ");
    int inputNum = Integer.parseInt(input[0]);
    int cnt =0;
    for(int i=0; i<num; i++){
        if(arr[i] == inputNum){
            cnt++;
        }
    }
    
    bw.write(cnt+"\n");
    bw.flush();
    bw.close();

    }
}
