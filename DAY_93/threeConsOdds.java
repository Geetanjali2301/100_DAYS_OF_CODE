package DAY_93;

public class threeConsOdds {

    public static boolean threeConsecutiveOdds(int[] arr) {

        int n = arr.length;
        if(n == 1 || n == 2){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(arr[i - 2]%2 != 0 && arr[i-1] % 2 != 0 && arr[i] % 2 != 0){
                return true;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {

        int arr[]={2,6,4,1};
        boolean ans=threeConsecutiveOdds(arr);
        System.out.println(ans);
        
    }
    
}
