
package gt.edu.umg.ingenieria.software.practica.model;

import java.io.Serializable;

/**
 * s
 * @author jose
 */
public class Vehiculo implements Serializable{
    
    private Long id;
    private int modelo;
    private String marca;
    private String tipo;
    private String color;

    public Vehiculo() {
    }

    public Vehiculo(int modelo, String marca, String tipo, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
