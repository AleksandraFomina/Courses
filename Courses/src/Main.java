import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task[] tasks = new Task[100];
        createTasks(tasks);
        Mentor mentor1 = new Mentor("Иван", "Иванов", 25);
        Mentor mentor2 = new Mentor("Марина", "Петрова", 25);
        Student[] students = new Student[10];
        createStudents(students, mentor1, mentor2);
        Random random = new Random();
        solveTasksByStudents(students, tasks, random);

    }

    private static void solveTasksByStudents(Student[] students, Task[] tasks, Random random) {
        Scanner scanner = new Scanner(System.in);
        while (Student.getCountSolvedTaskForAll() != tasks.length * students.length) {
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
            switch (i % 3) {
                case 0 -> {
                    Test test = new Test();
                    test.setNumber(i + 1);
                    tasks[i] = test;
                }
                case 1 -> {
                    Code code = new Code();
                    code.setNumber(i + 1);
                    tasks[i] = code;
                }
                case 2 -> {
                    DragAndDrop dAndD = new DragAndDrop();
                    dAndD.setNumber(i + 1);
                    tasks[i] = dAndD;
                }
            }
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
