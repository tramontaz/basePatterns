package behavioral.memento;


import java.util.Date;

class Project {
    private String version;
    private Date date;

    void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    Save save() {
        return new Save(version);
    }

    void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project:\n" +
                "\nVersion: " + version +
                "\nDate: " + date;
    }
}
