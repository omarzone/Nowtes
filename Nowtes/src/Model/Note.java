package Model;

public class Note {

    private String title;
    private String description;
    private String date;
    private int priority;
    private boolean autoDelete;
    private boolean status;
    private String modDate;

    public Note() {

    }

    public Note(String title, String description, String date, int priority, boolean autoDelete, boolean status, String modDate) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.priority = priority;
        this.autoDelete = autoDelete;
        this.status = status;
        this.modDate = modDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setAutoDelete(boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getModDate() {
        return modDate;
    }

    public void setModDate(String modDate) {
        this.modDate = modDate;
    }

    @Override
    public String toString() {
        return title;
    }
}
