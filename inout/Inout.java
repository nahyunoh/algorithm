package inout;
import java.util.Scanner;
/**   
 * Inout
 */
public class Inout {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        //체스배열, 받은 값 빼고 출력 
        int[] chess ={1, 1, 2, 2, 2, 8};
        for(int i=0;i<chess.length;i++){
            chess[i]-= sc.nextInt();   
            System.out.print(chess[i]+" ");
        }
    }
}
    
