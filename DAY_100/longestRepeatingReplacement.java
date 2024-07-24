package DAY_100;
/*
#Leetcode 424
*/

public class longestRepeatingReplacement {

    public static int characterReplacement(String s, int k) {
        int i=0;
        int maxfreq=0;
        int maxlen=0;
        int hash[]=new int[26];

        for(int j=0;j<s.length();j++)
        {
            hash[s.charAt(j)-'A']++;
            maxfreq=Math.max(maxfreq,hash[s.charAt(j)-'A']);
            if(j-i+1 - maxfreq > k)
            {
                hash[s.charAt(i)-'A']--;
                i++;
            }

            maxlen=Math.max(maxlen,j-i+1);
        }

        return maxlen;
        
    }

    public static void main(String[] args) {
        String s="AABABBA";
        int k=1;

        int ans=characterReplacement(s, k);
        System.out.println(ans);

    }
    
}
