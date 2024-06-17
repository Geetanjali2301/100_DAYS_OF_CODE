package DAY_86;

public class sumofSqures {

    public static boolean judgeSquareSum(int c) {

        for(int i=0;i<=Math.sqrt(c);i++){
            int val=(int)Math.sqrt(c-(i*i));
            if(i*i+val*val==c){
               return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int c=10;
        boolean ans=judgeSquareSum(c);
        System.out.println(ans);

    }
    
}
