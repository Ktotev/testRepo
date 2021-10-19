package totevproject;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		System.out.println("arr before = " + Arrays.toString(arr));
		int[] arr2 = new int[arr.length];
		System.out.println("arr2 before = " + Arrays.toString(arr2));
		
		for(int i=0; i < arr.length; i++) {
			
			arr2[i] = arr[i];
		}
		System.out.println("arr2 = " + Arrays.toString(arr2));
		
		arr[0] = 6;
		System.out.println("arr after = " + Arrays.toString(arr));
		System.out.println("arr2 after = " + Arrays.toString(arr2));
		

	}
}