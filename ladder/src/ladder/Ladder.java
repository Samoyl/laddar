package ladder;

import java.io.IOException;
import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		double h = in.nextDouble();
		double v = in.nextDouble();
		System.out.println(((int) (h/Math.sin(Math.toRadians(v)))) + 1);
	}

}
