package day59;

import java.io.IOException;

public class DangerZone {
    public static void main(String[] args) {//throws IOException {
        try{
            playWithFire();
        }catch(IOException e){
            System.out.println("GO HERE IF YOU GOT BURNED");
        }
    }

    public static void playWithFire() throws IOException {
        System.out.println("some consequences might happen");
        throw new IOException("NOW YOU ACTUALLY GOT BURNED");
    }
}
