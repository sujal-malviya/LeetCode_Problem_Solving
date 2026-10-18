class Solution {
    public static int gcd(int a, int b) {
        // code here
        
        while(true) {
            int modulo = a%b ;
            if(modulo == 0) {
                break;
            }
            a = b;
            b = modulo;
            
        }
        
        return b ;
        
        
    }
}
