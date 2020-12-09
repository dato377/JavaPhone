package demo3;

public class Nokia extends Simbian {
    String title;
    public Nokia (String title) {
        this.title=title;
    }

    @Override
    public String toString() {
        return "Nokia : "+title;
    }
}
