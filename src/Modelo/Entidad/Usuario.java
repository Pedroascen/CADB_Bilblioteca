package Modelo.Entidad;

public class Usuario {
    //atributos de Usuario
    private int id_usuario;
    private int id_rol;
    private String nombre;
    private String apellido;
    private String carnet;
    private String contrasenia;
    
    //constructores
    public Usuario(){
    }
    
    public Usuario(int id_rol, String nombre, String apellido,String carnet,String contrasenia){
        this.id_rol=id_rol;
        this.nombre=nombre;
        this.apellido=apellido;
        this.carnet=carnet;
        this.contrasenia=contrasenia;
    }
    
    //getters y setters
     public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
