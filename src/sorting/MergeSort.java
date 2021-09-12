package sorting;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("MERGE SORT IMPLEMENTATION");

        int[] ages = {56, 23, 24, 21, 17, 18, 59, 72, 7, 90, 90}; // 11 elements
                    // 0   1    2  3   4   5   6   7  8, 9, 10

        int[] a = {12, 23, 12, 23};
        mergeSort(a);

        for(int i : a){
            System.out.print(i+", ");
        } // 12 23 12 23

    }
    public static void mergeSort(int[] elements){

        if(elements.length > 1){
            int mid = elements.length/2;
            int[] leftArray = new int[mid];
            int[] rightArray = new int[elements.length - leftArray.length];

            // copy left array elements
            for(int i=0; i<mid; i++)
                leftArray[i] = elements[i];

            // copy right array elemets
            for(int i=0; i<rightArray.length; i++)
                rightArray[i] = elements[mid+i];

            mergeSort(leftArray);
            mergeSort(rightArray);

            int i = 0;
            int j = 0;
            int k = 0;


            while (i<leftArray.length && j<rightArray.length){
                if(leftArray[i] <= rightArray[j]){
                    elements[k] = leftArray[i];
                    k++;
                    i++;
                }else{
                    elements[k] = rightArray[j];
                    j++;
                    k++;
                }
            }

            while (i<leftArray.length){
                elements[k] = leftArray[i];
                i++;
                k++;
            }

            while (j<rightArray.length){
                elements[k] = rightArray[j];
                j++;
                k++;
            }

        }
    }
}
