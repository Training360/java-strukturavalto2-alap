package collectionsqueue;

public class ToDo {

    private String description;
    private boolean isUrgent;

    public ToDo(String description, boolean isUrgent) {
        this.description = description;
        this.isUrgent = isUrgent;
    }

    public String getDescription() {
        return description;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "description='" + description + '\'' +
                '}';
    }
}
