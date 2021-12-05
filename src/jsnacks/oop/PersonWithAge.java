package jsnacks.oop;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class PersonWithAge {
	
	// Attributes
	private String name;
	private LocalDate dateOfBirth;
	
	// Constructor
	public PersonWithAge(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth) throws IllegalArgumentException{
		if(name == null) {
			throw new IllegalArgumentException("Name can not be null");
		}
		try {
			dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date of birth: " + e.getMessage());
		}
		if(dateOfBirth.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Date of birth cannot be in the future");
		}
	}
	
	// Methods
	public String getName() {
		return name;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public int getAge() {
		Period period = Period.between(dateOfBirth, LocalDate.now());
		return period.getYears();
	}
	
	public String getFormattedDate() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dateOfBirth.format(df);
	}
	
	public long getDaysToNextBirthday() {
		LocalDate today = LocalDate.now();
		LocalDate nextBirthDay = dateOfBirth.withYear(today.getYear());
		if(nextBirthDay.isBefore(today) || nextBirthDay.isEqual(today)) {
			nextBirthDay  = nextBirthDay.plusYears(1);
		}
		long days = ChronoUnit.DAYS.between(today, nextBirthDay);
		return days;
	}
}
