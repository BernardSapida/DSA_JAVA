public class SelectionSort {
    public void sort(String[] data, String order) {
        for (int lastUnsortedIndex = data.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(order.equals("A")) {
                    if(data[i].compareTo(data[largest]) > 0) largest = i;
                } else {
                    if(data[i].compareTo(data[largest]) < 0) largest = i;
                }
            }

            swap(data, largest, lastUnsortedIndex);
        }

        System.out.print("Sorted Order: ");
        System.out.print(String.join(", ",data));
        System.out.println("\nBest Case: O(n^2)");
        System.out.println("Worst Case: O(n^2)");
    }

    public static void swap(String[] array, int i, int j) {
        if(i == j) return;

        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
