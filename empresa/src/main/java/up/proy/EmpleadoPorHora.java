package up.proy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpleadoPorHora extends Empleado {
    private Integer horasTrabajadas;
    private Double salarioPorHora;

    public EmpleadoPorHora(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Double salarioPorHora) {
        super(nombre, apellido, edad);
        this.setHorasTrabajadas(horasTrabajadas);
        this.setSalarioPorHora(salarioPorHora);
    }

    @Override
    public Double calcularSalario() {
        return this.getHorasTrabajadas() * this.getSalarioPorHora();
    }
}
