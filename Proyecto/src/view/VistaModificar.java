/*Har{e lo mismo que hice en la clase "VistaInsertar", solo cambiaré los nombres
de sus componentes*/
package view;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.empleado.Empleado;

import model.empleado.EmpleadoDao;

public class VistaModificar extends JLabel {
    
    public VistaModificar(){
        setLayout(null);
        setBounds(300,0,500,600);
        setVisible(false);
        
        JPanel PanelModificar = new JPanel();
        PanelModificar.setLayout(null);
        PanelModificar.setBounds(0,0,500,600);
        
        JLabel MLabelCodigo = new JLabel("Inserte codigo del empleado");
        MLabelCodigo.setBounds(30,20,200,30);
        
        JButton MButtonSearch = new JButton("Buscar");
        MButtonSearch.setBounds(200,60,100,30);
        
        
        
        JLabel MLabelID = new JLabel("Inserte ID del empleado");
        MLabelID.setBounds(30,120,200,30);
        
        JLabel MLabelCedula = new JLabel("Inserte cedula del empleado");
        MLabelCedula.setBounds(30,160,200,30);
        
        JLabel MLabelNombre = new JLabel("Inserte nombre del empleado");
        MLabelNombre.setBounds(30,200,200,30);
        
        JLabel MLabelDepartamento = new JLabel("Inserte departamento del empleado");
        MLabelDepartamento.setBounds(30,240,210,30);
        
        JLabel MLabelPuesto = new JLabel("Inserte puesto del empleado");
        MLabelPuesto.setBounds(30,280,210,30);
        
        JLabel MLabelSalario = new JLabel("salario del empleado");
        MLabelSalario.setBounds(30,320,210,30);
        
        JLabel MLabelIngreso = new JLabel("Ingresos");
        MLabelIngreso.setBounds(30,360,150,30);
        
        JLabel MLabelDeduccion = new JLabel("Deduccion");
        MLabelDeduccion.setBounds(230,360,150,30);
        
        JLabel MLabelArea = new JLabel("Inserte el responsable del area de trabajo"); 
        MLabelArea.setBounds(30,400,250,30);
        
        JLabel MLabelRiesgo = new JLabel("Nivel de riesgo al que el usuario se expone");
        MLabelRiesgo.setBounds(30,460,250,30);
        
        PanelModificar.add(MLabelRiesgo);
        PanelModificar.add(MButtonSearch);
        PanelModificar.add(MLabelCodigo);
        PanelModificar.add(MLabelID);
        PanelModificar.add(MLabelCedula);
        PanelModificar.add(MLabelNombre);
        PanelModificar.add(MLabelDepartamento);
        PanelModificar.add(MLabelPuesto);
        PanelModificar.add(MLabelSalario);
        PanelModificar.add(MLabelIngreso);
        PanelModificar.add(MLabelDeduccion);
        PanelModificar.add(MLabelArea);
        
        /*----------------------------------------------*/
        
        JTextField MTextCodigo = new JTextField();
        MTextCodigo.setBounds(250,20,200,30);
        
        /*Crearé un separador, ya que el usuario tendrá que buscar primero
        el codigo del empleado antes de ingresar los datos a modificar*/
        JSeparator MSeparator = new JSeparator();
        MSeparator.setBounds(10,100,460,1);
        
        JTextField MTextID = new JTextField();
        MTextID.setBounds(250,120,200,30);
        MTextID.enable(false);
        
        JTextField MTextCedula = new JTextField();
        MTextCedula.setBounds(250,160,200,30);
        
        JTextField MTextNombre = new JTextField();
        MTextNombre.setBounds(250,200,200,30);
        
        JTextField MTextDepartamento = new JTextField();
        MTextDepartamento.setBounds(250,240,200,30);
        
        JTextField MTextPuesto = new JTextField();
        MTextPuesto.setBounds(250,280,200,30);
        
        JTextField MTextSalario = new JTextField();
        MTextSalario.setBounds(250,320,200,30);
        MTextSalario.enable(false);
        
        JTextField MTextIngreso = new JTextField();
        MTextIngreso.setBounds(90,360,130,30);
        MTextIngreso.enable(false);
        
        JTextField MTextDeduccion = new JTextField();
        MTextDeduccion.setBounds(300,360,130,30);
        MTextDeduccion.enable(false);
        
        JTextField MTextArea = new JTextField();
        MTextArea.setBounds(30,430,420,30);
              
        /*Para medir los niveles de riesgo usaré una ComboBox con 4 valores 
        (1...4)*/        
        
        
        JComboBox MComboRiesgo = new JComboBox();
        MComboRiesgo.addItem(1);
        MComboRiesgo.addItem(2);
        MComboRiesgo.addItem(3);
        MComboRiesgo.addItem(4);
        MComboRiesgo.setBounds(280,470,60,20);
        
        /*Por ultimo haré el boton de "Registrar usuario"*/
        JButton MBotonRegistrar = new JButton("Actualizar");
        MBotonRegistrar.setBounds(200,510,100,30);
        MBotonRegistrar.setEnabled(false);
        
        MButtonSearch.addActionListener((ActionEvent) -> {
            String cod = MTextCodigo.getText();
            if (!cod.isEmpty()) {
                try {
                    List<Empleado> x1 = new EmpleadoDao(cod).consultar();
                    if (!x1.isEmpty()) {
                        MTextID.setText(x1.get(0).getId_empleado());
                        MTextCedula.setText(String.valueOf(x1.get(0).getCedula_empleado()));
                        MTextNombre.setText(x1.get(0).getNombre_empleado());
                        MTextDepartamento.setText(String.valueOf(x1.get(0).getId_departamento()));
                        MTextPuesto.setText(x1.get(0).getId_puesto());
                        MTextSalario.setText(String.valueOf(x1.get(0).getSalario_mensual_empleado()));
                        MTextArea.setText(x1.get(0).getResponsable_area());
                        MBotonRegistrar.setEnabled(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "El código ingresado es incorrecto.");
                    }
                }catch (HeadlessException e) {
                    System.out.println("Error en la consulta de datos: \n " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un código!");
            }
        });
        
        MBotonRegistrar.addActionListener(ActionEvent -> {
            String sql = "";
            
            Empleado emp = new Empleado();
            

            int cedula = Integer.parseInt(MTextCedula.getText());
            String nombre = MTextNombre.getText();
            int departamento = Integer.parseInt(MTextDepartamento.getText());
            String puesto = MTextPuesto.getText();
            int salario = Integer.parseInt(MTextSalario.getText());
            String encargado = MTextArea.getText();
            
            emp.setCedula_empleado(cedula);
            emp.setNombre_empleado(nombre);
            emp.setId_departamento(departamento);
            emp.setId_puesto(puesto);
            emp.setSalario_mensual_empleado(salario);
            emp.setResponsable_area(encargado);
            
            try {
                EmpleadoDao ED = new EmpleadoDao("");
                boolean confirmation = ED.modificar(emp);
                if (confirmation) {
                    JOptionPane.showMessageDialog(null, "Actualización completada");
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error en la actualización");
                }
            } catch (HeadlessException e) {
                System.out.println("Error en la actualización de datos de datos: \n " + e.getMessage());
            }
        });
        
        PanelModificar.add(MSeparator);
        PanelModificar.add(MBotonRegistrar);
        PanelModificar.add(MComboRiesgo);
        PanelModificar.add(MTextArea);
        PanelModificar.add(MTextDeduccion);
        PanelModificar.add(MTextIngreso);
        PanelModificar.add(MTextSalario);
        PanelModificar.add(MTextPuesto);
        PanelModificar.add(MTextDepartamento);
        PanelModificar.add(MTextNombre);
        PanelModificar.add(MTextCedula);
        PanelModificar.add(MTextID);
        PanelModificar.add(MTextCodigo);
        add(PanelModificar);
    }
    
}
