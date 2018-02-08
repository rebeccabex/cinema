package cinema.cinema;

import java.util.Scanner;

public class CLInterface {
	
	private Scanner reader;

    public CLInterface() {
        reader = new Scanner(System.in);
}
	public String getInput(String prompt) {
		System.out.println(prompt);
		return reader.next();
	}
	
	public void setDelimiter(String delimiter) {
        reader.useDelimiter(delimiter);
	}
}
