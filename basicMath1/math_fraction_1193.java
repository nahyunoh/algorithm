package basicMath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class math_fraction_1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(str[0]);

        int num = 0;
        int num_seq =0;
        int cnt = 0;

        while(cnt<x){
            num++;
            num_seq=0;
            for(int i=0;i<num;i++){
                cnt++;
                num_seq++;
                if(cnt==x){
                    break;
                }
            }
        }

        int top=0;
        int bottom =0;

       
        for(int i=0;i<num_seq;i++){
            if(num%2!=0){
                top=num-i;
                bottom=i+1;
            }else{
                top=i+1;
                bottom=num-i;
            }
        }
        
        System.out.println(top+"/"+bottom);

    }

}
