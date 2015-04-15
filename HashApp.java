//Wei
import java.util.Scanner;
import java.util.Random;

public class HashApp {
	public static void main(String[] args) {

		System.out.println("begin a new hash table");
		hash table = new hash();
		Random generator = new Random();
		for (int i = 0; i < 30; i++) {
			if (table.is50()) {
				System.out.println("the table is 50% full");
				table.blankCount();
				table.display();
			} else {
				if (table.is75()) {

					System.out.println("the table is 75% full");
					table.blankCount();
					table.display();
				}
			}
			int r = generator.nextInt(1000);
			System.out.println(" the reandom number is :" + r);
			int keyer = table.getKey(r);
			System.out.println(" key is being passing in here :" + keyer);
			int door = table.location(r);
			System.out.println(" key is being % in here :" + door);
			table.insert(door, keyer);

		}
		table.blankCount();
		table.display();

	}
}
