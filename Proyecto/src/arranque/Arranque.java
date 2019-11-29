package arranque;

import model.empleado.EmpleadoDao;


import view.Vista;
import view.VistasDao;

public class Arranque {

    public static void main (String [] args){
       EmpleadoDao exe = new EmpleadoDao();  
       Vista view = new Vista();
       VistasDao DaoView = new VistasDao(); 
       view.menu();
       view.add(DaoView);
       view.setVisible(true);
    }

}
