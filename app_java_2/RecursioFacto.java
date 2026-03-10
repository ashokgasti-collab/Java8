package app_java_2;

import java.util.Scanner;

public class RecursioFacto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbe to find facorial:");
		int no = sc.nextInt();
		RecursioFacto r = new RecursioFacto();
		System.out.println(r.CalcFact(no));
		sc.close();
	}

	public int CalcFact(int n) {
		if (n >= 1) {
			return (n * CalcFact(n - 1));
		}
		return 1;
	}
}
