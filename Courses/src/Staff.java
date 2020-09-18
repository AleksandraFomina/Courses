public interface Staff {
    void helpToStudent(Student student);
    default void giveAddMaterial(){
        System.out.println("Много полезного можно найти здесь https://habr.com/ru/");
    }
}
