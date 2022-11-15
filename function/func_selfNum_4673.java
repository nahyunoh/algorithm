package function;

public class func_selfNum_4673 {
    public static void main(String[] args) {
        boolean[] selfNum = new boolean[10001];
        for(int i=1;i<=10000;i++){
            int n = d(i);
            if(n<10001){
                selfNum[n]=true;
            }
        }
        for(int i=1;i<=10000;i++){
            if(!selfNum[i]){
                System.out.println(i);
            }
        }
    }

    public static int d(int num){
        int sum = num/1000 + (num%1000)/100 + (num%100)/10 +num%10 + num;
        return sum;
    }
}
