package Sorting_Aarray;

public class BinarySearch {

    public static void search() {
        int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        int start = 0;
        int end = array1.length;
        int num = 8;

        int mid = (start + end) / 2;
        while (start <= end) {
            if (array1[mid] < num) {
                start = mid + 1;

            } else if (array1[mid] == num) {
                System.out.println("element is found at indext: " + mid);
                break;
            } else {
                end = mid - 1;

            }
            mid = (start + end)/2;
        }
        if (start > end) {
            System.out.println("element is found: ");
        }
    }

    public static void main(String[] args) {
        search();
    }

}
