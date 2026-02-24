class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int i=0;
        for(int n:arr){
            if(n!=0){
                arr[i]=n;
                i++;
            }
        }
        while(i<arr.length){
            arr[i]=0;
            i++;
        }
    }
}