/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.cliente.servidor;

/**
 *
 * @author sebas
 */
public class Muffin extends Reposteria{
    private String Relleno;

    public Muffin(String Relleno, boolean Gluten, String Endulzante, int cantidadCalorias, String Topings, String Sabor, String Ingredientes, String Tamanno, String nombre, float precio, String descripcion, String caducidad) {
        super(Gluten, Endulzante, cantidadCalorias, Topings, Sabor, Ingredientes, Tamanno, nombre, precio, descripcion, caducidad);
        this.Relleno = Relleno;
    }
    

    public String getRelleno() {
        return Relleno;
    }

    public void setRelleno(String Relleno) {
        this.Relleno = Relleno;
    }
 
    @Override
    protected String Servir(){
        return super.Servir() + " con el relleno: " + Relleno;
    }
    @Override
    protected String Hornear (int tiempo, float temp){
        return super.Hornear(tiempo, temp) + " cuidado con el relleno: " + Relleno;
    }
    
    public float precioconImpuesto()
    {
      return precio * 1.13f; 
    }
    
    public float precioconDescuento()
    {
        return precio - (precio * 0.05f);
    }
}
