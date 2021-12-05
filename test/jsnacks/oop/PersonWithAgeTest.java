package jsnacks.oop;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonWithAgeTest {

	private PersonWithAge p;
	private LocalDate today;
	
	@BeforeEach
	void setup() {
		today = LocalDate.now();
	}
	
	@Test
	@DisplayName("Invalid constructor parameters")
	void constructorTest() {
		
		assertThrows(IllegalArgumentException.class, ()->{
			p = new PersonWithAge(null, 1980, 12, 2);
		});
		assertThrows(IllegalArgumentException.class, ()->{
			p = new PersonWithAge("Pinco", 1980, 13, 2);
		});
		assertThrows(IllegalArgumentException.class, ()->{
			p = new PersonWithAge("Pinco", today.getYear()+1, 12, 2);
		});
	}
	
	@Test
	@DisplayName("Get age")
	void getAgeTest() {
		LocalDate thirtyYearsBefore = today.minusYears(30);
		p = new PersonWithAge("Pinco", thirtyYearsBefore.getYear(), thirtyYearsBefore.getMonthValue(), thirtyYearsBefore.getDayOfMonth());
		assertEquals(p.getAge(), 30);
	}
	
	@Test
	@DisplayName("Get days to next birthday forward")
	void getDaysToNextBirthdayForwardTest() {
		LocalDate thirtyYearsAgo = today.minusYears(30);
		LocalDate upcomingBirthday = thirtyYearsAgo.plusDays(30);
		p = new PersonWithAge("Pinco", upcomingBirthday.getYear(), upcomingBirthday.getMonthValue(), upcomingBirthday.getDayOfMonth());
		assertEquals(p.getDaysToNextBirthday(), 30);
	}
	
	@Test
	@DisplayName("Get days to next birthday backward")
	void getDaysToNextBirthdayBackwardTest() {
		LocalDate thirtyYearsAgo = today.minusYears(30);
		LocalDate passedBirthday = thirtyYearsAgo.minusDays(30);
		p = new PersonWithAge("Pinco", passedBirthday.getYear(), passedBirthday.getMonthValue(), passedBirthday.getDayOfMonth());
		assertEquals(p.getDaysToNextBirthday(), 365-30);
	}

}
