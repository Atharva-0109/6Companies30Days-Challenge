// Given an array of strings,return all groups of strings that are anagrams.
// Solution
class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        //Creating a hashmap
        HashMap<String,List<String>> map1 = new HashMap<>();
        //Creating List
        List<List<String>> list = new ArrayList<>();
        //Itreate Through each element in array
        for(int i = 0;i<string_list.length;i++)
        {
            String str = string_list[i];
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String word = new String(ch);
            if(map1.containsKey(word))
            {
                map1.get(word).add(str);
            }
            else
            {
                List<String> new_words = new ArrayList<>();
                new_words.add(str);
                map1.put(word,new_words);
            }
        }
        for(String s:map1.keySet())
        {
            List<String> values = map1.get(s);
            list.add(values);
        }
        return list;
    }
}
