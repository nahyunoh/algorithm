package one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class array_average_1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int subNum = Integer.parseInt(br.readLine());
        float[] score = new float[subNum];
        String[] str = br.readLine().split(" ");
        for(int i=0;i<subNum;i++){
            score[i]=Integer.parseInt(str[i]);
        }

        float max=0;
        float sum=0;

        for(int i=0;i<score.length;i++){
            if(max<score[i]){
                max=score[i];
            }
        }

        for(int i=0;i<score.length;i++){
            sum += score[i]/max*100;
        }

        bw.write(sum/subNum+"\n");
        bw.flush();
        bw.close();
    }
}
