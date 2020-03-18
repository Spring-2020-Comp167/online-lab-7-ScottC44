/*
Scott Cromling
Lab7
 */
public class Textbook {
    private String title;
    private String publisher;
    private int edition;

    public Textbook() {
        this.title = "";
        this.publisher = "";
        this.edition = 0;
    }


    public Textbook(String title, String publisher, int edition) {
        this.title = title;
        this.publisher = publisher;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }


    @Override
    public String toString() {
        return title + System.lineSeparator()+ publisher
                +System.lineSeparator() + edition+System.lineSeparator();
    }
}
