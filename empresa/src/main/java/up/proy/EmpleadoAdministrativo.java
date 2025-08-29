package up.proy;

import lombok.*;

@Getter
@Setter
@ToString
public class EmpleadoAdministrativo extends EmpleadoFijo {


    public EmpleadoAdministrativo(String nombre, String apellido, Integer edad, Double salario) {
        super(nombre, apellido, edad, salario);
    }

    @Override
    public Double calcularSalario() {
        return getSalario();
    }

    public void addEmpleado(Empresa empresa, Empleado empleado) {
        empresa.addEmpleado(empleado);
    }

    public void calcularSueldos(Empresa empresa){
        for (Empleado empleado : empresa.getEmpleados()) {
            System.out.println("Empleado " + empleado.getNombre() +": $" + empleado.calcularSalario());
        }
    }
}
