package ro.lucas;

import java.util.ArrayList;

public class FAQ extends Manuscript {
    private String _title;
    private ArrayList<String> _questions;
    private Modifier mod;

    public FAQ(String title, ArrayList<String> questions, Modifier mod) {
        super(mod);
        this.mod = mod;
        _title = title;
        _questions = questions;
    }

    public String getTitle() {
        return _title;
    }

    public ArrayList<String> getQuestions() {
        return _questions;
    }

    public void print() {
        mod.print();
        System.out.println(_title + ":");
        for (String question : _questions) {
            System.out.println(question);
        }
    }
}