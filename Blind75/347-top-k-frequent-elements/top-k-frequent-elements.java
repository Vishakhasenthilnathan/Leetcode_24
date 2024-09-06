class Solution {
    class Pair{
        int ele;
        int freq;

        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        //O(n)
        for(int i:nums){
            int count = map.getOrDefault(i,0);
            map.put(i,++count);
        }

        //O(log k)
        Queue<Pair> minHeap = new PriorityQueue<Pair>((a,b) -> a.freq - b.freq);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            minHeap.add(new Pair(entry.getKey(), entry.getValue()));
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = minHeap.poll().ele;
        }
        //TC - O(nlogK) SC(O(n+k))
        return result;
    }
}