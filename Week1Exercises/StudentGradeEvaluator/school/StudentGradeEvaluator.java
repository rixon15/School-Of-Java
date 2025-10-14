package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeEvaluator {

    void main() {

        Scanner scanner = new Scanner(System.in);


        while (true) {

            List<Integer> testScores = new ArrayList<>();
            int numberOfScannedScores = 0;
            int attendancePercentage;
            double averageGrade;
            char grade;
            String examResult;
            String name;

            //Scan student name
            System.out.print("Enter student name (or 'exit' to stop): ");
            name = scanner.nextLine();
            if (name.equals("exit")) {
                System.out.println("Program terminated");
                break;
            }

            //Scan student grades
            System.out.print("Enter 3 test scores: ");
            while(numberOfScannedScores != 3) {
                if(scanner.hasNextInt()) {
                    ++numberOfScannedScores;
                    testScores.add(scanner.nextInt());
                } else  {
                    System.out.println("Invalid input, please try again");
                    scanner.nextLine();
                    break;
                }
            }

            //Scan attendance percentage

            System.out.print("Enter attendance percentage: ");
            if(scanner.hasNextInt()) {
                attendancePercentage = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input, please try again");
                scanner.nextLine();
                break;
            }

            //Calculate the avg grade, assign the grade and determine the exam result.
            averageGrade = calculateAverageGrade(testScores);
            grade = assignGrade(averageGrade);
            examResult = averageGrade >= 70 && attendancePercentage >= 75 ? "Pass" :
                         averageGrade >= 50 && averageGrade < 70 ? "Re-exam" : "Fail";

            System.out.println("Average: " + String.format("%.1f", averageGrade) +" Grade: " + grade + " -> " + examResult);

        }

    }

    private double calculateAverageGrade(List<Integer> testScores) {
        double averageGrade = 0;

        for(int testScore : testScores) {
            averageGrade += testScore;
        }

        return averageGrade / testScores.size();
    }

    private char assignGrade(double averageGrade) {
        return switch ((int) averageGrade / 10) {
            case 10,9 -> 'A';

            case 8 -> 'B';

            case 7 -> 'C';

            case 6,5 -> 'D';

            default -> 'F';
        };
    }



}
