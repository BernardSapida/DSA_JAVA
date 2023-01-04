package MA1;

import java.util.Arrays;

public class CountingSort {
    public void sort(String[] data, String order) {
        int j = order.equalsIgnoreCase("A") ? 0 : data.length-1;
        int min = getMin(data);
        int max = getMax(data);
        int[] nums = convertToInt(data);
        int[] supplementary = new int[max+1];

        for(int i = 0; i < data.length; i++) supplementary[nums[i]]++;
        for(int i = min; i <= max; i++) {
            while(supplementary[i] > 0) {
                nums[order.equalsIgnoreCase("A") ? j++ : j--] = i;
                supplementary[i] -= 1;
            }
        }
        
        System.out.print("Sorted Order: ");
        System.out.print(Arrays.toString(nums));
        System.out.println("\nBest Case: O(n+k)");
        System.out.println("Worst Case: O(n+k)");
    }
    
    public int[] convertToInt(String[] data) {
        int[] res = new int[data.length];
        for(int i = 0; i < data.length; i++) res[i] = Integer.parseInt(data[i]);
        return res;
    }
    
    public int getMin(String[] data) {
        int min = Integer.parseInt(data[0]);
        for(int i = 1; i < data.length; i++) min = Math.min(min, Integer.parseInt(data[i]));
        return min;
    }
    
    public int getMax(String[] data) {
        int max = Integer.parseInt(data[0]);
        for(int i = 1; i < data.length; i++) max = Math.max(max, Integer.parseInt(data[i]));
        return max;
    }
}
