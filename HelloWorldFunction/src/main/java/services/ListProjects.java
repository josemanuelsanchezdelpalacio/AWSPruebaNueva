package services;

import DTOs.CentroDTO;
import DTOs.ProjectDTO;
import com.google.gson.Gson;

import java.util.ArrayList;

public class ListProjects {

    public static String getProjectsList(){
        String projectsList = "";
        ArrayList<ProjectDTO> listaProyectos = new ArrayList<ProjectDTO>();

        ProjectDTO pr1 = new ProjectDTO("p1", "descripcion", "manager1");
        listaProyectos.add(pr1);

        Gson gson = new Gson();
        projectsList = gson.toJson(listaProyectos);
        return projectsList;

    }

    public static String getCentrosList(String nombre, String direccion, String telefono, String email) {
        String centrosList = "";
        ArrayList<CentroDTO> listaCentros = new ArrayList<CentroDTO>();

        CentroDTO pr1 = new CentroDTO(50008629, nombre, direccion, telefono, email);
        listaCentros.add(pr1);

        Gson gson = new Gson();
        centrosList = gson.toJson(listaCentros);
        return centrosList;
    }

}