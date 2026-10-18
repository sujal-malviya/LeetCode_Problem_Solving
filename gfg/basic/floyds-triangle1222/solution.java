class Solution {
    public void printFloydTriangle(int n) {
        // code here
        int count = 1;
        for(int i = 0;i<n;i++) {
            for(int j =0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}