class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int totalLength = length1+length2;
        int num3[] = new int[totalLength];
        for(int i=0;i<length1;i++)
        {
            num3[i]=nums1[i];
        }
        int temp =length1;
        for(int i = 0;i<length2;i++)
        {
            num3[temp]=nums2[i];
            temp++;
        }
        for(int i = 0; i < totalLength - 1; i++)
        {
            for(int j = i + 1; j < totalLength; j++)
            {
                if(num3[i] > num3[j])
                {
                    int temp1 = num3[i];
                    num3[i] = num3[j];
                    num3[j] = temp1;
                }
            }
        }
        double median = 0;
        if(totalLength % 2 != 0)
        {
            return num3[totalLength / 2];
        }
        else
        {
            return (num3[totalLength / 2 - 1]
                    + num3[totalLength / 2]) / 2.0;
        }
    }
}