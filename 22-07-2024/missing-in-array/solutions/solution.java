class Solution {
    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        int sum = Arrays.stream(arr).sum();
        return Math.abs(sum - ( (n * (n + 1)) / 2) );
    }
}