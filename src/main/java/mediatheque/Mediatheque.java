package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
    private final List<Item> items = new LinkedList<>();

    public VisitorBook visitorBook = new VisitorBook();
    public VisitorCd visitorCd = new VisitorCd();
    public VisitorItems visitorItems = new VisitorItems();

    public void addItem(Item i) {
        items.add(i);
    }

    public void printCatalog() {
        for (Item i : items) {
            System.out.println(i.accept(visitorItems));
        }
    }

    public void printOnlyBooks() {
        for (Item i : items) {
            System.out.println(i.accept(visitorBook));

        }
    }

    public void printOnlyCDs() {
        for (Item i : items) {
            System.out.println(i.accept(visitorCd));

        }

    }
}
