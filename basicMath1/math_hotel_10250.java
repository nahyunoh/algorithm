package basicMath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class math_hotel_10250 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){

            String[] arr = br.readLine().split(" ");
            int height = Integer.parseInt(arr[0]);
            int width = Integer.parseInt(arr[1]);
            int num = Integer.parseInt(arr[2]);
            int x=1;
            int y=0;
            
            
            if(num%height==0){
                y = height;
                x =num/height;
                bw.write(y*100 + x+"\n");
            }else{
                y=num%height;
                x = num/height +1 ;
                bw.write(y*100 + x+"\n");
            }

        }
bw.flush();
bw.close();
        
        
    }
}
