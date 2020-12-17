package com.cg.codes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(new File("C:\\Users\\Shaivi Sinha\\SearchDirectory\\src\\com\\cg\\codes\\Book1.csv"));
		Scanner sc1 = new Scanner(System.in);
		sc.useDelimiter(",");
		ArrayList<Employee> edetails = new ArrayList<>();
		while (sc.hasNext()) {
			String temp1 = sc.next();
			String temp2 = sc.next();
			Employee emp = new Employee(temp2, temp1);
			edetails.add(emp);
		}
		System.out.println("Enter the starting letter(s) of name");
		String c = sc1.next();
		List<Employee> result = edetails.stream().filter(s -> s.getName().startsWith(c)).collect(Collectors.toList());
		Abc obj = (n) -> {
			result.forEach((y) -> {
				System.out.println("Employee Name: "+y.getName() +" Contact Number:  "+ y.getNumber());
			});
		};
		obj.display(result);
		obj.show1();
		Abc.show2();
		sc.close();
	}
}
