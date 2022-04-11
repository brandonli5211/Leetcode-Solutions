class Solution {
  public boolean checkIfExist(int[] arr) {

    /*
    Runtime: 1 ms, faster than 98.62% of Java online submissions for Check If N and Its Double Exist.
    Memory Usage: 41.2 MB, less than 5.35% of Java online submissions for Check If N and Its Double Exist.
    Runtime: O(n)
    */
    
    Set<Integer> nums = new HashSet<>(); // store arr[] elements here for fast lookup of doubles and halves

    for (int i : arr) { // traverse the array

      if (nums.contains(i * 2)) { // check whether i has a double
        return true;
      }

      if (i % 2 == 0 && nums.contains(i / 2)) { // if i is even, check whether it has a half
        return true;
      }

      nums.add(i); // if no matches to doubles or halves, just add to the set and continue for loop

    }

    return false; // if we weren't able to return true from the for loop, return false
  }
}
