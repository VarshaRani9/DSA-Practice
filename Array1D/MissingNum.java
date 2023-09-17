// GFG - Missing number in array
// Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. 
// Find the missing element.

class Solution {    
    int missingNumber(int arr[], int n) {
        Arrays.sort(arr);
        for(int i =0;i<n-1;i++){
            if(arr[i]!=i+1)return i+1;
        }
        return n;
    }
}
