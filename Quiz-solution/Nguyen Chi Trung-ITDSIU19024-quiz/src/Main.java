public class Main {
	public static void main(String[] args) {
		
		BookFactory book_fac = new BookFactory();
		
		Book b1 = book_fac.getBook("Audio");
		b1.setAuthor("E.L.James");
		b1.setTitle("Fifty Shades of Grey");
		b1.setDateTaken("29-Feb-2020");
		b1.setDaysTaken(b1.toDays(b1.getDateTaken()));
		System.out.println(b1);
		System.out.println(b1.computeFine() + "\n");
		
		Book b2 = book_fac.getBook("Reg");
		b2.setAuthor("George R.R. Martin");
		b2.setTitle("A Song of Ice and Fire");
		b2.setDateTaken("31-Dec-2020");
		b2.setDaysTaken(b2.toDays(b2.getDateTaken()));
		System.out.println(b2);
		System.out.println(b2.computeFine() + "\n");
		
		Book b3 = book_fac.getBook("Ref");
		b3.setTitle("Gang Of Four");
		b3.setDateTaken("1-Jan-2020");
		b3.setDaysTaken(b3.toDays(b3.getDateTaken()));
		System.out.println(b3);
		System.out.println(b3.computeFine() + "\n");
		
	}
}
