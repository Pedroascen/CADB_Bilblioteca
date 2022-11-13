/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Rocio Abrego
 */

public class ConsultaEjemplares {
  // ENCAPSULAMIENTO
  private String TipoMaterial;
  private String CodigoMaterial;
  private String Titulo;
  private String Autores;
  private String MaterialInfo;
  
  
  public String getTipoMaterial() {
    return TipoMaterial;
  }

  public void setTipoMaterial(String newValue) {
    this.TipoMaterial = newValue;
  }
  
  public String getCodigoMaterial() {
    return CodigoMaterial;
  }

  public void setCodigoMaterial(String newValue) {
    this.CodigoMaterial = newValue;
  }
  
  public String getTitulo() {
    return Titulo;
  }

  public void setTitulo(String newValue) {
    this.Titulo = newValue;
  }
  
  public String getAutores() {
    return Autores;
  }

  public void setAutores(String newValue) {
    this.Autores = newValue;
  }
  
  public String getMaterialInfo() {
    return MaterialInfo;
  }

  public void setMaterialInfo(String newValue) {
    this.MaterialInfo = newValue;
  }  
  
}
