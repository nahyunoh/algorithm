package conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class con_dice_2480 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
        int reward = 0;

        if(a==b&&b==c&&a==c){
            reward = 10000+a*1000;
        }else if(a==b||a==c){
            reward = 1000+a*100;
        }else if(b==c){
            reward = 1000+b*100;
        }else{
            reward = Math.max(a , Math.max(b,c))*100;
        }
        System.out.println(reward);
    }

}
