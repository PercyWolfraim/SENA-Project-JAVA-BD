/*Aquí emperazré a crear la vista para registrar a un usuario, para luego 
 insertarla a la clase lista*/
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.empleado.Empleado;
import model.empleado.EmpleadoDao;

public class VistaInsertar extends JPanel {

    public VistaInsertar() {

        /*Crea´re las caracteristicas de panel*/
        setLayout(null);
        setBounds(300, 0, 500, 600);
        setVisible(false);
        /*Ahora crearé la vistas "Insertar" que tendrá el panel secudario, el cual aun no
         se mostrará*/

        /*Empèzaré por el panel de "Insertar
         pondré primero los label de cada campo
         de la BD*/
        JPanel PanelInsertar = new JPanel();
        PanelInsertar.setLayout(null);
        PanelInsertar.setBounds(0, 0, 500, 600);

        JLabel ILabelCodigo = new JLabel("Inserte codigo del empleado");
        ILabelCodigo.setBounds(30, 30, 200, 30);

        JLabel ILabelID = new JLabel("Inserte ID del empleado");
        ILabelID.setBounds(30, 70, 200, 30);

        JLabel ILabelCedula = new JLabel("Inserte cedula del empleado");
        ILabelCedula.setBounds(30, 110, 200, 30);

        JLabel ILabelNombre = new JLabel("Inserte nombre del empleado");
        ILabelNombre.setBounds(30, 150, 200, 30);

        JLabel ILabelDepartamento = new JLabel("Inserte departamento del empleado");
        ILabelDepartamento.setBounds(30, 190, 210, 30);

        JLabel ILabelPuesto = new JLabel("Inserte puesto del empleado");
        ILabelPuesto.setBounds(30, 230, 210, 30);

        JLabel ILabelSalario = new JLabel("salario del empleado");
        ILabelSalario.setBounds(30, 270, 210, 30);

        /*Voy a añadir en el menú de insertar la opcion de  ingresar tanto el
         ingreso que obtiene el usuario como la deduccion que resive, porque a mi
         parecer, es la forma mas correcta para hacerlo (y en realidad la unica
         porque no se me ocurre nada mas)*/
        JLabel ILabelIngreso = new JLabel("Ingresos");
        ILabelIngreso.setBounds(30, 310, 150, 30);

        JLabel ILabelDeduccion = new JLabel("Deduccion");
        ILabelDeduccion.setBounds(230, 310, 150, 30);

        JLabel ILabelArea = new JLabel("Inserte el responsable del area de trabajo");
        ILabelArea.setBounds(30, 350, 250, 30);

        /*Tambien añadiré un combo box que contenga el nivel al que el usuario 
         se expone
         IMPORTANTE: Segun la GTC 45, un empleado que se exponga a un nivel de 
         riesgo IV (4) no puede emplear su labor hasta que el riesgo halla sido
         controlado o que hasta que el nivel de riesgo haya bajado.*/
        JLabel ILabelRiesgo = new JLabel("Nivel de riesgo al que el usuario se expone");
        ILabelRiesgo.setBounds(30, 420, 250, 30);

        PanelInsertar.add(ILabelRiesgo);
        PanelInsertar.add(ILabelCodigo);
        PanelInsertar.add(ILabelID);
        PanelInsertar.add(ILabelCedula);
        PanelInsertar.add(ILabelNombre);
        PanelInsertar.add(ILabelDepartamento);
        PanelInsertar.add(ILabelPuesto);
        PanelInsertar.add(ILabelSalario);
        PanelInsertar.add(ILabelIngreso);
        PanelInsertar.add(ILabelDeduccion);
        PanelInsertar.add(ILabelArea);

        /*Ahora procederé a crear los textarea*/
        JTextField ITextCodigo = new JTextField();
        ITextCodigo.setBounds(250, 30, 200, 30);

        JTextField ITextID = new JTextField();
        ITextID.setBounds(250, 70, 200, 30);

        JTextField ITextCedula = new JTextField();
        ITextCedula.setBounds(250, 110, 200, 30);

        JTextField ITextNombre = new JTextField();
        ITextNombre.setBounds(250, 150, 200, 30);

        JTextField ITextDepartamento = new JTextField();
        ITextDepartamento.setBounds(250, 190, 200, 30);

        JTextField ITextPuesto = new JTextField();
        ITextPuesto.setBounds(250, 230, 200, 30);

        JTextField ITextSalario = new JTextField("0");
        ITextSalario.setBounds(250, 270, 200, 30);
        ITextSalario.enable(false);

        JTextField ITextIngreso = new JTextField();
        ITextIngreso.setBounds(90, 310, 130, 30);
        ITextIngreso.enable(false);

        JTextField ITextDeduccion = new JTextField();
        ITextDeduccion.setBounds(300, 310, 130, 30);
        ITextDeduccion.enable(false);

        JTextField ITextArea = new JTextField();
        ITextArea.setBounds(30, 390, 420, 30);

        /*Para medir los niveles de riesgo usaré una ComboBox con 4 valores 
         (1...4)*/
        JComboBox IComboRiesgo = new JComboBox();
        IComboRiesgo.addItem(1);
        IComboRiesgo.addItem(2);
        IComboRiesgo.addItem(3);
        IComboRiesgo.addItem(4);
        IComboRiesgo.setBounds(280, 430, 60, 20);

        /*Por ultimo haré el boton de "Registrar usuario"*/
        JButton IBotonRegistrar = new JButton("Registrar");
        IBotonRegistrar.setBounds(200, 470, 100, 30);
        IBotonRegistrar.addActionListener((ae) -> {

            Empleado emp = new Empleado();

            int codigo = Integer.parseInt(ITextCodigo.getText());
            String ID = ITextID.getText();
            int cedula = Integer.parseInt(ITextCedula.getText());
            String nombre = ITextNombre.getText();
            int departamento = Integer.parseInt(ITextDepartamento.getText());
            String puesto = ITextPuesto.getText();
            int salario = Integer.parseInt(ITextSalario.getText());
            String encargado = ITextArea.getText();

            emp.setCod_empleado(codigo);
            emp.setId_empleado(ID);
            emp.setCedula_empleado(cedula);
            emp.setNombre_empleado(nombre);
            emp.setId_departamento(departamento);
            emp.setId_puesto(puesto);
            emp.setSalario_mensual_empleado(salario);
            emp.setResponsable_area(encargado);

            try {
                EmpleadoDao ED = new EmpleadoDao("");
                boolean confirmation = ED.insertar(emp);
                if (confirmation) {
                    JOptionPane.showMessageDialog(null, "registro completada");
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error en el registro");
                }
            } catch (Exception e) {
                System.out.println("Error en la insercion de datos: \n " + e.getMessage());
            }
        });

        PanelInsertar.add(IBotonRegistrar);
        PanelInsertar.add(IComboRiesgo);
        PanelInsertar.add(ITextArea);
        PanelInsertar.add(ITextDeduccion);
        PanelInsertar.add(ITextIngreso);
        PanelInsertar.add(ITextSalario);
        PanelInsertar.add(ITextPuesto);
        PanelInsertar.add(ITextDepartamento);
        PanelInsertar.add(ITextNombre);
        PanelInsertar.add(ITextCedula);
        PanelInsertar.add(ITextID);
        PanelInsertar.add(ITextCodigo);
        add(PanelInsertar);
    }
}
