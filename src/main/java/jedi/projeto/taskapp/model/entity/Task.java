package jedi.projeto.taskapp.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "list_sequence")
    @SequenceGenerator(name = "list_sequence", sequenceName = "lis_seq")

    private Long id;

    private String task;

    private String diaSemana;
}
