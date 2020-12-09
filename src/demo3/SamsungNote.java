package demo3;

public class SamsungNote extends Smartphone {
    String title;
    public SamsungNote (String title) {
        this.title=title;
    }

    @Override
    public String toString() {
        return "SamsungNote :"+title;
    }
}
