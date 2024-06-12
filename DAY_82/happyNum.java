package DAY_82;

public class happyNum {

    public static int loop(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    
    }

    public static boolean isHappy(int n) {
        while (n != 1 && n!=4) {
            n = loop(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        boolean ans=isHappy(23);
        System.out.println(ans);
    }

    
    
}
