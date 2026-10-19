class Solution {
    static boolean isPrime(int n) {
        // code here
        boolean isprimenum = true ;
        
        if (n <= 1 || n==2){
            return false;
        }
        
        
        
        for(int i =2;i<n;i++) {
            if(n%i==0) {
                isprimenum = false;
            }
        }
        return isprimenum;
    }
}