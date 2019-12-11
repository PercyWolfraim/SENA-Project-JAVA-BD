package arranque;

import model.empleado.Empleado;
import model.empleado.EmpleadoDao;


import view.Vista;
import view.VistaInsertar;

public class Arranque {

    public static void main (String [] args){
       /*EmpleadoDao exe = new EmpleadoDao(); 
       Empleado ojEmp = new Empleado("C1", 0, 0, "Juan", 0, "1000", 0, "Luis");
       exe.insertar(ojEmp);*/
       Vista view = new Vista();
       VistaInsertar DaoView = new VistaInsertar(); 
       view.menu();
       view.add(DaoView);
       view.setVisible(true);
    }

}
