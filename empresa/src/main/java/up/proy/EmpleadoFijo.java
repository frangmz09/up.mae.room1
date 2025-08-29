package up.proy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmpleadoFijo extends Empleado {
    private Double salario;

    public EmpleadoFijo(String nombre, String apellido, Integer edad, Double salario) {
        super(nombre, apellido, edad);
        this.setSalario(salario);
    }

    @Override
    public Double calcularSalario() {
        return salario;
    }
}
