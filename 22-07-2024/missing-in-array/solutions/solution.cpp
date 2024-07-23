class Solution {
  public:

    // Note that the size of the array is n-1
    int missingNumber(int n, vector<int>& array) {

        // Your code goes here
        sort(array.begin(), array.end());
        for ( int i = 0 ; i < n- 1 ; i++){
            if (array[i] != i+1)
            return i+1;    
            //num = i+1;
        }
        return n ;
    }
};