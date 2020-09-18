public class DragAndDrop extends Task implements Autochecked {
    private String[][] variants;

    public DragAndDrop() {
        super();
        variants = new String[][]{{"java", "питон"}, {"язык программирования", "змея"}};
        super.setTextOfTask("Соотнесите элементы с их значениями");
    }

    public String[][] getVariants() {
        return variants;
    }

    public void setVariants(String[][] variants) {
        this.variants = variants;
    }
}
