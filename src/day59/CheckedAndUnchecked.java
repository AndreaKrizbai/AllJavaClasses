package day59;

import java.io.IOException;

public class CheckedAndUnchecked {
    public static void main(String[] args) throws InterruptedException {//throws IOException {
        String x = "abc";
        System.out.println("START");
       // System.out.println(x.charAt(100));
  //     try {
       //    throw new IOException("just throwing this away");
        Thread.sleep(3000);
        System.out.println("END");
   //    } catch(IOException e){
  //         System.out.println("Exception caught");
   //    }
    }
}
