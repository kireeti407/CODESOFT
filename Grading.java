import java.util.Scanner;
class Grading{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of subjects:");
        int no_Subjects = inp.nextInt();

        int[] marks = new int[no_Subjects];
        for (int i = 0; i < no_Subjects; i++) {
            System.out.print("\nEnter the marks for subject " + (i + 1) + ":");
            marks[i] = inp.nextInt();
        }
        cal_Results(marks);
    }
    public static void cal_Results(int[] marks) {
        int to_Marks = 0;
        for (int i : marks) {
            to_Marks += i;
        }
        double avg_Per = (double) to_Marks / marks.length;
        char grade;
        if (avg_Per >= 90) {
            grade = 'A';
        } else if (avg_Per >= 80) {
            grade = 'B';
        } else if (avg_Per >= 70) {
            grade = 'C';
        } else if (avg_Per >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.err.println("___________________________________________your Result________________________________________\n");
        System.out.println("                   Total Marks          : " +to_Marks);
        System.out.println("                   Average Percentage   : " + avg_Per+ "%");
        System.out.println("                   Grade                : " + grade);
        System.err.println("\n________________________________________Thanks_______________________________________________");
    }
}
