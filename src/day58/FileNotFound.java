package day58;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFound {
    public static void main(String[] args) throws
            Exception {
        System.out.println("BEFORE Try-Catch");
        Files.readAllLines(Paths.get("file.txt"));

//       try {
//           Files.readAllLines(Paths.get("file.txt"));
//       } catch (IOException e){
//           System.out.println("Exception happened and caught!");
//       }
        System.out.println("AFTER Try-Catch");
    }
}
