package com.example.practicaslibres;

public class LaboratorioClase {

    private int id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private int filas;
    private int columnas;

    //constructor
    public LaboratorioClase(int id, String codigo, String nombre, String descripcion,int filas,int columnas){

        this.id=id;
        this.codigo=codigo;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.filas = filas;
        this.columnas = columnas;
    }

    //setter & getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }
    public int getFilas() {
        return filas;
    }
    public int getColumnas() {
        return columnas;
    }
    public void setFilas(int filas) {
        this.filas = filas;
    }
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

