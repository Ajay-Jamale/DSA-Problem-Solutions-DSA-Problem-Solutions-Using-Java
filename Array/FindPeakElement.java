/**
 * Peak Element in an Array - Java Solution
 *
 * Problem Description:
 * The task is to find the **peak element** in an array. An element is considered a peak if it is **greater than or equal**
 * to its neighbors. For the boundary elements, we only compare with one neighbor.
 *
 * Approach:
 * 1. **Edge Case Handling**:  
 *    - If the array contains only one element, it’s automatically considered the peak.
 *    - The first element is a peak if it's greater than or equal to the second element.
 *    - The last element is a peak if it’s greater than or equal to the second-last element.
 *
 * 2. **Iterative Search for Peak**:  
 *    - Traverse the array from index `1` to `n-2`. If an element is greater than or equal to both of its neighbors, return its index.
 *
 * Time Complexity:
 * - **O(n)** for iterating through the array once.
 *
 * Space Complexity:
 * - **O(1)** as we’re only using a constant amount of space for variables.
 *
 * Example:
 * Input: [1, 3, 20, 4, 1]  
 * Output: 2 (Index of peak element `20`)
 */

class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;

        // Handle edge cases
        if (n == 1) return 0; // If there's only one element, it's the peak
        if (arr[0] >= arr[1]) return 0; // If the first element is a peak
        if (arr[n - 1] >= arr[n - 2]) return n - 1; // If the last element is a peak

        // Check for peak elements in the middle
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        return -1; // No peak found (should never happen for valid input)
    }
}
