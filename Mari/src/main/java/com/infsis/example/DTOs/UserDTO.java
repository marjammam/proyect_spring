package com.infsis.example.DTOs;

public class UserDTO {

    /*Si bien el id puede no relevante se muestra este dato al Usuario Final (En la UI),
     si es necesario para la parte del Cliente(Una Aplicación FrontEnd)
     debido a que necesita del id para interactuar cuando se tenga un Delete, Update
     y para obtener un Usuario por su id
    */

    private long id;
    private String username;
    private String password;

    public UserDTO(long id,String username, String password) {

        this.id = id;
        this.username = username;
        this.password = password;

    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = username;
    }

    public String getEmail() {
        return password;
    }

    public void setEmail(String email) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
