package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class string_numberOfWords_1152 {
    public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
    String[] str = br.readLine().trim().split(" ");
   
    if(str.length==1&&str[0].equals("")){
        bw.write(0 +"\n"); 
    }else{
        bw.write(str.length+"\n");
    }

    bw.flush();
    bw.close();
    }
}
