package Modelo;

public class LibroSQL {
    //los cuales posteriormente será sustituidos por el parametro respectivo
private final String SQL_INSERT = "INSERT INTO material(codigoMaterial) VALUES(?,?,?,?,?)"+"INSERT INTO estudiantesudbvirtual(carnet,nombres, apellido1,apellido2,edad) VALUES(?,?,?,?,?)";
private final String SQL_UPDATE = "UPDATE estudiantesudbvirtual SET nombres=?, apellido1=?, apellido2=?, edad=? WHERE carnet=?";
private final String SQL_DELETE = "DELETE FROM estudiantesudbvirtual WHERE carnet = ?";
private final String SQL_SELECT = "SELECT carnet,nombres, apellido1,apellido2,edad FROM estudiantesudbvirtual ORDER BY carnet";;
}
