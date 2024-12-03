public class Main {
    public static void main(String[] args) {
        Document trueDoc = new Document("Rules","txt", true, true, 3);
        Document nonAuthorizableDoc = new Document("Private info","txt", false, true, 3);
        Document nonReadableDoc = new Document("Data","txt", true, false, 3);
        Document outdatedDoc = new Document("Previous rules","txt", true, true, 7);

        Handler FormatChecker = new FormatChecker();
        Handler AuthorizeChecker = new AuthorizeChecker();
        Handler ReadChecker = new ReadChecker();
        Handler DateChecker = new DateChecker();
        FormatChecker.setNextHandler(AuthorizeChecker);
        AuthorizeChecker.setNextHandler(ReadChecker);
        ReadChecker.setNextHandler(DateChecker);

        FormatChecker.check(trueDoc);
        FormatChecker.check(nonAuthorizableDoc);
        FormatChecker.check(nonReadableDoc);
        FormatChecker.check(outdatedDoc);
        }
    }