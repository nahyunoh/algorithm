package basicMath2;

import java.io.IOException;
import java.util.Scanner;

public class math_primeNum_2581 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = n;

        for(int i=n;i>=m;i--){
            if(findDeci(i)){
                sum+=i;
                if(min>i){
                    min=i;
                }
                
            }
        }
        if(sum>0){
            System.out.println(sum);
            System.out.println(min);
        } else{
            System.out.println(-1);
        }
    }

    public static boolean findDeci(int num){
        if(num==1) return false;
        
        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }

        return true;
    }
}
