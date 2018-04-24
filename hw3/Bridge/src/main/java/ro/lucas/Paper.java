package ro.lucas;

public class Paper extends Manuscript {
    private String _class, _text, _student;
    private Modifier mod;

    public Paper(String clas, String text, String student, Modifier mod) {
        super(mod);
        this.mod = mod;
        _class = clas;
        _text = text;
        _student = student;
    }

    public String getClas() {
        return _class;
    }

    public String getText() {
        return _text;
    }

    public String getStudent() {
        return _student;
    }

    public void print() {
        mod.print();
        System.out.println("This paper was made by " +_student + " from " + _class);
        System.out.println(_text);
    }
}
