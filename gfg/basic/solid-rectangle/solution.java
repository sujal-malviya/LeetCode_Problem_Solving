class Solution {
    public void printSolidRectangle(int n, int m) {
        // code here
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}