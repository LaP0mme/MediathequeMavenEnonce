package mediatheque;

public class VisitorItems implements mediathequeVisitor{
    @Override
    public String visit(Book book) {
        return book.toString();
    }
    @Override
    public String visit(CD cd) {
       return cd.toString();
    }
}
