package MA1;

public class MergeSort {
    public void sort(String[] data, String order) {
        for (int lastUnsortedIndex = data.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if(order.equals("A")) {
                    if(data[i].compareTo(data[i + 1]) > 0) swap(data, i, i + 1);
                } else {
                    if(data[i].compareTo(data[i + 1]) < 0) swap(data, i, i + 1);
                }
            }
        }

        System.out.print("Sorted Order: ");
        System.out.print(String.join(", ",data));
        System.out.println("\nBest Case: O(n log(n))");
        System.out.println("Worst Case: O(n log(n))");
    }

    public static void swap(String[] data, int i, int j) {
        if (i == j) return;

        String temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}