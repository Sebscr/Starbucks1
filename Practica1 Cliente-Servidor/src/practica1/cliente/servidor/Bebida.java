/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.cliente.servidor;

/**
 *
 * @author sebas
 */
public class Bebida extends Producto{
    protected String Topings;
    protected String Endulzante;
    protected String Leche;
    protected String Tamanno;
    protected String Temperatura;
    protected String Sabor;

    public Bebida(String Topings, String Endulzante, String Leche, String Tamanno, String Temperatura, String Sabor, String nombre, float precio, String descripcion, String caducidad) {
        super(nombre, precio, descripcion, caducidad);
        this.Topings = Topings;
        this.Endulzante = Endulzante;
        this.Leche = Leche;
        this.Tamanno = Tamanno;
        this.Temperatura = Temperatura;
        this.Sabor = Sabor;
    }
    protected String Servir(){
        return "Sirviendo: " + nombre + " " + Sabor + " de un tamanno" + Tamanno;
    }
    protected String ponerMSG (String msg){
        return "Escribiendo en el envase: " + msg + " para ser unicos" ;
    }
    @Override
    protected String caducidad()
    {
       return "Caducidad de la bebida Tamanno: "+ Tamanno + " es: "+ caducidad();
    }
}
