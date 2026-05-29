package LAB4;

public class Programming { //Class

    /* Problem 1:
    Create a class named 'Programming'.
    While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed.
    If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
    For example, while creating an object if we pass "Java", then "I love Java" should be printed.
     */

    //Constructor(no parameters)
    public Programming() {
        System.out.println("I love programming languages.");
    }

    //Constructor(With parameter)
    public Programming(String variable) {
        System.out.println("I love " + variable);
    }

    static void main(String[] args) {

        Programming p1 = new Programming();
        Programming p2 = new Programming("Java.");

    }

    }
