package ru.liga.refactoring.task1.demo;

import ru.liga.refactoring.task1.service.PersonService;

public class DemoApplication {

	public static void main(String[] args) {

		PersonService personService = new PersonService();
		personService.getAdultMaleUsersAverageBMI();
	}
}
