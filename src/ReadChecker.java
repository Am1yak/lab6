/**
 * A concrete implementation of the {@code Handler} interface that checks
 * whether a document is readable. If the document is readable,
 * it delegates further checks to the next handler in the chain, if any.
 */
public class ReadChecker implements Handler {

    /** The next handler in the chain of responsibility. */
    private Handler nextHandler;

    /**
     * Checks if the document is readable.
     * If the document is readable, it prints a success message and
     * delegates the check to the next handler in the chain.
     * Otherwise, it prints an error message.
     *
     * @param document the {@code Document} to be checked; must not be null
     */
    @Override
    public void check(Document document) {
        if (document.getReadable()) {
            System.out.println(document.title + ": File format is readable!");
            if (nextHandler != null) {
                nextHandler.check(document);
            }
        } else {
            System.out.println("Error: File format is not readable!");
        }
    }

    /**
     * Sets the next handler in the chain of responsibility.
     * The next handler will be called if the current handler completes successfully.
     *
     * @param handler the next {@code Handler} in the chain; can be null to indicate the end of the chain
     */
    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
