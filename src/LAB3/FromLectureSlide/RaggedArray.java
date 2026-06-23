package LAB3.FromLectureSlide;

public class RaggedArray {
    public static void main(String[] args) {
        // Initialize raggedArray
        int[][] raggedArray = {
                {0},
                {1, 2},
                {3, 4, 5},
                {7, 8, 9, 10}
        };
        // Print raggedArray
        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}