public class Document {
    public String title;
    private String fileFormat;
    private Boolean authorisable;
    private Boolean readable;
    private int dateCreated;

    public Document(String title, String fileFormat, Boolean authorisable, Boolean readable, int dateCreated) {
        this.title = title;
        this.fileFormat = fileFormat;
        this.authorisable = authorisable;
        this.readable = readable;
        this.dateCreated = dateCreated;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public Boolean getAuthorisable() {
        return authorisable;
    }

    public Boolean getReadable() {
        return readable;
    }

    public int getDateCreated() {
        return dateCreated;
    }
}
