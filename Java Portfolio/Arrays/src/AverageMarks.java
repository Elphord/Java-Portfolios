public class AverageMarks {
    public static void main(String[] args) {
        int[] marks = {75, 80, 60, 90, 85};
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.length;
        System.out.println("Average marks in Physics: " + average);
    }
}