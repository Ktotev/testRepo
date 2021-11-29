package classworkclassses;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 

        Scanner sc = new Scanner(System.in);

 

        String a = sc.nextLine();

 ///shahsakdsblajkvfblkjsdv

        if (a.equals("dog")) {
            System.out.println("mammal");
        } else if (a.equals("crocodile") || a.equals("tortoise") || a.equals("snake")) {
            System.out.println("reptile");
        } else if (a.equals("others")) {
            System.out.println("unknown");
        }

 

    }
}