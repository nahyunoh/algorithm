package conditional;

import java.util.Scanner;

public class con_leapYear_2753 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4==0&&(year%100!=00||year%400==00)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        
    }
}
