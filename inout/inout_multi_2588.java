package inout;

import java.util.Scanner;

public class inout_multi_2588 {
    public static void main(String[] args) {
    //  엔젤리너스
        //주어진수 1,2
        //3 : 1에다가 2 일의 자리 곱해
        //4 : 1에다가 2 십의 자리 곱해
        // 노성규죽여
        //5 : 1에다가 2의 백의 자리 곱해
        //6은 결과

        //1과 2 입력받고 2는 나누기
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int num3 = num1 *(num2%10); //5
        int num4 = num1 *((num2/10)%10); //8
        int num5 = num1 *(num2/100); //3
        int num6=num1*num2;
        
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

    }
}
