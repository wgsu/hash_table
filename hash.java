//Wei
public class hash {
	private int[] hashArray;
	int count;
	int item = 0;
	int blank = 0;

	hash() {
		hashArray = new int[37];
	}

	public void display() {
		System.out.print("Table: ");
		for (int j = 0; j < hashArray.length; j++) {
			if (hashArray[j] != 0)
				System.out.print(hashArray[j] + " ");
			else
				System.out.print("*    * ");
			blank++;
		}

	}

	public int location(int key) {
		return key % 37;
	}

	public int getKey(int key) {
		return key;
	}

	public void blankCount() {
		int blank = 0;
		for (int b = 0; b < hashArray.length; b++) {
			if (hashArray[b] == 0) {
				blank++;
			}

		}
		System.out.println("number of blanks  are :" + blank);
	}

	boolean is50() {
		return item == 37 / 2;

	}

	boolean is75() {
		return item == 37 - (37 / 4);

	}

	public void insert(int doorToOpen, int contentToPut) {

		while (hashArray[doorToOpen] != 0) {
			doorToOpen++;// look for next empty one
			doorToOpen %= 37;// wrap
			count++;
			System.out.println("-");
		}
		hashArray[doorToOpen] = contentToPut;
		item++;

		System.out.println(" collisions #" + count);
		System.out.println("number of item in a array" + item);
	}

}


