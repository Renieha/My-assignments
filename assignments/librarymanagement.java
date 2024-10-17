package week2.day2;

public class librarymanagement {
	
	    public static void main(String[] args) {
	        library library = new library();  // Create an object of Library class

	        // Call both methods from Library class using the object
	        String addedBook = library.addBook("silapathikaram");
	        System.out.println("Added Book: " + addedBook);

	        library.issueBook();  // Issue the book
	    }
	}


	