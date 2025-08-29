package up.proy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            new Empresa(null,null, "Telecomunicaciones");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        Empresa                 sbsa = new Empresa("Sb s.a.",1997, "Telecomunicaciones");
        EmpleadoAdministrativo  empleadoAdministrativo = new EmpleadoAdministrativo("Luciano","Costas",37,1800000.00);

        empleadoAdministrativo.addEmpleado(sbsa,new EmpleadoPorHora("Ramon","Soria",30,80,15000.00));
        empleadoAdministrativo.addEmpleado(sbsa,new EmpleadoPorHora("Julio","Cesar",21,10,10000.00));
        empleadoAdministrativo.addEmpleado(sbsa,new EmpleadoFijo("Julio","Cesar",28,1500000.00));
        empleadoAdministrativo.addEmpleado(sbsa,new EmpleadoFijo("Sofia","Hernandez",27,1800000.00));
        try {
        empleadoAdministrativo.addEmpleado(sbsa,null);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        empleadoAdministrativo.calcularSueldos(sbsa);
    }
}