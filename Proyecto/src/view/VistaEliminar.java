package view;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.empleado.Empleado;
import model.empleado.EmpleadoDao;

public class VistaEliminar extends JPanel{
    
    public VistaEliminar(){
        setBounds(300,0,500,400);
        setLayout(null);
        setVisible(false);
        
        JLabel ELabelCodigo = new JLabel("Inserte codigo del empleado a eliminar");
        ELabelCodigo.setBounds(140,20,250,20);
        
        JTextField ETextCodigo = new JTextField();
        ETextCodigo.setBounds(175,50,150,20);
        
        JSeparator ESeparator = new JSeparator();
        ESeparator.setBounds(5,130,490,1);
        
        
        JButton EBotonBuscar = new JButton("Eliminar");
        EBotonBuscar.setBounds(200,80,100,30);
        EBotonBuscar.addActionListener(ActionEvent -> {
            String cod = ETextCodigo.getText();
            if(!cod.isEmpty()){
                Empleado emp = new Empleado();
            
                int codigo = Integer.parseInt(ETextCodigo.getText());
                
                emp.setCod_empleado(codigo);
                
                try {
                    EmpleadoDao ED = new EmpleadoDao("");
                    boolean confirmation = ED.eliminar(emp);
                    if(confirmation){
                        JOptionPane.showMessageDialog(null, "Eliminacion completada");
                    }else{
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error un error");
                    }
                } catch (Exception e) {
                    System.out.println("Error en la elimincacion de los datos de datos: \n " + e.getMessage());
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Por Favor Inserte el ID del empleado");
            }
        });
        
        
        
        add(EBotonBuscar);
        add(ESeparator);
        add(ETextCodigo);
        add(ELabelCodigo);
    }   
    
}
