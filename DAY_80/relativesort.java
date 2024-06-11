package DAY_80;

public class relativesort {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int n = arr1.length, res[] = new int[n], freq[] = new int[1001], ind = 0;
        for(int num: arr1)    freq[num]++;
        for(int num: arr2)    while(freq[num] -- > 0)     res[ind++] = num;
        for(int i = 0; i < freq.length; i++)   while(freq[i] -- > 0)    res[ind++] = i;
        return res;
        
    }

    public static void main(String[] args) {
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};
        int ans[]=relativeSortArray(arr1, arr2);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    
}
