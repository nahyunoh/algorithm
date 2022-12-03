package basicMath2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class math_primeNum_1929 {
      public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);

        boolean[] arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;

        for(int i=2;i<=n;i++){
          if(arr[i]==true) continue;
             for(int j=2;j*i<=n;j++){
              arr[i*j]=true;
            }
        }
        for(int i=m;i<=n;i++){
          if(arr[i]==false){
            bw.write(i+"\n");
          }
        }
        bw.flush();
        bw.close();
      }
}
