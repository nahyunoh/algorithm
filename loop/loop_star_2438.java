package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class loop_star_2438 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        String[] str = br.readLine().split(" ");


        int n =  Integer.parseInt(str[0]);

        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                bw.write("*");
            }
            bw.write("\n");
        }


        bw.flush();
        bw.close();
       
    }
}
