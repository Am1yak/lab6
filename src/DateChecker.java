public class DateChecker implements Handler {
    private Handler nextHandler;

    @Override
    public void check(Document document){
        if(document.getDateCreated() <= 5){
            System.out.println(document.title + ":File format is up to date!");
            if (nextHandler != null) {nextHandler.check(document);}
        } else {
            System.out.println("Error: File format is outdated!");
        }
    }

    @Override
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
}
