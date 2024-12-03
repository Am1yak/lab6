public class FormatChecker implements Handler{
    private Handler nextHandler;

    @Override
    public void check(Document document){
        if(document.getFileFormat() == "txt"){
            System.out.println(document.title + ": File format is supported!");
            if (nextHandler != null) {nextHandler.check(document);}
        } else {
            System.out.println("Error: File format is not supported!");
        }
    }

    @Override
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
}
