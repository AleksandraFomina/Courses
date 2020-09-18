abstract class Task {
    private int number;
    private String textOfTask;

    public Task() {
        number = 0;
        textOfTask = "";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTextOfTask() {
        return textOfTask;
    }

    public void setTextOfTask(String textOfTask) {
        this.textOfTask = textOfTask;
    }
}
