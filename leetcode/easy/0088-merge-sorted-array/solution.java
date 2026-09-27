class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for(int i =0;i<nums1.length;i++)
        {
            if(k<nums2.length)
            {
                if(nums1[i]==0)
                {
                    nums1[i]=nums2[k];
                    k++;
                }
            }
            else
            {
                break;
            }
            
        }
        for(int i = 0;i<nums1.length;i++)
        {
            for(int j = i+1;j<nums1.length;j++)
            {
                int temp = 0;
                if(nums1[i]>=nums1[j])
                {
                    temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        for(int l =0;l<nums1.length;l++)
        {
            System.out.print("["+nums1[l]+","+"]");
        }
    }
}