/**
 * Represents a handler in a chain of responsibility pattern for processing documents.
 * Each handler performs a specific check on the document and can delegate to the next handler in the chain.
 */
public interface Handler {

    /**
     * Performs a check on the given document.
     * Implementations should define the specific behavior of this check.
     *
     * @param document the {@code Document} to be checked; must not be null
     */
    void check(Document document);

    /**
     * Sets the next handler in the chain of responsibility.
     * The next handler will be invoked if this handler does not fully process the document.
     *
     * @param nextHandler the next {@code Handler} in the chain; can be null to indicate the end of the chain
     */
    void setNextHandler(Handler nextHandler);
}
