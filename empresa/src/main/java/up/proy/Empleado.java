package up.proy;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Empleado {
    private String nombre;
    private String apellido;
    private Integer edad;

    public abstract Double calcularSalario();
}
