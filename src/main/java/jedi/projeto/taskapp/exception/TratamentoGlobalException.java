package jedi.projeto.taskapp.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class TratamentoGlobalException {

    @ExceptionHandler(value = {RecursoNaoEncontradoException.class})
    private ResponseEntity<ExceptionErrorDto> hendlerRecursoNaoEncontradoException(RecursoNaoEncontradoException exception , WebRequest request){
        ExceptionErrorDto responseDto = new ExceptionErrorDto();
        responseDto.setMenssage(exception.getMessage());
        responseDto.setStatusCode(404L);
            return ResponseEntity.ok(responseDto);
    }
}
