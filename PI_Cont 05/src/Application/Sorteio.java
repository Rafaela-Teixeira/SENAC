package Application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;

public class Sorteio {

	public static void main(String[] args) {

		ArrayList<Integer> urna = new ArrayList<Integer>();

		for (int i = 1; i <= 13; i++)
			urna.add(i);

		Collections.shuffle(urna);
		Collections.shuffle(urna);
		Collections.shuffle(urna);

		System.out.print("1o dia: ");
		for (int i = 0; i <= 3; i++)
			System.out.print(urna.get(i) + "\t");  //  \t - tab para centralizar

		System.out.print("\n20 dia: ");
		for (int i = 4; i <= 7; i++)

			System.out.print(urna.get(i) + "\t");

		System.out.print("\n3o dia: ");
		for (int i = 8; i <= 12; i++)
			System.out.print(urna.get(i) + "\t");

	}

}
