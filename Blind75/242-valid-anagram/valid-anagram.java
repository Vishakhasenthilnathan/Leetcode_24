class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0;i<s.length();i++){
            int existingFreq = map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i), ++existingFreq);
        }

        for(int i=0;i<t.length();i++){
            int existingFreqInS = map.getOrDefault(t.charAt(i),0);
            if(existingFreqInS==0) return false;
            else {
                if(existingFreqInS-1 == 0)
                    map.remove(t.charAt(i));
                else
                    map.put(t.charAt(i),--existingFreqInS);
            }
        }

        return map.size()==0;
    }
}