package ro.lucas;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.org.apache.xpath.internal.operations.Mod;
import ro.lucas.implementations.Backwards;
import ro.lucas.implementations.Center;
import ro.lucas.implementations.UpperCase;

public class Main {
    public static void main(String[] args) {
        Modifier uppercase = new UpperCase();
        Modifier center = new Center();
        Modifier backwards = new Backwards();

        ArrayList<Manuscript> documents = new ArrayList<Manuscript>();
        FAQ faq = new FAQ("Nonsense questions", new ArrayList<String>(Arrays.asList("first question", "second question")), uppercase);
        Book book = new Book("Another book", "whatever text fits as content because this is a small book", "me", center);
        Paper paper = new Paper("second year", "this is my master degree paper", "Smartest Ever", backwards);

        documents.add(faq);
        documents.add(book);
        documents.add(paper);

        for (Manuscript docs: documents) {
            docs.print();
            System.out.println();
        }

    }
}
