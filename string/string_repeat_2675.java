package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class string_repeat_2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int test = Integer.parseInt(br.readLine());
       
        for(int i=0;i<test;i++){
           String[] str = br.readLine().split(" ");

           int num = Integer.parseInt(str[0]);
           String s = str[1];

           for(int j=0;j<s.length();j++){
            for(int k=0;k<num;k++){
                bw.write(s.charAt(j));
            }
           }
           
           bw.write("\n");
           
        }

        bw.flush();
        bw.close();

    
    
    
    }

}
