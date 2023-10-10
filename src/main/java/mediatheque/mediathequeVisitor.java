package mediatheque;

public interface mediathequeVisitor {

    String visit(CD cd);
    String visit(Book book);

}
