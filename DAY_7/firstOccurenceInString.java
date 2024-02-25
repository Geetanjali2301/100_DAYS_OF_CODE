package DAY_7;
/*
#Leetccode 28
*/

public class firstOccurenceInString {

    public static int strStr(String haystack, String needle) {
        
        if(needle.length()>haystack.length())
        {
            return -1;
        }

        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        String s="sadbutsad";
        String n="sad";
        int ind=strStr(s,n);
        System.out.println(ind);
    } 
}
