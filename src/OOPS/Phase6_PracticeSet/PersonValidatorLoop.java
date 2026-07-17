package OOPS.Phase6_PracticeSet;

public class PersonValidatorLoop {
    // Method to validate name and age
    static void validatePerson(String name, int age) throws AppException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name cannot be null or empty!");
        }
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150!");
        }
        System.out.println("Valid person: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        String[] names = {"Debaroti", "", "Manik"};
        int[] ages = {19, 25, 200};

        for (int i = 0; i < names.length; i++) {
            try {
                validatePerson(names[i], ages[i]);
            } catch (InvalidNameException e) {
                System.out.println("Invalid Name: " + e.getMessage());
            } catch (InvalidAgeException e) {
                System.out.println("Invalid Age: " + e.getMessage());
            } catch (AppException e) {
                System.out.println("General AppException: " + e.getMessage());
            }
        }
    }

}