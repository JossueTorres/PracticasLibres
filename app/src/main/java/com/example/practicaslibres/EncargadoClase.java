package com.example.practicaslibres;

public class EncargadoClase {

    private int id;
    private String Nombre;
    private String Apellidos;
    private String Correo;
    private String Nacimiento;
    private String Sexo;
    private String DUI;
    private String Celular;
    private String Estado;

    public EncargadoClase(int id, String Nombre, String Apellido, String Correo, String Nacimiento,String Sexo, String DUI, String Celular, String Estado){

        this.id=id;
        this.Nombre=Nombre;
        this.Apellidos=Apellido;
        this.Correo=Correo;
        this.Nacimiento=Nacimiento;
        this.Sexo=Sexo;
        this.DUI=DUI;
        this.Celular=Celular;
        this.Estado=Estado;



    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        this.Apellidos = apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.Nacimiento = nacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        this.Sexo = sexo;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        this.Celular = celular;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }
}
