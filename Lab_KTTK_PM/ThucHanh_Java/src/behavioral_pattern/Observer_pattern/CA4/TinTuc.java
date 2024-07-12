package behavioral_pattern.Observer_pattern.CA4;

public class TinTuc {
    private String topic;
    private int id;

    public TinTuc(String topic, int id) {
        this.topic = topic;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
