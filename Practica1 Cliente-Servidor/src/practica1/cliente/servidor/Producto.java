/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.cliente.servidor;

/**
 *
 * @author sebas
 */
public abstract class Producto {
    protected String nombre;
    protected float precio;
    protected String descripcion;
    protected String caducidad;

    public Producto(String nombre, float precio, String descripcion, String caducidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.caducidad = caducidad;
    }
    protected String preparar (){
        return "Preparando " + nombre + " le va a costar" + precio;
    }
    protected String almacenar (String bodega){
        return "El producto: " + nombre + " se va a almacenar en: " + bodega;
    }
    protected String desechar (String motivo){
        return "El producto: " + nombre + " se va a desechar por: " + motivo;
    }
    protected abstract String caducidad();
}
