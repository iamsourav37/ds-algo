package recursion;

public class DecimalToBinary {
    public static void main(String[] args) {

        System.out.println(getBinary(1000000000));

        String inReverseForm = getBinaryRecursively(1000000000);

        StringBuilder actualForm = new StringBuilder(inReverseForm);
        actualForm.reverse();
        System.out.println(actualForm);

        System.out.println(DtoB(1000000000));



    }

    static int DtoB(int decimalNumber){
        if(decimalNumber == 1){
            return 1;
        }
        return decimalNumber%2 + 10 * DtoB(decimalNumber/2);
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
