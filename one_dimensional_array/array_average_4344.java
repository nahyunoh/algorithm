package one_dimensional_array;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

    
public class array_average_4344 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int c = Integer.parseInt(br.readLine());
        String[] testCase = new String[c];

        //학생 수n명 + n명의 점수
        for(int i=0;i<c;i++){
            testCase[i] = br.readLine();
        }
      
        for(int i=0;i<testCase.length;i++){ 
            double sum =0;
            double avg=0;
            int cnt=0;
            String[] score = testCase[i].split(" ");
            for(int j=1;j<score.length;j++){
                sum += Double.parseDouble(score[j]);
            }
            avg+=sum/Double.parseDouble(score[0]);
            for(int j=1;j<score.length;j++){
                if(avg<Double.parseDouble(score[j])){
                    cnt++;
                }
            }
            double aboveAvg = cnt/Double.parseDouble(score[0])*100;
            
            bw.write(String.format("%.3f",aboveAvg)+"%"+"\n");
        }
        bw.flush();
        bw.close();
   }
}