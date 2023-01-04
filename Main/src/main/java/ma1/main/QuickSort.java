package MA1;

public class QuickSort {
    public void sort(String[] data, String order) {
        String[] result = quickSort(data, 0, data.length, order);
        
        System.out.print("Sorted Order: ");
        System.out.print(String.join(", ",result));
        System.out.println("\nBest Case: O(n log(n))");
        System.out.println("Worst Case: O(n^2)");
    }
    
    public int pivot(String[] data, int start, int end, String order) {
        String pivot = data[start];
        int pivotIndex = start;
        end = data.length-1;

        for(int i = start+1; i <= end; i++) {
            if(order.equals("A")) {
                if(pivot.compareTo(data[i]) > 0) {
                    pivotIndex++;
                    swap(data, pivotIndex, i);
                }
            } else {
                if(pivot.compareTo(data[i]) < 0) {
                    pivotIndex++;
                    swap(data, pivotIndex, i);
                }
            }
        }

        swap(data, start, pivotIndex);

        return pivotIndex;
    }
    
    public String[] quickSort(String[] data, int start, int end, String order) {
        if(start < end) {
            int pivotIndex = pivot(data, start, end, order);
            quickSort(data, start, pivotIndex-1, order);
            quickSort(data, pivotIndex+1, end, order);
        }
        
        return data;
    }

    public static void swap(String[] data, int i, int j) {
        if(i == j) return;

        String temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}