package LAB3.FromLectureSlide;

public class InitializingArraysWithRandVal {
    public static void main(String[] args) {

        double[] myList = new double[5];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }
        for (double list : myList) {
            System.out.printf("%.2f%n", list);
        }
    }
}