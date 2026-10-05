# Check for Binary String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a non-empty sequence of characters  **s**, return true if sequence is Binary, else false.

 **Examples:** 

```
Input: s = "101"
Output: true
Explanation: Since string contains only '0' and '1', output is true.

```

```
Input: s = "75"
Output: false
Explanation: Since string contains digits other than '0' and '1', output is false.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T12:42:02.508Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-for-binary/1)