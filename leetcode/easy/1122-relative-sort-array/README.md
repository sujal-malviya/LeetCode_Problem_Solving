# Relative Sort Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two arrays `arr1` and `arr2`, the elements of `arr2` are distinct, and all elements in `arr2` are also in `arr1`.

Sort the elements of `arr1` such that the relative ordering of items in `arr1` are the same as in `arr2`. Elements that do not appear in `arr2` should be placed at the end of `arr1` in  **ascending**  order.

 

 **Example 1:** 

```
Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]

```

 **Example 2:** 

```
Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]

```

 

 **Constraints:** 

- 1 <= arr1.length, arr2.length <= 1000
- 0 <= arr1[i], arr2[i] <= 1000
- All the elements of arr2 are distinct.
- Each arr2[i] is in arr1.

## Solution

**Language:** JavaScript  
**Runtime:** 2 ms (beats 49.09%)  
**Memory:** 54.9 MB (beats 29.70%)  
**Submitted:** 2026-10-09T17:15:45.194Z  

```js
/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @return {number[]}
 */

var relativeSortArray = function(arr1, arr2) {
    const freq = new Map();

    // Step 1: Count frequency of each element in arr1
    for (const num of arr1) {
        freq.set(num, (freq.get(num) || 0) + 1);
    }

    const result = [];

    // Step 2: Add elements in the order specified by arr2
    for (const num of arr2) {
        const count = freq.get(num);

        for (let i = 0; i < count; i++) {
            result.push(num);
        }

        freq.delete(num);
    }

    // Step 3: Collect remaining elements and sort ascending
    const remaining = [];

    for (const [num, count] of freq) {
        for (let i = 0; i < count; i++) {
            remaining.push(num);
        }
    }

    remaining.sort((a, b) => a - b);

    return result.concat(remaining);
};

```

---

[View on LeetCode](https://leetcode.com/problems/relative-sort-array/)