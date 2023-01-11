public class Compiled {
    private String content;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String addContent(String content) {
        this.content += content;
        return this.content;
    }

}
