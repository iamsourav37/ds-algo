package recursion;

import java.util.Locale;

public class ReplacePI {
    public static void main(String[] args) {
        String s = "12iopiqpil";
        // OUTPUT : 12io3.14q3.14l

        replacePI(s);
        System.out.println();
        System.out.println(replacePIAndReturn(s));


    }

    static String replacePIAndReturn(String s){
        if(s.length() == 0){ // base case
            return "";
        }

        s = s.toLowerCase(Locale.ROOT);

        char[] ch = s.toCharArray();
        if(ch[0] == 'p' && ch[1] == 'i'){
            return "3.14".concat(replacePIAndReturn(s.substring(2)));
        }else {
            return ch[0]+replacePIAndReturn(s.substring(1));
        }
    }

    static void replacePI(String s){
        if(s.length() == 0){ // base case
            return;
        }
        s = s.toLowerCase(Locale.ROOT);

        char[] ch = s.toCharArray();
        if(ch[0] == 'p' && ch[1] == 'i'){
            System.out.print("3.14");
            replacePI(s.substring(2));
        }else {
            System.out.print(ch[0]);
            replacePI(s.substring(1));
        }
    }
}
