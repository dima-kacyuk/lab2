package lab2;

public class Task02 {

	public static void main(String[] args) {
		int two = 2;
		int n = 3;
		System.out.println("Степень двойки: " + degree(two, n));
		// -----------------
		int randomNumber = 5;
		factorial(randomNumber);
		// -----------------
		int a = 3;
		int b = 5;
		numbersResult(a, b);
		// -----------------
		int hight = 5; //metrs
		double g = 9.8; //g ≈ 9,8 м/с2 - ускорение свободного падения
		speedOfFall(hight, g);
		// -----------------
		int catheter1 = 3;
		int catheter2 = 0;
		int hypotenuse = 8;
		System.out.println("Катет прям. треугольника = " + findCatheter(catheter1, catheter2, hypotenuse));

	}

	private static double findCatheter(int catheter1, double catheter2, int hypotenuse) {
		catheter2 = Math.sqrt((hypotenuse*hypotenuse)-(catheter1*catheter1));
		return catheter2;
	}

	private static void speedOfFall(int hight, double g) {
		double t = Math.sqrt((2 * hight)/g);//t - time
		System.out.println("\nВремя свободного падения с 5-и метров: " + t);
		
	}

	private static void numbersResult(int a, int b) {
		int temp;
		temp = a + b;
		System.out.print("Сумма чисел, разница, произведение: " + temp);
		if (a > b) {
			temp = a - b;
			System.out.print(", " + temp);
		} else {
			temp = b - a;
			System.out.print(", " + temp);
		}
		temp = a * b;
		System.out.print(", " + temp);

	}

	private static void factorial(int randomNumber) {
		int temp = 1;
		for (int i = randomNumber; i > 0; i--) {
			temp *= i;
		}
		System.out.println("Факториал числа " + randomNumber + "! = " + temp);

	}

	private static int degree(int two, int n) {
		for (int i = 1; i < n; i++) {
			two *= 2;
		}
		return two;
	}

}
