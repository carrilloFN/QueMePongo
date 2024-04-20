package ar.edu.utn.frba.dds.exception;

public abstract class UncheckedException extends RuntimeException{
  public UncheckedException(String msg){
    super(msg);
  }
}
