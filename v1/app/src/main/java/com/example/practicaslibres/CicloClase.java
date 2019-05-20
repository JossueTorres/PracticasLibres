package com.example.practicaslibres;

public class CicloClase {

    private int id;
    private String codigo;
    private String ciclo;
    private String fechaInicio;
    private String fechaFin;
    private String estado;

    //constructor
    public CicloClase(int id, String codigo, String ciclo, String fechaInicio,String fechaFin,String estado){

        this.id=id;
        this.codigo=codigo;
        this.ciclo=ciclo;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
        this.estado=estado;
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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
