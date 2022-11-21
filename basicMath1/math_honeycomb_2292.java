package basicMath1;

import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class math_honeycomb_2292 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int num = sc.nextInt();
        int cnt=1;
        int range=2;
        if(num==1){
            System.out.println(num);
        }else{
            while(range<=num){
                range = range +6*cnt;
                cnt++;
            }
            System.out.println(cnt);
        }

    }
}