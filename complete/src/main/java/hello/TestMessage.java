package hello;

public class TextMessage {

    private final long id;
    private final String content;

    public TextMessage(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
