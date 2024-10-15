/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.cliente.servidor;

/**
 *
 * @author sebas
 */
public class Cafe extends Bebida{
    private int Cafeina;

    public Cafe(int Cafeina, String Topings, String Endulzante, String Leche, String Tamanno, String Temperatura, String Sabor, String nombre, float precio, String descripcion, String caducidad) {
        super(Topings, Endulzante, Leche, Tamanno, Temperatura, Sabor, nombre, precio, descripcion, caducidad);
        this.Cafeina = Cafeina;
    }
    

    public int getCafeina() {
        return Cafeina;
    }

    public void setCafeina(int Cafeina) {
        this.Cafeina = Cafeina;
    }
    @Override
    protected String ponerMSG(String nombreCliente){
        return super.ponerMSG("Ten un lindo dia")+ " " + nombreCliente;
    }
    
}
