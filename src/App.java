public class App {
    public static void main(String[] args) throws Exception {
        var lesson = new Lesson();
        lesson.setName("java");
        lesson.setSubject("Classes");
        lesson.setCompiled("Encapsulamento", "lorem Ipsum");
        lesson.addCompiledContent("ipsum");

        System.out.println(lesson.getCompiledContent());
    }
}
