package creational.prototype;

import creational.factory.Program;

public class Project implements Copyble {
    String projectName;
    int id;
    String sourceCode;

    public Project(String projectName, int id, String sourceCode) {
        this.projectName = projectName;
        this.id = id;
        this.sourceCode = sourceCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }


    @Override
    public Object copy() {
        return new Project(projectName, id, sourceCode);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", id=" + id +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
