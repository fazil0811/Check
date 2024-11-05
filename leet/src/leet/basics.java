package leet;

import java.util.*;

public class basics {

	public static void main(String[] args) {

		int age;

		Scanner n = new Scanner(System.in);

		System.out.println("Enter your age");

		age = n.nextInt();

		if (age >= 18) {

			System.out.println("Eligible for voting");

		}

		else {

			System.out.println("Not Eligible for voting");

		}

	}

}