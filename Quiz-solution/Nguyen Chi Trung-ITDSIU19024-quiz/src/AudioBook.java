
public class AudioBook extends Book {
	public AudioBook() {
		
	}

	@Override
	public int daysOverdue() {
		int days = this.toDays(getToDay());
		return ((days - this.getDaysTaken()) - 14);
	}

	@Override
	public boolean isOverdue() {
		return (this.daysOverdue() > 0);
	}

	@Override
	public int computeFine() {
		int fine = 5000 * 14;
		if (this.isOverdue()) {
			System.out.print("This book is overdue. Total payment: ");
			fine = fine + (this.daysOverdue() * 20000);
		} else {
			System.out.print("This book is not overdue. Total payment: ");
			return fine + this.daysOverdue() * 5000;
		}
		return fine;
	}

	@Override
	public String toString() {
		return "AudioBook:\n -Title : " + this.getTitle() + "\n -Author : " + this.getAuthor() + "\n -Days Taken : " + this.getDateTaken();
	}
}
