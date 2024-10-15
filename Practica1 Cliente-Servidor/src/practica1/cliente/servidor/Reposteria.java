/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.cliente.servidor;

/**
 *
 * @author sebas
 */
public class Reposteria extends Producto {
    protected boolean Gluten;
    protected String Endulzante;
    protected int cantidadCalorias;
    protected String Topings;
    protected String Sabor;
    protected String Ingredientes;
    protected String Tamanno;

    public Reposteria(boolean Gluten, String Endulzante, int cantidadCalorias, String Topings, String Sabor, String Ingredientes, String Tamanno, String nombre, float precio, String descripcion, String caducidad) {
        super(nombre, precio, descripcion, caducidad);
        this.Gluten = Gluten;
        this.Endulzante = Endulzante;
        this.cantidadCalorias = cantidadCalorias;
        this.Topings = Topings;
        this.Sabor = Sabor;
        this.Ingredientes = Ingredientes;
        this.Tamanno = Tamanno;
    }
    
    protected String Servir(){
        return "Sirviendo: " + this.nombre ;
    }
    protected String Calentar (){
        return "Calentando: " + this.nombre ;
    }
    protected String Hornear (int tiempo, float temp){
        return "Horneando " + nombre + " durante: " + tiempo + "\n Temperatura de horneado: " + temp;
    }
    @Override
    protected String caducidad()
    {
       return "Caducidad de la bebida Tamanno: "+ Tamanno + " es: "+ caducidad();
    }
}
