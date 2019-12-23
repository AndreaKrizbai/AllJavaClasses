package day16;

import java.util.Scanner;

public class StringPractice_GoogleSearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String keywordToSearch = scan.nextLine();
        String tabTitle = keywordToSearch + " - Google Search";

        if(tabTitle.startsWith(keywordToSearch) && tabTitle.endsWith(" - Google Search") ) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
