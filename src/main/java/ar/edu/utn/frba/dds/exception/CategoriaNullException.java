package ar.edu.utn.frba.dds.exception;

public class CategoriaNullException extends UncheckedException{
  public CategoriaNullException(String msg){
    super("\n"+msg);
  }
}
