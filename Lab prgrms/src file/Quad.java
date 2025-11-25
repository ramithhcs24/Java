import java.util.Scanner;
class Quad{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value of a in the quadratic equation:");
		float a = scanner.nextFloat();
		System.out.print("Enter value of b in the quadratic equation:");
		float b = scanner.nextFloat();
		System.out.print("Enter value of c in the quadratic equation:");
		float c = scanner.nextFloat();
		if (a==0){
			System.out.println("Invalid values");
		}
		else{
			float d= (b*b)-(4*a*c);
			if (d>0) {
				float r1 =(float) (-b+ Math.sqrt(d))/(2*a);
				float r2 = (float)(-b- Math.sqrt(d))/(2*a);
				System.out.println("The roots are real and distinct");
				System.out.println("Root1= "+r1);
				System.out.println("Root2= "+r2);
			
			}
			else if (d==0) {
				float r1 = (-b)/(2*a);
				System.out.println("The roots are real and equal");
				System.out.println("Root1=Root2= "+r1);
			
			}

			else{
				System.out.println("The roots are negative and imaginary");
			}
		}
	}
}