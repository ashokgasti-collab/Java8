package prctice;

import java.time.LocalDate;
import java.time.Period;

public class Calcage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dob="1989-11-18";
	
		LocalDate pr = LocalDate.of(2023, 1, 26);
		LocalDate ldob = LocalDate.parse(dob);
		LocalDate today = LocalDate.now();
		int age = Period.between(pr, today).getYears();
		System.out.println("age of person "+age);
	}

}
