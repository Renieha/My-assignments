package week2.day2;

public class prime {
	
	    public static void main(String[] args) {
	        int number = 13;  // Declaring the number to check
	        boolean isPrime = true;

	        // Check if the number is less than or equal to 1 (not prime)
	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            // Check for factors other than 1 and the number itself
	            for (int i = 2; i <= number / 2; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;  // If a factor is found, break the loop
	                }
	            }
	        }

	        // Output result to the console
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	}



