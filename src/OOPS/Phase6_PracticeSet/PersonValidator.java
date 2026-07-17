package OOPS.Phase6_PracticeSet;

// Base Exception
class AppException extends Exception {
    AppException(String message) {
        super(message);
    }

}
// Specific Exception
class InvalidAgeException extends AppException {
    InvalidAgeException(String message) {
        super(message);
    }

}
class InvalidNameException extends AppException {
    InvalidNameException(String message) {
        super(message);
    }

}

public class PersonValidator {
    // Method to validate name and age
    static void validatePerson(String name, int age) throws AppException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name cannot be null or empty!");
        }
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 to 150!");
        }
        System.out.println("Valid person: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        // Case 1: Valid input
        try {
            validatePerson("Debaroti", 19);
        } catch (InvalidNameException e) {
            System.out.println("Invalid name!" + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age!" + e.getMessage());
        } catch (AppException e) {
            System.out.println("General AppException: " + e.getMessage());
        }
        // Case 2: Bad name
        try {
            validatePerson("", 25);
        } catch (InvalidNameException e) {
            System.out.println("Invalid Name: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        } catch (AppException e) {
            System.out.println("General AppException: " + e.getMessage());
        }
        // Case 3: Bad age
        try {
            validatePerson("Manik", 200);
        } catch (InvalidNameException e) {
            System.out.println("Invalid Name: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        } catch (AppException e) {
            System.out.println("General AppException: " + e.getMessage());
        }

    }
}