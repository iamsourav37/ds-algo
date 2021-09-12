package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("BUBBLE(improved version) SORT IMPLEMENTATION");
        int[] ages = {12, 23, 32, 23, 34, 90, 101, 78, 7, 9};

        bubbleSort(ages);

        for(int age : ages){
            System.out.print(age+", ");
        }
    }

    public static void bubbleSort(int[] elements){
        for(int round=0; round<elements.length; round++){
            boolean flag = true;
            for(int i=0; i<elements.length-round-1; i++){
                if(elements[i]>elements[i+1]){
                    int temp = elements[i];
                    elements[i] = elements[i+1];
                    elements[i+1] = temp;
                    flag = false;
                }
            }

            if(flag)
                break;
        }
    }
}
