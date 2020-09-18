import java.util.Objects;

public class Student extends Person {
    // Discipline discipline = Discipline.JAVA;
    private int countTask;
    private static int countSolvedTaskForAll;
    private Mentor mentor;
    private boolean isAllTasksSolved;


    public Student(String firstName, String surname, int age, Mentor mentor) {
        super(firstName, surname, age);
        this.countTask = 0;
        this.mentor = mentor;
        isAllTasksSolved = false;
    }

    public int getCountTask() {
        return countTask;
    }

//    public void setCountTask(int countTask) {
//        this.countTask = countTask;
//    }

    public static int getCountSolvedTaskForAll() {
        return countSolvedTaskForAll;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public boolean isAllTasksSolved() {
        return isAllTasksSolved;
    }

//    public void setAllTasksSolved(boolean allTasksSolved) {
//        isAllTasksSolved = allTasksSolved;
//    }

    public void solveTasks(int count, Task[] tasks) {
        for (int i = countTask; i < countTask+count; ++i) {
            if (i < tasks.length) {
                solveTask(tasks[i]);
            } else {
                break;
            }
        }
        if (countTask == tasks.length) {
            System.out.println("все задачи решены!=)");
            isAllTasksSolved = true;
        } else {
            System.out.println("еще решены не все задачи");
            //isAllTasksSolved = false;
        }
    }

    private void solveTask(Task task) {
        if (task instanceof Autochecked) {
            ((Autochecked) task).performTask();
        } else {
            boolean isCheck = mentor.checkCode(task);
            while (!isCheck) {
                isCheck = mentor.checkCode(task);
            }
        }
        ++countTask;
        ++countSolvedTaskForAll;
    }
}
