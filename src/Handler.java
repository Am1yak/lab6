public interface Handler {
    void check(Document document);
    void setNextHandler(Handler nextHandler);
}
