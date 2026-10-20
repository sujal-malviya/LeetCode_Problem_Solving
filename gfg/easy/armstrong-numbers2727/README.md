# Armstrong Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a **3-digit**  number  **n**, Find whether it is an  **Armstrong** number or not.

An  *Armstrong number*  of three digits is a number such that the sum of the cubes of its digits is equal to the  *number* itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. 

 **Examples:** 

```
Input: n = 153
Output: true
Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. 

```

```
Input: n = 372
Output: false
Explanation: 372 is not an Armstrong number since 33 + 73 + 23 = 378. 

```

```
Input: n = 100
Output: false
Explanation: 100 is not an Armstrong number since 13 + 03 + 03 = 1. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T06:18:59.525Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1)