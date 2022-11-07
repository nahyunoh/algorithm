package conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class con_oven_2525{
    public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] start = br.readLine().split(" ");
    String[] oven = br.readLine().split(" ");
    int startTime = Integer.parseInt(start[0]);
    int startMinute = Integer.parseInt(start[1]);

    int ovenMinute = Integer.parseInt(oven[0]);
    if(startMinute+ovenMinute < 60){
        startMinute+=ovenMinute;
    }else{ 
        startTime += (startMinute+ovenMinute)/60;
        startMinute = (startMinute+ovenMinute)%60;

        if(startTime -23 > 0){
            startTime-=24;
        }

    }
    System.out.println(startTime+" "+startMinute);
    

    }
    
}
