package DTOs;

import java.sql.Date;

public class ProjectDTO {
    private String title;
    private String projectDescription;
    private String manager;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }


    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public ProjectDTO(String title, String projectDescription, String manager) {
        this.title = title;
        this.projectDescription = projectDescription;
        this.manager = manager;
    }
}