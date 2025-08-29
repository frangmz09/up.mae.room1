package up.proy;

import lombok.*;

import java.util.ArrayList;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Empresa {
    private String nombre;
    private Integer anioInicial;
    private String rubro;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre, Integer anioInicial, String rubro) {
        this.setNombre(nombre);
        this.setAnioInicial(anioInicial);
        this.setRubro(rubro);
        this.empleados = new ArrayList<>();
    }
    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("No se puede asignar un nombre nulo a una empresa");
        }
        this.nombre = nombre;
    }

    public void setAnioInicial(Integer anioInicial) {
        if (nombre == null) {
            throw new IllegalArgumentException("No se puede asignar un nombre nulo a una empresa");
        }
        this.anioInicial = anioInicial;
    }
    public void addEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("No se puede agregar un empleado nulo");
        }
        this.getEmpleados().add(empleado);
    }
}
