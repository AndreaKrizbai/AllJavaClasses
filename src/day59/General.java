package day59;

public class General {
    public static void main(String[] args) {
//        Object o = new String("abc");
//        System.out.println(((String) o).charAt(0));
      //  System.out.println(o.charAt(1));
        System.out.println("THE START");
        String str = ""; // null; //"abc";


            try {
                System.out.println(str.charAt(0));
                System.out.println("end of try");

            } catch (NullPointerException blabla) {
                System.out.println("NO OBJECT HERE");

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("This is the rest of exceptions");
            }


//if you have multi try catch block, the most specific type should come first

            System.out.println("THE END");

        }
}
