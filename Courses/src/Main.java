import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task[] tasks = new Task[100];
        Random random = new Random();
        createTasks(tasks);
        Mentor mentor1 = new Mentor("Иван", "Иванов", 25, random);
        Mentor mentor2 = new Mentor("Марина", "Петрова", 25, random);
        Student[] students = new Student[10];
        createStudents(students, mentor1, mentor2);
        solveTasksByStudents(students, tasks, random);

    }

    private static void solveTasksByStudents(Student[] students, Task[] tasks, Random random) {
        Scanner scanner = new Scanner(System.in);
        while (Student.getCountSolvedTaskForAll() < tasks.length * students.length) {
            for (Student student : students) {
                while (!student.isAllTasksSolved()) {
                    int count = random.nextInt(tasks.length);
                    student.solveTasks(count, tasks);
                }
            }
        }
    }

    private static void createTasks(Task[] tasks) {
        for (int i = 0; i < tasks.length; ++i) {
            Task task = null;
            switch (i % 3) {
                case 0 -> task = new Test();
                case 1 -> task = new Code();
                case 2 -> task = new DragAndDrop();
            }
            task.setNumber(i+1);
            tasks[i]=task;
        }
    }

    private static void createStudents(Student[] students, Mentor mentor1, Mentor mentor2) {
        for (int i = 0; i < students.length; ++i) {
            int age = i + 20;
            String name = "Студент" + i;
            if (i % 2 == 0) {
                students[i] = new Student(name, "Студентович", age, mentor1);
            } else {
                students[i] = new Student(name, "Студентович", age, mentor2);
            }
        }
    }
}
