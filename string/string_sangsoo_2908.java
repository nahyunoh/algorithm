package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class string_sangsoo_2908 {
    public static void main(String[] args) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String[] str = br.readLine().split(" ");
        String a = new StringBuffer(str[0]).reverse().toString();
        String b = new StringBuffer(str[1]).reverse().toString();

        int anum =Integer.parseInt(a);
        int bnum =Integer.parseInt(b);

        if(anum-bnum>0){
            bw.write(anum+"\n");    
        }else{
            bw.write(bnum+"\n");
        }

        bw.flush();
        bw.close();
    }  
}
