package book;

public class Chapter {
    private String name;
    private String number;

    public Chapter() {
    }

    public Chapter(String name, String number) {
        if (name.equals(null) || !number.matches("^\\d+(\\.\\d+)?$")){
            throw new IllegalArgumentException("Name & number must be a string and number must be two level maximum!");
        }

        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }
}
