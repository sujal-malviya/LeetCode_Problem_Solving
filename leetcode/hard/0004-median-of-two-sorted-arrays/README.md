# Median of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return  **the median**  of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

 **Example 1:** 

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

```

 **Example 2:** 

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

 **Constraints:** 

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -106 <= nums1[i], nums2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 27 ms (beats 13.40%)  
**Memory:** 49 MB (beats 15.56%)  
**Submitted:** 2026-09-27T09:16:06.805Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)