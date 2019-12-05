package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class VistaEliminar extends JPanel{
    
    public VistaEliminar(){
        setBounds(300,0,500,400);
        setLayout(null);
        setVisible(false);
        
        JLabel ELabelCodigo = new JLabel("Inserte codigo del empleado a eliminar");
        ELabelCodigo.setBounds(140,20,250,20);
        
        JTextArea ETextCodigo = new JTextArea();
        ETextCodigo.setBounds(175,50,150,20);
        
        JSeparator ESeparator = new JSeparator();
        ESeparator.setBounds(5,130,490,1);
        
        
        JButton EBotonBuscar = new JButton("Buscar");
        EBotonBuscar.setBounds(200,80,100,30);
        
        
        
        add(EBotonBuscar);
        add(ESeparator);
        add(ETextCodigo);
        add(ELabelCodigo);
    }   
    
}
