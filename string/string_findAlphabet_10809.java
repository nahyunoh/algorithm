package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class string_findAlphabet_10809 { 
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    String str = br.readLine();

    for(char ch='a';ch<='z';ch++){
        bw.write(str.indexOf(ch)+" ");
    }
    
    bw.flush();
    bw.close();

    //다른 방법으로 풀어보기
    //알파벳 배열
    int[] arr =new int[26];
    for(int i=0;i<arr.length;i++){
        arr[i]=-1;
    }
    
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        
        if( arr[ch-'a'] ==-1){
            arr[ch-'a']=i;
        }
    }
    
    for(int val : arr){
        bw.write(val+" ");
    }

    bw.flush();
    bw.close();

    }
}
