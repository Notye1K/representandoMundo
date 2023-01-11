public class Lesson {
    private Compiled compiled = new Compiled();
    private String name;
    private String subject;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompiledName() {
        return this.compiled.getName();
    }

    public String getCompiledContent() {
        return this.compiled.getContent();
    }

    public void setCompiled(String name, String content) {
        this.compiled.setName(name);
        this.compiled.setContent(content);
    }

    public String addCompiledContent(String content) {
        return this.compiled.addContent(content);
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
