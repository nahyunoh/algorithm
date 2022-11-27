package basicMath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class math_neighborhood_2775 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
       
        Scanner sc = new Scanner(System.in);
        
        int[][] apt = new int[15][15];

        for(int i=0;i<15;i++){
            apt[i][1]=1;
            apt[0][i]=i;
        }

        for(int i=1;i<15;i++){
            for(int j=2;j<15;j++){
                apt[i][j]=apt[i][j-1]+apt[i-1][j];
            }
        }
    int t= sc.nextInt();

        for(int i=0;i<t;i++){
            int k =sc.nextInt();
            int n =sc.nextInt();

            bw.write(apt[k][n]+"\n");
        }
        bw.flush();
        bw.close();
        
    }
}