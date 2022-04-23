package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		String[] names = new String[5];

		names[0] = "Jill";
		names[1] = "Joe";
		names[2] = "Jem";
		names[3] = "Jessy";
		names[4] = "Jack";

		// 2. print the third element in the array

		System.out.println(names[2]);

		// 3. set the third element to a different value
		names[2] = names[3];
		// 4. print the third element again
		System.out.println(names[2]);
		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		for (int i = 0; i < names.length; i++) {
			names[i] = "Bob";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// 7. make an array of 50 integers
		int[] ints = new int[50];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = i;
		}
		// 8. use a for loop to make every value of the integer array a random
		// number
		Random rand = new Random();
		for (int i = 0; i < ints.length; i++) {
			int RandomNumber = rand.nextInt(50);
			ints[i] = RandomNumber;

		}

		// 9. without printing the entire array, print only the smallest number
		// on the array
		for (int i = 0; i < ints.length - 1; i++) {
			if (ints[i] > ints[i + 1]) {
				ints[i] = ints[i + 1];
			} else if (ints[i] > ints[0]) {
				ints[i] = ints[0];
			}

		}
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		// 11. print the largest number in the array.

		// 12. print only the last element in the array

	}
}
