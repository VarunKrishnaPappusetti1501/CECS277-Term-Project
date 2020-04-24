package TermProject;

public class SingletonRunner {

	public static void main(String[] args) {
		// Gets a single initialized RoachMotel
		RoachMotel test = RoachMotel.getRoachMotel();
		test.setName("RoachMotel");
		test.getName();

	}

}
