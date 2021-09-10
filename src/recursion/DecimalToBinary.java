package recursion;

import java.util.Arrays;

public class DecimalToBinary {
    public static void main(String[] args) {

        System.out.println(getBinary(10));

        String inReverseForm = getBinaryRecursively(10);

        StringBuilder actualForm = new StringBuilder(inReverseForm);
        actualForm.reverse();
        System.out.println(actualForm);


    }

    static String getBinaryRecursively(int decimalNumber){
        String finalResult = "";
        if(decimalNumber > 0){
            finalResult = finalResult.concat(Integer.toString(decimalNumber%2));
            return finalResult.concat(getBinaryRecursively(decimalNumber/2));
        }
        return "";
    }

    static String getBinary(int decimalNumber){
        int[] binary = new int[100];
        int i=0;
        while (decimalNumber >0){
            binary[i] = decimalNumber % 2;
            i++;
            decimalNumber /= 2;
        }

        String finalResult = "";

        for(int j=i-1; j>=0; j--){
            finalResult = finalResult.concat(Integer.toString(binary[j]));
        }
        return finalResult;
    }
}
