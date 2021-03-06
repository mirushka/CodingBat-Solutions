package com.company;

public class Array1 {

    /* Array-1 > firstLast6
    Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
    firstLast6([1, 2, 6]) → true
    firstLast6([13, 6, 1, 2, 3]) → false */
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;

    }

    /* Array-1 > sameFirstLast
    Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true     */
    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1) {
            if (nums[0] == nums[nums.length - 1]) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /* Array-1 > commonEnd
    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false      */
    //Solution 1
    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0]) {
            return true;
        } else if (a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }
    /* Solution 2
    public boolean commonEnd(int[] a, int[] b) {
        return (a[0]== b[0] || a[a.length-1] == b[b.length-1]); } */

    /* Array-1 > sum3
    Given an array of ints length 3, return the sum of all the elements.
    sum3([1, 2, 3]) → 6
    sum3([5, 11, 2]) → 18      */
    public int sum3(int[] nums) {
        //return nums[0] + nums[1] + nums[2];
        int sum = 0;
        // Iterate through all elements and add them to sum
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
    /* Solution 2
    return nums[0]+ nums[1] + nums[2]; */

    /* Array-1 > rotateLeft3
    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.      */
    public int[] rotateLeft3(int[] nums) {
        int[] rotated = {nums[1], nums[2], nums[0]};
        return rotated;
    }

    /* Array-1 > reverse3
    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.     */
    public int[] reverse3(int[] nums) {
        int[] reversed = {nums[2], nums[1], nums[0]};
        return reversed;
    }


    /* Array-1 > maxEnd3
    Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
    maxEnd3([2, 11, 3]) → [3, 3, 3]
     */
    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) {
            int[] modif = {nums[0], nums[0], nums[0]};
            return modif;
        } else {
            int[] modif2 = {nums[2], nums[2], nums[2]};
            return modif2;
        }

    }

    /* Array-1 > sum2
    Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
    sum2([1, 2, 3]) → 3
     */
    public int sum2(int[] nums) {

        if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return 0;
        }
    }

    /* Array-1 > middleWay
    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]     */
    public int[] middleWay(int[] a, int[] b) {
        int[] modif = {a[1], b[1]};
        return modif;
    }

    /* Array-1 > makeEnds
    Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
    makeEnds([1, 2, 3]) → [1, 3]
     */
    public int[] makeEnds(int[] nums) {
        int[] modif = {nums[0], nums[nums.length - 1]};
        return modif;
    }

    /* Array-1 > has23
    Given an int array length 2, return true if it contains a 2 or a 3.
    has23([2, 5]) → true
     */
    public boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[1] == 3) {
            return true;
        } else if (nums[0] == 3 || nums[1] == 2) {
            return true;
        }
        return false;
    }

    /* Array-1 > no23
    Given an int array length 2, return true if it does not contain a 2 or 3.
    no23([4, 5]) → true
     */
    public boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }


}
