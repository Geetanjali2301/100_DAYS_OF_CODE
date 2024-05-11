package DAY_68;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();

        for(String word:strs)
        {
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String sortedS=new String(chars);

            if(!m.containsKey(sortedS))
            {
                m.put(sortedS,new ArrayList<>());
            }
            m.get(sortedS).add(word);
        }

        return new ArrayList<>(m.values());
        
    }

    public static void main(String[] args) {
        String[] s={"bat","tab","eat","ate"};
        List<List<String>> ans=groupAnagrams(s);
        System.out.println(ans);

    }
    
}
