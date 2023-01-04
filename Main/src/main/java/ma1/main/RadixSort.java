package MA1;

import java.util.*;

public class RadixSort {
    public int getDigit(int num, int i) {
        return (int) Math.floor(Math.abs(num) / Math.pow(10, i)) % 10;
    }
    
    public int digitCount(int num) {
        if(num == 0) return 1;
        return (int) Math.floor(Math.log10(Math.abs(num))) + 1;
    }
 
    public int mostDigits(int[] nums) {
        int maxDigits = 0;
        
        for(int i = 0; i < nums.length; i++) {
            maxDigits = Math.max(maxDigits, digitCount(nums[i]));
        }

        return maxDigits;
    }
    
    public void sort(String[] data, String order) {
        int[] nums = convertToInt(data);
        int maxDigitCount = mostDigits(nums);
        
        for(int k = 0; k < maxDigitCount; k++) {
            int[][] digitBuckets = new int[10][nums.length];

            for(int i = 0; i < nums.length; i++) {
                int digit = getDigit(nums[i], k);
                digitBuckets[digit][i] = nums[i];
            }
            
            ArrayList<Integer> concatNums = concat(digitBuckets, order);
            nums = new int[concatNums.size()];
            for(int i = 0; i < concatNums.size(); i++) nums[i] = concatNums.get(i);
        }
        
        System.out.print("Sorted Order: ");
        System.out.print(Arrays.toString(nums));
        System.out.println("\nBest Case: O(nk)");
        System.out.println("Worst Case: O(nk)");
    }
    
    public ArrayList<Integer> concat(int[][] nums, String order) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        if(order.equalsIgnoreCase("A")) {
            for(int i = 0; i < nums.length; i++) {
                for(int k = 0; k < nums[i].length; k++) {
                    if(nums[i][k] != 0) arr.add(nums[i][k]);
                }
            }
        } else {
            for(int i = nums.length-1; i >= 0; i--) {
                for(int k = 0; k < nums[i].length; k++) {
                    if(nums[i][k] != 0) arr.add(nums[i][k]);
                }
            }
        }
        
        return arr;
    }
    
    public int[] convertToInt(String[] data) {
        int[] res = new int[data.length];
        for(int i = 0; i < data.length; i++) res[i] = Integer.parseInt(data[i]);
        return res;
    }
}