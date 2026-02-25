class Solution {
    public int longestSubarray(int[] arr, int k) {
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > k)
                sum += 1;
            else
                sum -= 1;
            if(sum > 0)
                maxLen = i + 1;
            else if(map.containsKey(sum - 1))
                maxLen = Math.max(maxLen, i - map.get(sum - 1));
            
            if(!map.containsKey(sum))
                map.put(sum, i);
        }
        return maxLen;
    }
}