package conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class con_alarm_2884 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int hour = Integer.parseInt(str[0]);
		int minute = Integer.parseInt(str[1]);

        if(minute-45<0){
            if(hour>0){
                hour-=1;
                minute=60+minute-45;
            }else if(hour<1){
                hour=23;
                minute=60+minute-45;
            }
        }else{
            minute-=45;
        }
        System.out.println(hour+" "+minute);
    }
}
