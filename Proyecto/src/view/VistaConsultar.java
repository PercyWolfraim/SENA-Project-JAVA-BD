package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.empleado.Empleado;

import model.empleado.EmpleadoDao;

public class VistaConsultar extends JPanel {
    
    public VistaConsultar(){
        setBounds(300,0,500,400);
        setLayout(null);
        setVisible(false);
        
        JLabel CLabelCodigo = new JLabel("Inserte codigo del empleado a Buscar");
        CLabelCodigo.setBounds(140,20,250,20);
        
        JTextField CTextCodigo = new JTextField();
        CTextCodigo.setBounds(175,50,150,20);
        
        JSeparator CSeparator = new JSeparator();
        CSeparator.setBounds(5,130,490,1);
        
        JTextArea CAreaConsulta = new JTextArea();
        CAreaConsulta.setBounds(15,150,460,400);
        CAreaConsulta.setEditable(false);
        
        JButton CBotonBuscar = new JButton("Consultar");
        CBotonBuscar.setBounds(200,80,100,30);
        CBotonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cod_empleado = CTextCodigo.getText();
                EmpleadoDao objEmp = new EmpleadoDao(cod_empleado);
                
                List<Empleado> x = objEmp.consultar();
                    System.out.println();
                CAreaConsulta.setText("Cedula: " + x.get(0).getCedula_empleado() + "\n"
                        + "Nombre: " + x.get(0).getNombre_empleado() + "\n"
                        + "ID del Puesto: " + x.get(0).getId_puesto() + "\n"
                        + "Salario: " + x.get(0).getSalario_mensual_empleado() + "\n"
                        + "Responsable de area: " + x.get(0).getResponsable_area() + "\n");
            }
        });
        
        add(CAreaConsulta);
        add(CBotonBuscar);
        add(CSeparator);
        add(CTextCodigo);
        add(CLabelCodigo);
    }
    
    
    
}
