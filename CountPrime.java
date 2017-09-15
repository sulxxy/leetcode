class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        Arrays.fill(notPrime, false);
        int count = 0;
        for(int i = 2; i < n; i++){
            if(notPrime[i] == false){
                count++;
                for(int j = 2; j*i < n; j++){
                    notPrime[i*j] = true;
                }
            }
        }
        return count;
    }
}