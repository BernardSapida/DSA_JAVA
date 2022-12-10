import java.util.Scanner;

public class Main {
    BubbleSort bubbleSort = new BubbleSort();
    SelectionSort selectionSort = new SelectionSort();
    InsertionSort insertionSort = new InsertionSort();
    ShellSort shellSort = new ShellSort();
    MergeSort mergeSort = new MergeSort();
    String[] arrData;
    String order;

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.displayTerminal();
    }

    public void displayTerminal() {
        while(true) {
            System.out.println("\n=================================\n");
            Scanner sc = new Scanner(System.in);

            System.out.println("[1] Bubble Sort");
            System.out.println("[2] Selection Sort");
            System.out.println("[3] Insertion Sort");
            System.out.println("[4] Shell Sort");
            System.out.println("[5] Merge Sort");
            System.out.println("[0] Exit");
            System.out.print("Choose [1-5]: ");
            String response = sc.nextLine();

            if(response.equals("0")) break;

            setData();
            setOrder();

            System.out.println("\n=================================\n");

            if(response.equals("1")) bubbleSort.sort(arrData, order);
            else if(response.equals("2")) selectionSort.sort(arrData, order);
            else if(response.equals("3")) insertionSort.sort(arrData, order);
            else if(response.equals("4")) shellSort.sort(arrData, order);
            else if(response.equals("5")) mergeSort.sort(arrData, order);
            else System.out.println("Input is invalid! Please try again.");
        }
    }

    public void setData() {
        Scanner sc = new Scanner(System.in);
        String data = "";
        int number = 1;

        System.out.println("\n=================================\n");

        System.out.println("What are the data you want to insert?");
        while(true) {
            System.out.print("Input " + number + ": ");
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("X")) break;

            data = input + "x" + data;
            number++;
        }

        int arrLength = data.split("x").length;
        arrData = new String[arrLength];
        
        for(int i = 0; i < arrLength; i++) arrData[i] = data.split("x")[i];

        System.out.println("\n=================================\n");
    }

    public void setOrder() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Select 'A' - Ascending, 'D'-Descending: ");
            String input = sc.nextLine();

            order = input;
            if(input.equalsIgnoreCase("A") || input.equalsIgnoreCase("D")) break;
        }
    }
}
