package services;

import DTOs.ProjectDTO;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class ListProjects {

    public static String leerJson() {
        Path filePath = Path.of("src/main/java/DTOs/insertProject.json");

        try {
            String jsonContent = new String(Files.readAllBytes(filePath));

            Gson gson = new Gson();
            return gson.toJson(jsonContent);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProjectsList(){
        String projectsList = "";
        ArrayList<ProjectDTO> listaProyectos = new ArrayList<ProjectDTO>();

        ProjectDTO pr1 = new ProjectDTO("p1", "descripcion", "manager1");
        listaProyectos.add(pr1);

        Gson gson = new Gson();
        projectsList = gson.toJson(listaProyectos);
        return projectsList;

    }

}
