package DAY_84;
/*
#Leetcode 1768
*/

public class mergeStrings {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int ptr1 = 0, ptr2 = 0;

        while(ptr1 < word1.length() && ptr2 < word2.length()){
            sb.append(word1.charAt(ptr1++));
            sb.append(word2.charAt(ptr2++));
        }

        if(ptr1<word1.length()){
            sb.append(word1.substring(ptr1));
        }
        
        if(ptr2<word2.length()){
            sb.append(word2.substring(ptr2));
        }
        return sb.toString();
    
        
    }

    public static void main(String[] args) {
        String s1="abc";
        String s2="pqr";
        String ans=mergeAlternately(s1, s2);
        System.out.println(ans);
    }
    
}
