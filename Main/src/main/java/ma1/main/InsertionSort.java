package MA1;

public class InsertionSort {
    public void sort(String[] data, String order) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < data.length; firstUnsortedIndex++) {
            String newElement = data[firstUnsortedIndex];
            int i;

            if(order.equals("A")) {
                for(i = firstUnsortedIndex; i > 0 && data[i - 1].compareTo(newElement) > 0; i--) {
                    data[i] = data[i - 1];
                }
            } else {
                for(i = firstUnsortedIndex; i > 0 && data[i - 1].compareTo(newElement) < 0; i--) {
                    data[i] = data[i - 1];
                }
            }

            data[i] = newElement;
        }

        System.out.print("Sorted Order: ");
        System.out.print(String.join(", ",data));
        System.out.println("\nBest Case: O(n)");
        System.out.println("Worst Case: O(n^2)");
    }
}