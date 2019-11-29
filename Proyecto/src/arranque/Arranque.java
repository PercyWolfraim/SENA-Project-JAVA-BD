package arranque;

import model.empleado.EmpleadoDao;


import view.Vista;
public class Arranque {

    public static void main (String [] args){
        EmpleadoDao exe = new EmpleadoDao();       
        Vista view = new Vista();
        
       view.menu();
        view.setVisible(true);
    }

}
