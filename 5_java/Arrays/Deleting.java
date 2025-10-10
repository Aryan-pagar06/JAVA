import java.util.*; 

public class Deleting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size = input.nextInt();
        int arr[] = new int[size];

        // Taking input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + " = ");
            arr[i] = input.nextInt();
        }

        System.out.print("Enter element you want to delete = ");
        int element = input.nextInt();

        // Update size after deletion
        size = delete(arr, size, element);

        // Display updated array
        display(arr, size);
    }

    public static void display(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int delete(int arr[], int size, int element) {
        int pos = -1;

        // Find position
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Element not found!");
            return size;
        }

        // Shift elements
        for (int j = pos; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }

        System.out.println("Element deleted successfully!");
        return size - 1; // Return new size
    }
}
