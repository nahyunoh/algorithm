package conditional;

import java.util.Scanner;

public class con_score_9498 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score<0 || score>100){
            return;
        }
        String grade="";

        if(score>=90&&score<=100){
            grade="A";
        }else if(score>=80&&score<90){
            grade="B";
        }else if(score>=70&&score<80){
            grade="C";
        }else if(score>=60&&score<70){
            grade="D";
        }else{
            grade="F";
        }

        System.out.println(grade);

    }
}
 