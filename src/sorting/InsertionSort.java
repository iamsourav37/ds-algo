package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Insertion sort implementation");
        int[] ages = {56, 23, 24, 21, 17, 18, -59, 72, 7, 90, 90};

        insertionSort(ages);

        for(int age : ages)
            System.out.print(age+", ");

    }

    public static void insertionSort(int[] elements){

        for(int i=1; i<elements.length; i++){

            int j=i-1;
            int key = elements[i];

            while( j>-1 && key<elements[j]){

                elements[j+1] = elements[j];
                j--;
            }

            elements[j+1] = key;
        }

    }
}
