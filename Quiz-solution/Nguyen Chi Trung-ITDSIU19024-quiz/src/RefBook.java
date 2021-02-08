public class RefBook extends Book {
	public RefBook() {
		this.setAuthor(null);
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
			fine = fine + (this.daysOverdue() * 10000);
		} else {
			System.out.print("This book is not overdue. Total payment: ");
			return fine + this.daysOverdue() * 5000;
		}
		return fine;
	}

	@Override
	public String toString() {
		return "ReferenceBook:\n -Title : " + this.getTitle() + "\n -Days Taken : " + this.getDateTaken();
	}
}
