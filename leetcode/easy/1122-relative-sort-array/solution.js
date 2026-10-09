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
