package basicMath2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class math_primeNum_1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        str =  br.readLine().split(" ");

        // 처음 생각
        // 2와 3으로 나눈 나머지가 0이아니면 소수라고 생각했는데 25같은 애들이 있었다 ㅎ
        // 소수는 1과 자기자신만을 약수로 가지고 있는 수 
        // 고로 위의 접근은 잘못된 접근

        int cnt = 0;
        for(int i =0; i<n; i++){
            int num = Integer.parseInt(str[i]);//숫자 
            if(findDeci(num)) cnt++; 
        }

        bw.write(cnt+"\n");
        bw.flush();
        bw.close();
    
    }

    public static boolean findDeci(int num){
        if(num==1){
            return false; 
        }

        for(int j=2;j<num;j++){
            if(num%j==0){
                return false;
            }
        }

        return true;
    }
}
