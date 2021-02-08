import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class Book {
	private final String firstDay = "01-Jan-1970";

	private final String toDay = "10-Dec-2020";

	private String title;
	private String author;
	private int daysTaken;
	private String dateTaken;

	public String getDateTaken() {
		return dateTaken;
	}

	public void setDateTaken(String dateTaken) {
		this.dateTaken = dateTaken;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getDaysTaken() {
		return daysTaken;
	}

	public void setDaysTaken(int daysTaken) {
		this.daysTaken = this.toDays(dateTaken);
	}

	public abstract int daysOverdue();

	public abstract boolean isOverdue();

	public abstract int computeFine();

	public int toDays(String date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date1 = LocalDate.parse(this.getFirstDay(), dtf);
		LocalDate date2 = LocalDate.parse(date, dtf);
		return (int) (ChronoUnit.DAYS.between(date1, date2));
	}

	public String getFirstDay() {
		return firstDay;
	}

	public String getToDay() {
		return toDay;
	}
}
