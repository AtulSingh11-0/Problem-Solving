class Solution
{
    // optimized: atul
    ArrayList<Integer> rotate(int N, int D)
    {
    	// your code here
        
        // Integer.toBinaryString(N)
        int t = 16;
        D %= 16;
        
        int left = ( (N << D) | N >> (t-D) ) & 0xFFFF;
        int right = ( (N >> D) | N << (t-D) ) & 0xFFFF;
        
        return new ArrayList<>(List.of(left, right));
    }
}