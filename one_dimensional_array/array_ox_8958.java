package one_dimensional_array;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class array_ox_8958 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int num = Integer.parseInt(br.readLine());
        String[] quiz = new String[num];

        for(int i=0;i<quiz.length;i++){
            quiz[i]=br.readLine();
        }
       
        for(int i=0;i<quiz.length;i++){
            int cnt=0;
            int sum=0;
            String str = quiz[i];
            for(int j=0;j<str.length();j++){
                  //bw.write(str.substring(j,j+1)+"\n");
               if(str.substring(j,j+1).equals("O")){
                    cnt++;
                    sum+=cnt;
               }else{
                    cnt=0;
               }
            }
           bw.write(sum+"\n");
        }
        bw.flush();
        bw.close();
    }
    
}
