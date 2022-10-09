class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        HashMap<String,List<String>> mapping=new HashMap<>();
        for(String s: strs){
            String key=countCharacteres(s);
            if(!mapping.containsKey(key)){                
                mapping.put(key,new ArrayList<String>());
                result.add(mapping.get(key));
            }
            mapping.get(key).add(s);
        }
        return result;
    }
    public String countCharacteres(String s){
        char[] counter=new char[26];
        for(int i=0; i<s.length();i++){            
            counter[s.charAt(i)-'a']++;            
        }
        return new String(counter);
    }
}
