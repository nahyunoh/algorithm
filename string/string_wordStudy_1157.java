package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class string_wordStudy_1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
        String str = br.readLine().toUpperCase();
        int max=-1;
        char ch = '?';

        int[] arr = new int[26];
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'A']++;
            if(max<arr[str.charAt(i) -'A']){
                max=arr[str.charAt(i) -'A'];
                ch=str.charAt(i);
            }else if(max == arr[str.charAt(i)-'A']){
                ch='?';
            }

            }
            bw.write(ch+"\n");
            bw.flush();
            bw.close(); 
        }

        

    
}
