# Trailing Zeroes in Factorial

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

For an integer  **n,**  find the number of trailing zeroes in  **n!.** 

 **Examples :** 

```
Input: n = 5
Output: 1
Explanation: 5! = 120 so the number of trailing zero is 1.
```

```
Input: n = 4
Output: 0
Explanation: 4! = 24 so the number of trailing zero is 0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T06:49:22.209Z  

```java
import java.math.BigInteger;

class Solution {
    public static int trailingZeroes(int n) {
        int count = 0;

        // Count how many multiples of 5, 25, 125, etc., are less than or equal to n
        while (n >= 5) {
            count += n / 5;
            n = n / 5;
        }

        return count;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1)