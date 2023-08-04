package jedi.projeto.taskapp.exception;

public class RecursoNaoSalvoException extends RuntimeException{

    public RecursoNaoSalvoException(){
        super("Recurso não salvo");
    }

}
