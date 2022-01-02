// Find the kid which gets tha damaged toy

class Solution {
    static int findPosition(int N , int M , int K) {
        // code here
        if(M<N-K+1)
        return M+K-1;
        M = M - (N-K+1);
        return (M%N==0)?N:(M%N);
    }
}
