package model;

public class Student extends Person{

    private final int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public char calculate() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        double average = (double) sum / testScores.length;

        if (average >= 90) {
            return 'O';
        } else if (average >= 80) {
            return 'E';
        } else if (average >= 70) {
            return 'A';
        } else if (average >= 55) {
            return 'P';
        } else if (average >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }

}