
public class Firefox {
    // TODO Auto-generated method stub
    float browserVersion = 100.2f;      
    String browserName = "firefox";     
    boolean isVisible = true;           
    int releaseYear = 1998;             
    char browserLogo = 'f';             

    public static void main(String[] args) {
        // Create an object of Firefox class
        Firefox firefox = new Firefox();
        
        // Print the values
        System.out.println("Browser Version: " + firefox.browserVersion);
        System.out.println("Browser Name: " + firefox.browserName);
        System.out.println("Is Visible: " + firefox.isVisible);
        System.out.println("Release Year: " + firefox.releaseYear);
        System.out.println("Browser Logo: " + firefox.browserLogo);
    }
}

