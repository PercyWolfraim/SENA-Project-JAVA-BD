package arranque;

import model.empleado.EmpleadoDao;


import view.Vista;
import view.VistaInsertar;

public class Arranque {

    public static void main (String [] args){
       EmpleadoDao exe = new EmpleadoDao();  
       Vista view = new Vista();
       VistaInsertar DaoView = new VistaInsertar(); 
       view.menu();
       view.add(DaoView);
       view.setVisible(true);
    }

}
