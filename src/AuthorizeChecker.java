public class AuthorizeChecker implements Handler {
    private Handler nextHandler;

    @Override
    public void check(Document document){
        if(document.getAuthorisable()){
            System.out.println(document.title + ":File format is authorizable!");
            if (nextHandler != null) {nextHandler.check(document);}
        } else {
            System.out.println("Error: File format is not authorized!");
        }
    }

    @Override
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
}
