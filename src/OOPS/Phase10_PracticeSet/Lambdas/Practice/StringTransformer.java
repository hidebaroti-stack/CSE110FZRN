package OOPS.Phase10_PracticeSet.Lambdas.Practice;

@FunctionalInterface
public interface StringTransformer {
    String transform(String s);
}

class Transformer {
    public static void main(String[] args) {

        // 1. Uppercase transformer
        StringTransformer toUpper = s -> s.toUpperCase();

        // 2. Reverse the string
        StringTransformer reverse = s -> new StringBuilder(s).reverse().toString();

        // 3. Remove all spaces
        StringTransformer removeSpaces = s -> s.replaceAll(" ", ""); //replaceAll("\\s+", "")

        // 4. Add "★ " prefix and " ★" suffix
        StringTransformer addStars = s -> "★ " + s + " ★";

        // 5. Lowercase transformer
        StringTransformer toLower = s -> s.toLowerCase();

        // 6. Chained transformer
        StringTransformer chain = s -> addStars.transform(removeSpaces.transform(toUpper.transform(s)));

        // Test input
        String input = "East West University";

        // Demonstration
        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + toUpper.transform(input));
        System.out.println("Lowercase: " + toLower.transform(input));
        System.out.println("Reversed: " + reverse.transform(input));
        System.out.println("No spaces: " + removeSpaces.transform(input));
        System.out.println("Starred: " + addStars.transform(input));
        System.out.println("Chained: " + chain.transform(input));

    }
}