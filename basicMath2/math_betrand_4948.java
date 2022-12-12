package basicMath2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class math_betrand_4948 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int size = 123456*2+1;//246912
            boolean[] arr = new boolean[size];
            arr[0]=true;
            arr[1]=true;
            for(int i=0;i*i<=arr.length;i++){
                if(!arr[i]){ //false 일 때 소수 판별
                    for(int j=i*i;j<=arr.length;j+=i){
                        arr[j]=true;
                    }
                }
            }

            while(true){
                int n = Integer.parseInt(br.readLine());
                if(n == 0) {
                    break;
                }
                
                int cnt = 0;
                int max = 2*n;
                //n부터 2n까지
                for(int i=n+1;i<=max;i++){
                    if(arr[i]==false){ 
                        cnt+=1;
                    }
                }
                bw.write(cnt+"\n");
            }  
            bw.flush();
            bw.close();
       
    }

   
    
}

