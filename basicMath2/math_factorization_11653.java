package basicMath2;

import java.io.IOException;
import java.util.Scanner;

public class math_factorization_11653 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=2;i<=num;i++){
            while(true){
                if(num%i==0){
                    num/=i;
                    System.out.println(i);
                }else{
                    break;
                }
            }
        }
                
    }
    
}
