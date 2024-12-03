public class ReadChecker implements Handler {
    private Handler nextHandler;

    @Override
    public void check(Document document){
        if(document.getReadable()){
            System.out.println(document.title + ":File format is readable!");
            if (nextHandler != null) {nextHandler.check(document);}
        } else {
            System.out.println("Error: File format is not readable!");
        }
    }

    @Override
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
}
