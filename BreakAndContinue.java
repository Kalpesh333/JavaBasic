
/**
 * @author Kalpesh
 *
 */
public class BreakAndContinue {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);

			if (i == 4) {

				continue;
			}
			System.out.println("This will not get print when i equals to four");
		}
	}
}
