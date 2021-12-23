
public class Oprators {

	public static void main(String[] args) {

		String fname;
		int age;

		fname = "kamal";

		age = (fname == "kamal") ? 40 : 99;
		System.out.println("\n");
		System.out.println(age);

		int x;
		int y;

		x = 13;

		y = (x == 13) ? 300 : 50;

		System.out.println(y);

		x = 20;

		y = (x == 30) ? 300 : 50;
		System.out.println("\n");
		System.out.println(y);

		if (x == 30) {
			System.out.println("\n");
			System.out.println(y = 300);
			System.out.println("\n");
		} else {
			System.out.println(y = 50);
		}

	}

}
