package model.empleado;

import java.util.List;

public interface IEmpleado {

    public boolean insertar(Empleado objEnmpleado);
    public boolean modificar(Empleado objEmpleado);
    public boolean eliminar (Empleado objEmpleado);
    public List<Empleado> consultar();
}
