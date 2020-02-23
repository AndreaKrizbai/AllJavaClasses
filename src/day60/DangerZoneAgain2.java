package day60;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class DangerZoneAgain2 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("THE START");
            readMyFile();

        Thread.sleep(3000);
        System.out.println("THE END");

    }

    //FileNotFoundException extends IOException
    public static void readMyFile() {
        System.out.println("Reading the file in my computer");
        try {
            throw new FileNotFoundException("Kaboom!! File is not here!! ");
           // Files.readAllLines(Paths.get("PUT YOUR FILE PATH HERE"));
        } catch (IOException e) {
            System.out.println("AHA!! CAUGHT YOU IN readMyFile");
        }
    }
}
