# Beautiful Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

An array `nums` of length `n` is  **beautiful**  if:

- nums is a permutation of the integers in the range [1, n].
- For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums[k] == nums[i] + nums[j].

Given the integer `n`, return  *any  **beautiful**  array* `nums` *of length* `n`. There will be at least one valid answer for the given `n`.

 

 **Example 1:** 

```
Input: n = 4
Output: [2,1,4,3]

```

 **Example 2:** 

```
Input: n = 5
Output: [3,1,2,5,4]

```

 

 **Constraints:** 

- 1 <= n <= 1000

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 8.95%)  
**Memory:** 43.8 MB (beats 55.15%)  
**Submitted:** 2026-10-09T17:09:13.227Z  

```java
class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        while (result.size() < n) {
            List<Integer> next = new ArrayList<>();

            // Generate odd numbers: 2 * x - 1
            for (int x : result) {
                int odd = 2 * x - 1;
                if (odd <= n) {
                    next.add(odd);
                }
            }

            // Generate even numbers: 2 * x
            for (int x : result) {
                int even = 2 * x;
                if (even <= n) {
                    next.add(even);
                }
            }

            result = next;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/beautiful-array/)