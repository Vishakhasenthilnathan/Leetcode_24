class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);

            List<String> values = map.getOrDefault(key, new ArrayList());
            values.add(s);
            map.put(key,values);
        }
        List<List<String>> result = new ArrayList();
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}