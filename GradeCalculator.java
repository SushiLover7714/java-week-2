import java.util.Scanner;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = input.nextInt();
        int[][] gradeArr = new int[numStudents][numSubjects];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("For Student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ":");
                gradeArr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < numStudents; i++) {
            System.out.println(Arrays.toString(gradeArr[i]));
        }
        for (int i = 0; i < numStudents; i++) {
            int sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                sum = gradeArr[i][j] + sum;
            }
            System.out.println("For students: " + (i + 1) + " Average grade is " + (sum / numSubjects));
        }
    }
}
