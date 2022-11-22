package string;

import java.util.Scanner;

public class string_wordChecker_1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int cnt = 0;
        for(int i=0;i<num;i++){
            if(checker(sc)) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean checker(Scanner sc){ 
       
        boolean[] arr = new boolean[26];  //f
        String s = sc.nextLine();
        int prev = -1; //이전문자 || ### prev를 0으로 줄 경우 단어의 첫 문자가 a일 때 prev=word 가 되어 오류 발생 ###
        for(int i=0;i<s.length();i++){
            int word = s.charAt(i)-'a';
            if(word!=prev){
                if(!arr[word]){
                    arr[word]=true;
                    prev=word;
                }else{
                    return false;
                }
            }else if(word==prev){
                prev=word;
            }
        }
        return true;
        
    }
}
