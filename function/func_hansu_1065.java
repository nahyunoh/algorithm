package function;
import java.io.BufferedReader;
import java                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         .io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class func_hansu_1065 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(i<100){
                cnt++;
            }else if(i<1000){
                String[] numString = Integer.toString(i).split("");
                if(Integer.parseInt(numString[1])-Integer.parseInt(numString[0])==Integer.parseInt(numString[2])-Integer.parseInt(numString[1])){
                    cnt++;
                }
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
        bw.close();
    }   
}
