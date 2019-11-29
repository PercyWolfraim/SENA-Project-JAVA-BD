package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class VistasDao extends JPanel {
    
    public VistasDao(){
        
        setLayout(null);
        setBounds(300,0,500,600);
         /*---------------------------------------------*/
        /*Ahora crearé las vistas que tendrá el panel secudario, el cual aun no
        se mostrará*/
        
        /*Empèzaré por el panel de "Insertar
        pondré primero los label de cada campo
        de la BD*/
        
        JPanel PanelInsertar = new JPanel();
        PanelInsertar.setLayout(null);
        PanelInsertar.setBounds(0,0,500,600);
        /*PanelInsertar.setVisible(false);*/
        
        JLabel ILabelCodigo = new JLabel("Inserte codigo del empleado");
        ILabelCodigo.setBounds(30,30,170,30);
        
        JLabel ILabelID = new JLabel("Inserte nombre del empleado");
        ILabelID.setBounds(30,70,170,30);
        
        JLabel ILabelCedula = new JLabel("Inserte cedula del empleado");
        ILabelCedula.setBounds(30,110,170,30);
        
        JLabel ILabelNombre = new JLabel("Inserte nombre del empleado");
        ILabelNombre.setBounds(30,150,170,30);
        
        JLabel ILabelDepartamento = new JLabel("Inserte departamento del empleado");
        ILabelDepartamento.setBounds(30,190,170,30);
        
        JLabel ILabelPuesto = new JLabel("Inserte puesto del empleado");
        ILabelPuesto.setBounds(30,230,170,30);
        
        JLabel ILabelSalario = new JLabel("Inserte departamento del empleado");
        ILabelSalario.setBounds(30,270,170,30);
        
        PanelInsertar.add(ILabelCodigo);
        PanelInsertar.add(ILabelID);
        PanelInsertar.add(ILabelCedula);
        PanelInsertar.add(ILabelNombre);
        PanelInsertar.add(ILabelDepartamento);
        add(PanelInsertar);
    }
}
