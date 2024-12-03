/**
 * Represents a document with metadata including title, file format, permissions, and creation date.
 * This class provides getters to access private fields.
 */
public class Document {

    /** The title of the document. */
    public String title;

    /** The file format of the document (e.g., PDF, DOCX). */
    private String fileFormat;

    /** Indicates whether the document can be authorized. */
    private Boolean authorisable;

    /** Indicates whether the document is readable. */
    private Boolean readable;

    /** The creation date of the document, represented as an integer (e.g., UNIX timestamp). */
    private int dateCreated;

    /**
     * Constructs a new {@code Document} with the specified details.
     *
     * @param title the title of the document
     * @param fileFormat the file format of the document
     * @param authorisable whether the document can be authorized
     * @param readable whether the document is readable
     * @param dateCreated the creation date of the document
     */
    public Document(String title, String fileFormat, Boolean authorisable, Boolean readable, int dateCreated) {
        this.title = title;
        this.fileFormat = fileFormat;
        this.authorisable = authorisable;
        this.readable = readable;
        this.dateCreated = dateCreated;
    }

    /**
     * Returns the file format of the document.
     *
     * @return the file format of the document
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * Returns whether the document can be authorized.
     *
     * @return {@code true} if the document can be authorized; {@code false} otherwise
     */
    public Boolean getAuthorisable() {
        return authorisable;
    }

    /**
     * Returns whether the document is readable.
     *
     * @return {@code true} if the document is readable; {@code false} otherwise
     */
    public Boolean getReadable() {
        return readable;
    }

    /**
     * Returns the creation date of the document.
     *
     * @return the creation date of the document as an integer (e.g., UNIX timestamp)
     */
    public int getDateCreated() {
        return dateCreated;
    }
}
