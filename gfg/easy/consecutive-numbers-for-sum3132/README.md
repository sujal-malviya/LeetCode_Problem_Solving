# Express as Consecutive Number Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n**, find whether n can be expressed as  **sum**  of two or more consecutive positive numbers.

 **Examples :** 

```
Input: n = 10
Output: true
Explanation: 10 can be expressesd as 1 + 2 + 3 + 4.
```

```
Input: n = 8
Output: false
Explanation: 8 can't be expressesd sum of two or more consecutive numbers.
```

```
Input: n = 24
Output: true
Explanation: 24 can be expressesd as 7 + 8 + 9.
```

 **Constraints:** 
1 ≤ n ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T11:52:45.554Z  

```java
class Solution {
    public boolean isSumOfConsecutive(int n) {
        // code here
        if (n <= 2) {
                    return false;
                }
                return (n & (n - 1)) != 0;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/consecutive-numbers-for-sum3132/1)