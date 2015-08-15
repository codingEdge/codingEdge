package exercises5;


/* A Task that can be added to your Todo List.
 * 
 * */
public class Task {

	// Fields
	private String name;
	private int priority;
	private String dueMonth;
	private int dueDay;
	
	// Constructors
	public Task(String name) throws BlankNameException {
		this.setName(name);
		this.priority = 0;
		this.dueMonth = "January";
		this.dueDay = 1;
	}
	
	public Task(String name, String priority, String dueMonth, String dueDay) 
			throws InvalidPriorityException, InvalidMonthException, InvalidDayException, BlankNameException {
		this.setName(name);
		this.setPriority(priority);
		this.setDueDate(dueMonth, dueDay);
	}

	// Methods
	public String getName() {
		return name;
	}

	public void setName(String name) throws BlankNameException {
		if (name.equals("")) {
			throw new BlankNameException();
		}
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	// TODO
	/* Given an integer, set the this tasks priority to this value. If the given priority
	 * is negative, throw an InvalidPriorityException
	 * */
	public void setPriority(int priority) throws InvalidPriorityException {
		if (priority < 0) {
			throw new InvalidPriorityException();
		}
		this.priority = priority;
	}
	
	public void setPriority(String priority) throws InvalidPriorityException {
		int priorityInt;
		try {
			priorityInt = Integer.parseInt(priority);
		} catch (NumberFormatException e) {
			throw new InvalidPriorityException();
		}
		this.setPriority(priorityInt);
	}

	public String getDueMonth() {
		return dueMonth;
	}

	// TODO
	/* Given a string, set the due month of the task if the string represents a valid month.
	 * Examples of valid months may be "1", "january", or "jan".  You should ignore the case
	 * of the input string.
	 * 
	 * When setting the month, the full name of the month should be used starting with a capital.
	 * For example, this.dueMonth = "January"
	 * */
	private void setDueMonth(String dueMonth) throws InvalidMonthException {
		dueMonth = dueMonth.toLowerCase();
		this.dueMonth = Task.toMonthStandardFormat(dueMonth);
	}

	public static String toMonthStandardFormat(String monthToFormat) throws InvalidMonthException {
		if (monthToFormat.equals("1") || monthToFormat.equals("jan") || monthToFormat.equals("january")) {
			return "January";
		} else if (monthToFormat.equals("2") || monthToFormat.equals("feb") || monthToFormat.equals("february")) {
			return "February";
		} else if (monthToFormat.equals("3") || monthToFormat.equals("mar") || monthToFormat.equals("march")) {
			return "March";
		} else if (monthToFormat.equals("4") || monthToFormat.equals("apr") || monthToFormat.equals("april")) {
			return "April";
		} else if (monthToFormat.equals("5") || monthToFormat.equals("may")) {
			return "May";
		} else if (monthToFormat.equals("6") || monthToFormat.equals("jun") || monthToFormat.equals("june")) {
			return "June";
		} else if (monthToFormat.equals("7") || monthToFormat.equals("jul") || monthToFormat.equals("july")) {
			return "July";
		} else if (monthToFormat.equals("8") || monthToFormat.equals("aug") || monthToFormat.equals("august")) {
			return "August";
		} else if (monthToFormat.equals("9") || monthToFormat.equals("sep") || monthToFormat.equals("september")) {
			return "September";
		} else if (monthToFormat.equals("10") || monthToFormat.equals("oct") || monthToFormat.equals("october")) {
			return "October";
		} else if (monthToFormat.equals("11") || monthToFormat.equals("nov") || monthToFormat.equals("november")) {
			return "November";
		} else if (monthToFormat.equals("12") || monthToFormat.equals("dec") || monthToFormat.equals("december")) {
			return "December";
		} else {
			throw new InvalidMonthException();
		}
	}

	public int getDueDay() {
		return dueDay;
	}

	// TODO
	/* Given a dueDay represented as an integer, set the due day of this task to this integer.
	 * We assume that this.dueMonth is already set.
	 * */
	private void setDueDay(int dueDay) throws InvalidDayException {
		if (dueDay < 1) {
			throw new InvalidDayException();
		}
		if (this.dueMonth == "January") {
        	if (dueDay > 31) {
	        	throw new InvalidDayException();
	        }
		} else if (this.dueMonth == "February") {
        	if (dueDay > 28) {
	        	throw new InvalidDayException();
	        }
		} else if (this.dueMonth == "March") {
	        if (dueDay > 31) {
	        	throw new InvalidDayException();
	        }
		} else if (this.dueMonth == "April") {
        	if (dueDay > 30) {
	        	throw new InvalidDayException();
	        }
		} else if (this.dueMonth == "May") {
        	if (dueDay > 31) {
	        	throw new InvalidDayException();
	        }
		} else if (this.dueMonth == "June") {
        	if (dueDay > 30) {
	        	throw new InvalidDayException();
	        }
		} else if (this.dueMonth == "July") {
        	if (dueDay > 31) {
	        	throw new InvalidDayException();
	        }
		} else if (this.dueMonth == "August") {
        	if (dueDay > 31) {
	        	throw new InvalidDayException();
	        }
		} else if (this.dueMonth == "September") {
        	if (dueDay > 30) {
	        	throw new InvalidDayException();
	        }
		} else if (this.dueMonth == "October") {
        	if (dueDay > 31) {
	        	throw new InvalidDayException();
	        }
		} else if (this.dueMonth == "November") {
        	if (dueDay > 30) {
	        	throw new InvalidDayException();
	        }
		} else if (this.dueMonth == "December") {
        	if (dueDay > 31) {
	        	throw new InvalidDayException();
	        }
		}
		this.dueDay = dueDay;
	}
	
	/* It is easier to work with dueDays when they are represented as integers.
	 * This will convert the string input from our application to an integer.  If
	 * the string we recieve is not a valid number, we throw an InvalidDayException.
	 * */
	private void setDueDay(String dueDay) throws InvalidDayException {
		int dayInt;
		try {
			dayInt = Integer.parseInt(dueDay);
		} catch (NumberFormatException e) {
			throw new InvalidDayException();
		}
		this.setDueDay(dayInt);
	}
	
	/* Given two strings representing the month and day, set the due month and 
	 * due day of this task.
	 * 
	 * The methods setDueMonth and setDueDay throw InvalidMonthException and
	 * InvalidDayException respectively if their inputs are invalid.
	 * 
	 * Note that since determining whether or not the day is valid or invalid is
	 * dependent on the month, we attempt to set the month first.
	 * 
	 * */
	public void setDueDate(String month, String day) throws InvalidMonthException, InvalidDayException {
		this.setDueMonth(month);
		this.setDueDay(day);
	}
	
}
