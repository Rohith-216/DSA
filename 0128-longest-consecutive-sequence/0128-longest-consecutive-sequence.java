class Solution {
    public int longestConsecutive(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();

        // for (int num : nums)
        //     set.add(num);

        // int longestSequence = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (!set.contains(nums[i] - 1)) {
        //         int longest = 1;

        //         int j = nums[i] + 1;
        //         while (set.contains(j)) {
        //             longest++;
        //             j++;
        //         }
        //         longestSequence = Math.max(longest, longestSequence);
        //     }
        // }
        // return longestSequence;
        // Get the length of the array
        int n = nums.length;

        // If the array is empty, no sequence exists
        if (n == 0) return 0;

        // Variable to store the longest sequence length found
        int longest = 1; 

        // HashSet to store unique elements for O(1) lookup
        Set<Integer> st = new HashSet<>();

        // Add all elements to the set to remove duplicates
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        /* Loop through each element in the set to find 
           the starting point of consecutive sequences */
        for (int it : st) {
            // If there is no number before 'it', it’s the start of a sequence
            if (!st.contains(it - 1)) {
                // Start the count for this sequence
                int cnt = 1; 
                // Store the current number
                int x = it; 

                // Keep checking for the next consecutive number
                while (st.contains(x + 1)) {
                    // Move to the next number in sequence
                    x = x + 1; 
                    // Increment the length of current sequence
                    cnt = cnt + 1; 
                }

                // Update the longest sequence length if needed
                longest = Math.max(longest, cnt);
            }
        }

        // Return the length of the longest sequence
        return longest;
    }
}