package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadia
 */
public class Empresa {

    private String razonSocial;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Campo> campos;

    public Empresa() {
           this.campos= new ArrayList<>();
    }

   

    public Empresa(String razonSocial, String nombre, String direccion, String telefono) {
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.campos = new ArrayList<>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Campo> getCampos() {
        return campos;
    }

    public void setCampos(List<Campo> campos) {
        this.campos = campos;
    }

  

}
