public interface Autochecked {
    default void performTask() {
        System.out.println("Задание выполнено!!!");
    }
}
