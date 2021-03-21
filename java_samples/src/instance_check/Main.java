package instance_check;

public class Main {
	public static void main (String[] args) {
		Fune hage = new Fune("hage", "battle_ship");

		System.out.println(hage.name);

		hage.name = "hige";
		System.out.println(hage.name);

	}


}
