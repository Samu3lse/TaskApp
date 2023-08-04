package jedi.projeto.taskapp.exception;

public class RecursoNaoEcontradoException extends RuntimeException{

    public RecursoNaoEcontradoException (){
        super("Recurso não encontrado");
    }
}
