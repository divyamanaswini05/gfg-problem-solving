class Solution {
    public int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        
        int largest = -1;
        int secondlargest = -1;
        
        for (int num : arr) {
            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } 
            else if (num < largest && num > secondlargest) {
                secondlargest = num;
            }
        }
        
        return secondlargest;
    }
}