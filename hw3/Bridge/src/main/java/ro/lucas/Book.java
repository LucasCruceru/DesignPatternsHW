package ro.lucas;

public class Book extends Manuscript {
    private String _title, _text, _author;
    private Modifier mod;

    public Book(String title, String text, String author, Modifier modifier) {
        super(modifier);
        this.mod = modifier;
        _title = title;
        _text = text;
        _author = author;
    }

    public String getTitle() {
        return _title;
    }

    public String getText() {
        return _text;
    }

    public String getAuthor() {
        return _author;
    }

    public void print() {
        mod.print();
        System.out.println("=====" + _title + "=====");
        System.out.println("            by " + _author);
        System.out.println(_text);
    }
}