package com.employees.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.employees.models.Contact;
import com.employees.models.Employee;
import com.employees.models.Gender;
import com.employees.models.Level;

public class EmployeesData {

	private static String headers[] = { "Name", "EmpID", "Age", "Gender", "StartDate", "Level", "Team", "Title",
			"Phone", "eMail" };

	private static String firstNameList[] = { "James", "David", "Christopher", "George", "Ronald", "Gary", "Frank",
			"Raymond", "Dennis", "Douglas", "John", "Richard", "Daniel", "Kenneth", "Anthony", "Timothy", "Scott",
			"Jack", "Walter", "Henry", "Robert", "Charles", "Paul", "Steven", "Kevin", "Jose", "Eric", "Gregory",
			"Patrick", "Carl", "Michael", "Joseph", "Mark", "Edward", "Jason", "Larry", "Stephen", "Joshua", "Peter",
			"Arthur", "William", "Thomas", "Donald", "Brian", "Matthew", "Jeffrey", "Andrew", "Jerry", "Harold",
			"Ryan" };

	private static String lastNameList[] = { "Johnson", "Brown", "Miller", "Jones", "Smith", "Williams", "Lee",
			"Taylor", "Garcia", "Nguyen", "Anderson", "Jackson", "Robinson", "Martinez", "Baker", "King", "Harris",
			"Rodriguez", "Welsh", "Davis", "Martin", "Müller", "Hernandez", "Weaver", "Thompson", "Clark", "Thomas",
			"Hall", "Moore", "Roberts", "Wilson" };

	public static String[] getHeaders() {
		return headers;
	}

	public static String[][] getEmployeeData() {
		List<Employee> emps = populateEmployeesRandom();
		return getEmployeeData(emps);
	}

	private static String[][] getEmployeeData(List<Employee> emps) {

		String empData[][] = new String[headers.length][emps.size()];
		for (int i = 0; i < headers.length; i++) {
			for (int j = 0; j < emps.size(); j++) {
				empData[j] = getEmployeesDataArray(emps.get(j));
			}
		}
		return empData;
	}

	private static List<Employee> populateEmployeesRandom() {
		List<Employee> emps = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			String name = generateRandomNames();
			emps.add(new Employee(generateRandomAge(), new Contact(generateRandomNumber(10), generateEmail(name)),
					Long.valueOf(generateRandomNumber(6)), Gender.Male, Level.AdvanceSenior, name, name, "randomTitle",
					new Date(), "TeamTitle"));
		}
		return emps;
	}

	private static String generateEmail(String name) {
		return name.toLowerCase().replace(" ", ".") + "@gmail.com";
	}

	private static String generateRandomNumber(int length) {

		String alphabets = "1234567890";
		StringBuilder builder = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			builder.append(alphabets.charAt((int) (alphabets.length() * Math.random())));
		}
		return builder.toString();
	}

	private static int generateRandomAge() {
		Random random = new Random();
		int age = random.nextInt((60 - 25) + 1) + 25;
		return age;
	}

	private static String generateRandomNames() {
		String firstName = firstNameList[(int) (firstNameList.length * Math.random())];
		String lastName = lastNameList[(int) (lastNameList.length * Math.random())];
		return firstName + " " + lastName;
	}

	private static String[] getEmployeesDataArray(Employee emp) {
		String[] empDataArray = { emp.getName(), emp.getEmployeeId().toString(), String.valueOf(emp.getAge()),
				emp.getGender().name(), emp.getStartDate().toString(), emp.getLevel().name(), emp.getTeamInfo(),
				emp.getPositionTitle(), emp.getContactInfo().getPhoneNumber(), emp.getContactInfo().getEmail() };
		return empDataArray;
	}
}
