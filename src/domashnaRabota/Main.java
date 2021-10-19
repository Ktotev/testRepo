package domashnaRabota;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int anualFee = sc.nextInt();


        double trainers = anualFee - anualFee * 0.4;
        double clothes = trainers * 0.80;
        double basketball = clothes / 4;
        double accesories = basketball / 5;

        double totalCost = anualFee + trainers + clothes + basketball + accesories;

        System.out.println(String.format("%.2f",totalCost));
    }
}