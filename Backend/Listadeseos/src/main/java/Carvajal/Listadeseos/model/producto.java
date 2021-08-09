package Carvajal.Listadeseos.model;


import javax.persistence.*;

@Entity
@Table(name = "productos")
public class producto
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nombre;
    private double precio;
    private int cantidad;
    private String idCliente;

    public producto()
    {

    }

    public producto(String nombre, double precio, int cantidad, String idCliente) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.idCliente = idCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
}
