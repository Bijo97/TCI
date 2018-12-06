package book;

public class Chapter {
    private String name;
    private int number;

    public Chapter() {
    }

    public Chapter(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
