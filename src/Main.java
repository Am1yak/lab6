/**
 * Demonstrates the Chain of Responsibility pattern by checking a series of documents 
 * using a chain of {@code Handler} implementations.
 */
public class Main {

    /**
     * The entry point of the application. Creates a chain of handlers and tests it 
     * with various {@code Document} objects.
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create test documents
        Document trueDoc = new Document("Rules", "txt", true, true, 3);
        Document nonAuthorizableDoc = new Document("Private info", "txt", false, true, 3);
        Document nonReadableDoc = new Document("Data", "txt", true, false, 3);
        Document outdatedDoc = new Document("Previous rules", "txt", true, true, 7);

        // Create the chain of responsibility
        Handler FormatChecker = new FormatChecker();
        Handler AuthorizeChecker = new AuthorizeChecker();
        Handler ReadChecker = new ReadChecker();
        Handler DateChecker = new DateChecker();

        // Link the handlers
        FormatChecker.setNextHandler(AuthorizeChecker);
        AuthorizeChecker.setNextHandler(ReadChecker);
        ReadChecker.setNextHandler(DateChecker);

        // Test the chain with various documents
        FormatChecker.check(trueDoc);
        FormatChecker.check(nonAuthorizableDoc);
        FormatChecker.check(nonReadableDoc);
        FormatChecker.check(outdatedDoc);
    }
}
