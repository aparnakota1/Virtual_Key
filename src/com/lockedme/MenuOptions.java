package com.lockedme;

public class MenuOptions {
	public static void printWelcomeScreen() {
		System.out.println("              *******************                ");
		System.out.println("*                                               *");
		System.out.println("*        Application name : LockedMe.com        *");
		System.out.println("*                                               *");
		System.out.println("              *******************                ");
		System.out.println("Developer Details :\n");
		System.out.println("1) Name          - Aparna Kota");
		System.out.println("2) Designation   - Developer");
		System.out.println("3) Company       - Wipro pvt. Ltd\n");
		System.out.println("             Greetings      ");
		System.out.println("               *****\n");
		System.out.println("*              *");
		System.out.println("* Main Window  *");
		System.out.println("*              *");
		String appFunction = "You can use this application to :-\n"
				+ "1) Retrieve all file names in the \"main\" folder\n"
				+ "2) Search, add, or delete files in \"main\" folder.\n"
				+ "\n*Please be careful to ensure the correct filename is provided for searching or deleting files.*\n";

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\n\n*** Select any option number from below and press Enter ***\n\n"
				+ "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n*** Select S option number from below and press Enter ***\n\n"
				+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}
}
