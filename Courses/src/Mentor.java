import java.util.Random;

public class Mentor extends Person implements Staff {
    private boolean isGoodMood;
    private Random random;

    public Mentor(String firstName, String surname, int age) {
        super(firstName, surname, age);
        this.isGoodMood = true;
        random = new Random();
    }

    @Override
    public void helpToStudent(Student student) {
        System.out.println(student.getFirstName() + ", you can do it!");
    }

    public boolean checkCode(Task task) {
        boolean res = false;
        int rand = random.nextInt();
        if (rand > 1000) {
            isGoodMood = true;
            System.out.println("The task "+task.getNumber()+" is accepted");
            res = true;
        } else {
            isGoodMood = false;
            System.out.println("I'm in a bad mood - the task "+ task.getNumber() + " is not accepted");
        }
        return res;
    }
}
