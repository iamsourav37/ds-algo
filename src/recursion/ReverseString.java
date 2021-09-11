package recursion;


public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Binod"));

        System.out.println(reverseRecursively("Pallabi"));


    }
//
    static String reverseRecursively(String s){
        if(s.length() == 0){
            return "";
        }
        char ch = s.charAt(0);
        return reverseRecursively(s.substring(1))+ ch;
    }

    static String reverse(String s){
       char[] ch = s.toCharArray();

       int length = ch.length;
       for(int i=0; i<ch.length/2; i++){
           char temp = ch[i];
           ch[i] = ch[length-1-i];
           ch[length-1-i] = temp;
       }
        s = "";
        for (char c : ch) {
            s = s.concat(String.valueOf(c));
        }
        return s;
    }
}
