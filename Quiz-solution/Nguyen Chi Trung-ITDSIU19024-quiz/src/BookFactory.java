public class BookFactory {
	public Book getBook(String type) {
		switch(type) {
		case "Audio":
			return new AudioBook();
		case "Ref":
			return new RefBook();
		case "Reg":
			return new RegBook();
		}
		return null;
	}
}
