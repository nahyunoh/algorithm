package one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

    
public class array_smallNum_10871 {
    public static void main(String[] args) throws IOException{
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
    String[] num = br.readLine().split(" ");
    int n = Integer.parseInt(num[0]);
    int x = Integer.parseInt(num[1]);
    String[] arr= br.readLine().split(" ");

    int[] inputNum = new int[n];
    for(int i=0 ; i<n; i++){
        
        inputNum[i] = Integer.parseInt(arr[i]);
    } 

    for(int i=0;i<n;i++){
        if(inputNum[i]<x){
            bw.write(inputNum[i]+" ");
        }
    }

    bw.write("\n");
    bw.flush();
    bw.close();

    }
}
