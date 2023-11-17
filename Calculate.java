package switchStatement;

import java.util.Scanner;

public class Calculate {

	public void calculate() {
		Scanner s = new Scanner(System.in);
		String st= s.next();
		switch(st) {
		case "Add":
			int a = 25;
			int b = 25;
			int add= a+b;
			System.out.println(add);
		
		break;
			
		case "Subtract":
			int c = 55;
			int d = 25;
			int Sub= c-d;
			System.out.println(Sub);
		
		break;
		
		case "Multipication":
			int e = 4;
			int f = 25;
			int Mul= e*f;
			System.out.println(Mul);
		
		break;
		}
	}

}
