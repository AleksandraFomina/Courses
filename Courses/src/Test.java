public class Test extends Task implements Autochecked {
    private String[] answers;

    public Test() {
        super();
        this.answers = new String[] {"a", "b", "c"};
        super.setTextOfTask("Реши тест");
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
}
