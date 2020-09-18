public class Code extends Task {
    private String textOfCode;

    public Code() {
        super();
        this.textOfCode = "System.out.println(\"hello world!\");";
        super.setTextOfTask("Напиши программу");
    }

    public String getTextOfCode() {
        return textOfCode;
    }

    public void setTextOfCode(String textOfCode) {
        this.textOfCode = textOfCode;
    }
}
