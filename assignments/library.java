package week2.day2;

public class library {
	public static class Library {
	    // Method to add a book with a book title as input
	    public String addBook(String bookTitle) {
	        System.out.println("Book added successfully");
	        return bookTitle;  // Return the book title
	    }

	    // Method to issue a book
	    public void issueBook() {
	        System.out.println("Book issued successfully");
	    }

	    // Main method to test the Library class
	    public static void main(String[] args) {
	        Library library = new Library();  // Create an object of Library class

	        // Call both methods
	        String addedBook = library.addBook("silapathikaram");
	        System.out.println("Added Book: " + addedBook);

	        library.issueBook();  // Issue the book
	    }
	}

	public void issueBook() {
		// TODO Auto-generated method stub
		
	}

	public String addBook(String string) {
		return string;
		// TODO Auto-generated method stub
		
	}

}
	