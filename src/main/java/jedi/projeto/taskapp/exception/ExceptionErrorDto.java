package jedi.projeto.taskapp.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ExceptionErrorDto{
     private String Menssage;
     private Long StatusCode;

}
