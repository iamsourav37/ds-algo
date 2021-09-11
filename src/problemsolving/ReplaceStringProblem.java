package problemsolving;

public class ReplaceStringProblem {
        public static void main(String[] args) {
            // PROBLEM STATEMENT -> REPLACE PI WITH 3.14
//             String s = "pippxxppixipi";
            // OUTPUT : 3.14ppxxp3.14xi3.14

               String s = "12iopiqpi";
            // OUTPUT : 12io3.14q3.14


            char[] ch = s.toCharArray();
            String finalResult = "";


            int i=0;
            while( i<ch.length ){
                if( ("".concat(String.valueOf(ch[i])).concat(String.valueOf(ch[i + 1])).toLowerCase().equals("pi")) ){
                    finalResult = finalResult.concat("3.14");
                    i = i+2;
                }else{
                    finalResult = finalResult.concat(String.valueOf(ch[i]));
                    i++;
                }
            }
            System.out.println(finalResult);

        }

}
