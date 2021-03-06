package com.cts.j8f.ui;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.cts.j8f.model.Employee;

public class App05 {
	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(101, "Vamsy", 45600, LocalDate.of(2020, Month.OCTOBER, 11)));
		emps.add(new Employee(110, "Arun", 57600, LocalDate.of(2010, Month.OCTOBER, 11)));
		emps.add(new Employee(104, "Zameer", 35600, LocalDate.of(2011, Month.OCTOBER, 11)));
		emps.add(new Employee(103, "Chiru", 5600, LocalDate.of(2009, Month.OCTOBER, 11)));
		emps.add(new Employee(107, "Supriya", 15600, LocalDate.of(2021, Month.JANUARY, 11)));
		emps.add(new Employee(105, "Bharwa", 85600, LocalDate.of(2008, Month.OCTOBER, 11)));
		emps.add(new Employee(102, "David", 15600, LocalDate.of(2020, Month.JUNE, 11)));
		emps.add(new Employee(109, "Fhatima", 95600, LocalDate.of(2001, Month.OCTOBER, 11)));
		emps.add(new Employee(108, "Edward", 56600, LocalDate.of(2000, Month.OCTOBER, 11)));
		emps.add(new Employee(106, "George", 25600, LocalDate.of(2021, Month.OCTOBER, 11)));

		emps.stream().forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		emps.stream().forEach(e -> e.setBasicPay(e.getBasicPay()*2));
		emps.stream().forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		Optional<Employee> maxSalEmp = emps.stream().
				reduce((e1,e2) -> e1.getBasicPay()>e2.getBasicPay()?e1:e2);
		if(maxSalEmp.isPresent())
			System.out.println(maxSalEmp.get());
		System.out.println("---------------------------------------------------------");
		Optional<Employee> seniorEmp = emps.stream().
				reduce((e1,e2) -> e1.getJoinDate().isBefore(e2.getJoinDate())?e1:e2);
		if(seniorEmp.isPresent())
			System.out.println(seniorEmp.get());
		System.out.println("---------------------------------------------------------");
		Map<Integer, String> map1 = emps.stream().
				collect(Collectors.toMap(Employee::getEmpId, Employee::getName));
		System.out.println(map1);
		System.out.println("---------------------------------------------------------");
		Set<Employee> empSet = emps.stream().collect(Collectors.toSet());
		System.out.println("---------------------------------------------------------");
		emps.stream().filter(e -> e.getJoinDate().getYear()==2020).forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		emps.stream().
			filter(e -> e.getJoinDate().getYear()==2020).
			map(e -> e.getName()).
			forEach(System.out::println);
	}
}
