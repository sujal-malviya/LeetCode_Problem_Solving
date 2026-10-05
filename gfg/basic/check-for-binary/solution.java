class Solution {
    public boolean isBinary(String s) {
        // code here
        char arr[] = s.toCharArray();
        boolean isbin = false;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]=='0' || arr[i]=='1')
            {
                isbin = true;
            }
            else {
                isbin = false;
                break;
            }
            
        }
        return isbin;
    }
}
//0111100110101100
// 0,1,1,1,1,0,0,1,1,0,1,0,1,1,0,0