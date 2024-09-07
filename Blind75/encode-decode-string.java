class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
      //TC - O(n+L)
      //SC - O(L)
        for(String s : strs){
            int length = s.length();
            sb.append(length);
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

  //TC O(n + L)
  //SC O(L)
    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int i=0;
        System.out.println(str);
        while(i<str.length()){
            int hash = str.indexOf("#",i);
            int size = Integer.valueOf(str.substring(i,hash));
            String s = str.substring(hash+1,hash+1+size);
            result.add(s);
            i = hash+size+1;
        }
        return result;
    }
}
