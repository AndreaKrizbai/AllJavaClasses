package Practice.Repls;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl181 {
    public static void main(String[] args) {

        System.out.println(wordCount("Hello World mi ujsag"));
        System.out.println(clean("Hello szia world szia", "szia"));
        System.out.println(limit("abcd", 2));
        System.out.println(at3("blabla","a"));
        System.out.print(lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n");
        System.out.print(lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n");
        System.out.print(lameDb("1tst#2bla#3foo","delete","2","")+"\n");
        System.out.print(lameDb("1tst#2bla#3foo","none","1","")+"\n");
        System.out.println(findMax(new int[]{1, 2, 6, 9, 5}));
        System.out.println(mergR(new int[]{1,2}, new int[]{4, 6}));
        System.out.println(reverse("hello"));
        ArrayList<Double>prices =new ArrayList<>(Arrays.asList(9.99,10.99,25.25));
        test(prices);
        System.out.println(prices);
    }

        public static int wordCount(String words) {
            int count = 1;
            while(words.contains(" ")){
                count++;
                words=words.substring(words.indexOf(" ")+1);
            }
            return count;
        }

    public static String clean (String text ,String badWord) {

        while(text.contains(badWord)){
            text = text.replace(badWord, "");
        }
        return text;
    }

    public static String limit(String text, int maxLength)
    {
        return text.substring(0,maxLength);
    }

    public static String at3(String target,String word)
    {
        return target.substring(0,3)+word+target.substring(2+word.length());
    }

    public static String lameDb(String db, String op,String id,String data)
    {
        if(op.equals("add")){
            return db + "#" + id + data;
        } else if(op.equals("edit")){
            return db.substring(0,db.indexOf(id)+1)+data+db.substring(db.indexOf(id)+1+data.length());
        } else if(op.equals("delete")){
            return db.substring(0,db.indexOf(id))+db.substring(db.indexOf(id)+5);
        } else {
            return db;
        }
    }

    public static int findMax (int[]arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static double findMax (double[]arr){
        double max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] mergR(int[] a,int[] b) {
        int length = a.length + b.length;
        int[] ab = new int[length];
        for (int i = 0; i < a.length; i++) {
            ab[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            ab[i+a.length] = b[i];
        }
        return ab;
    }

    public static String reverse(String input)
    {
        String reversedString = "";
        for(int i=input.length()-1; i>=0; i--){
            reversedString = reversedString + input.charAt(i);
        }
        return reversedString;

    }

    public static void test(ArrayList<Double> dubs)
    {
        //write code here
        dubs.remove(0);
        dubs.remove(0);
    }
}
