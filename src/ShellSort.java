public class ShellSort {
    public void sort(String[] data, String order) {
        for (int gap = data.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < data.length; i++) {
                String newElement = data[i];
                int j = i;

                if(order.equals("A")) {
                    while (j >= gap && data[j - gap].compareTo(newElement) > 0) {
                        data[j] = data[j - gap];
                        j -= gap;
                    }
                } else {
                    while (j >= gap && data[j - gap].compareTo(newElement) < 0) {
                        data[j] = data[j - gap];
                        j -= gap;
                    }
                }

                data[j] = newElement;
            }
        }
        
        System.out.print("Sorted Order: ");
        System.out.print(String.join(", ",data));
        System.out.println("\nBest Case: O(n*log(n))");
        System.out.println("Worst Case: O(n^2)");
    }
}
