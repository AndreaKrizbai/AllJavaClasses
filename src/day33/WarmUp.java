package day33;

import org.w3c.dom.ls.LSOutput;

public class WarmUp {
    public static void main(String[] args) {

       String spelledName = getSpelledName("Andrea");
        System.out.println("spelledName = " + spelledName);
        System.out.println(getSpelledName("Andocs"));

    }

    public static String getSpelledName(String name){

        String result = "";
        for (int i = 0; i < name.length()-1; i++) {
            result = result + name.charAt(i) + "-";
        }
         result = result + name.charAt(name.length()-1);

//        for (int i = 0; i < name.length(); i++) {
//            result = result + name.charAt(i);
//            if (i != name.length() - 1){
//                result = result + "-";
//            }
//        }
        return result;
    }

}
