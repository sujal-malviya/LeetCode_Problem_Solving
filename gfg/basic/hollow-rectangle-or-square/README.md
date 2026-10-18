# Print Hollow Rectangle

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers  **n**  and  **m**, print a hollow rectangle pattern consisting of n rows and m columns using  **'*'** character **.** 

 **Examples:** 

```
Input: n = 3, m = 5
Output:
  *
 ** 
  *
Explanation: It's a hollow rectangle with 3 rows and 5 columns.
```

```
Input: n = 4, m = 3
Output:
***
 ** 
 **   
***
Explanation: It's a hollow rectangle with 4 rows and 3 columns.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T12:16:00.378Z  

```java
class Solution {
    public void printHollowRectangle(int n, int m) {
        // code here
        for(int i = 1;i<=n;i++) {
            for(int j =1;j<=m;j++) {
                if(i==1 || i==n) {
                    System.out.print("*");
                }else {
                    if(j==1 || j==m) {
                        System.out.print("*");
                    }
                    else {
                        
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/hollow-rectangle-or-square/1)