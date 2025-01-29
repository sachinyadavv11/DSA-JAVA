public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        // Step 1: Use the Tortoise and Hare method to find the cycle's entrance
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Finding the intersection point inside the cycle
        do {
            slow = nums[slow];        // Move slow pointer by 1 step
            fast = nums[nums[fast]];  // Move fast pointer by 2 steps
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];  // Move both pointers by 1 step
            fast = nums[fast];
        }

        return slow; // The point where they meet is the duplicate number
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 1};  // Example input array
        System.out.println("Duplicate number: " + findDuplicate(nums));
    }
}