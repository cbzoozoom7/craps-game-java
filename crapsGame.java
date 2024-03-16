//tested in JCreator
import java.util.Scanner;
public class crapsGame {
	public static void main (String[]  args) {
		Scanner myScanObj = new Scanner(System.in);
		System.out.print("Press enter to roll.");
		String trash = myScanObj.nextLine();
		int rollOne = (int) ((Math.random()*11)+2);
		if (rollOne == 8 || rollOne == 11) {
			System.out.println("You rolled an " + rollOne + ".");
		} else {
			System.out.println("You rolled a " + rollOne + ".");
		}
		if (rollOne == 7 || rollOne == 11) {
			System.out.println("You win!");
		} else if (rollOne == 2 || rollOne == 3 || rollOne == 12) {
			System.out.println("Craps.");
		} else {
			System.out.println("That's your point.");
			int rollTwo = 0;
			while (rollOne != rollTwo && rollTwo != 7) {
				System.out.println("Keep rolling.");
				System.out.println("Press enter to roll.");
				trash = myScanObj.nextLine();
				rollTwo = (int) ((Math.random()*11)+2);
				if (rollTwo == 8 || rollTwo == 11) {
					System.out.println("You rolled an " + rollTwo + ".");
				} else {
					System.out.println("You rolled a " + rollTwo + ".");
				}
			}
			if (rollTwo == 7) {
				System.out.println("You lose.");
			} else {
				System.out.println("You win!");
			}
		}
	}
}