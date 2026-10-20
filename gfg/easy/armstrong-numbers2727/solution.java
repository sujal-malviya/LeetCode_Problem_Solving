class Solution {
    
    static int countDigit(int n){
        if(n==0) {
            return 1;
        }
        int count = 0;
        while(n!=0) {
            count++;
            n = n/10;
        }
        return count;
    }
    static boolean armstrongNumber(int n) {
        // code here
        int lenght = countDigit(n);
        int result = 0; 
        int temp = n;
        while(temp!=0) {
            int digit = temp%10;
            result = result  + (int)Math.pow(digit,lenght);
            temp = temp/10;
        }
        
        return result == n;
    }
}