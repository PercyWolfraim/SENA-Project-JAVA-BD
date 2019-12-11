/*En esta clase crearé las vistas y ventanas con las que el usuario interactuará
con el programa*/

package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*La clase se extenderá a JFrame, ya que esta sera la ventana que usaremos*/
public class Vista extends JFrame{
    
    
    public Vista(){
        /*Aqui defino las caracteristicas de la ventana*/          
        setTitle("Personal de la construccion");
        setBounds(0,0,800,600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setResizable(false);
    }
    
    /*creo un metodo en el cual se encuentren todos los elementos que tendrá el 
    JFrame*/
    public void menu (){
        /*Invocaré los paneles de "Insertar, modificar, eliminar y consultar"*/        
        VistaInsertar PanelInsert = new VistaInsertar();
        add(PanelInsert);
        
        VistaModificar PanelModificar = new VistaModificar();
        add(PanelModificar);
        
        VistaEliminar PanelEliminar = new VistaEliminar();
        add(PanelEliminar);
        
        VistaConsultar PanelConsultar = new VistaConsultar();
        add(PanelConsultar);
        /*---------------------------------------------*/
        /*Creo un panel para el menú principal, el cual aun no mostrará*/
        JPanel PanelMenuPrincipal = new JPanel();
        PanelMenuPrincipal.setLayout(null);
        PanelMenuPrincipal.setBackground(Color.DARK_GRAY);
        PanelMenuPrincipal.setBounds(0,0,300,600);
        
        /*Un label para el mensaje de bienvenida*/        
        JLabel LabelWelcome = new JLabel("Bienvenido");
        LabelWelcome.setForeground(Color.WHITE);
        LabelWelcome.setBounds(30,20,100,20);
                        
        /*Un boton para abrir el menú de "agregar empleado"*/
        JButton ButtonInsert = new JButton("Registrar Empleado");
        ButtonInsert.setBounds(30,60,150,20);
        ButtonInsert.setBackground(Color.DARK_GRAY);
        ButtonInsert.setForeground(Color.WHITE);
        ButtonInsert.setFocusable(false);
        /*Le daré un listener para hacer visible el panel de "Insertar" y si hay
        algun otro panel en el panelprincipal, que lo limpie y ponga este en su
        lugar*/
        ButtonInsert.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                PanelConsultar.setVisible(false);
                PanelEliminar.setVisible(false);
                PanelModificar.setVisible(false);
                PanelInsert.setVisible(true);
            }
        });
        
        /*Un boton para abrir el menú de "modificacion de usuario"*/
        JButton ButtonModify = new JButton("Editar Empleado");
        ButtonModify.setBounds(30,90,150,20);
        ButtonModify.setBackground(Color.DARK_GRAY);
        ButtonModify.setForeground(Color.WHITE);
        ButtonModify.setFocusable(false);
        /*Tambien le daré un listener exactamente igual al boton  de modificar*/
        ButtonModify.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                PanelConsultar.setVisible(false);
                PanelEliminar.setVisible(false);
                PanelModificar.setVisible(true);
                PanelInsert.setVisible(false);
            }
        });
        
        /*Un boton para abrir el menú de "Eliminar usuario"*/
        JButton ButtonDelete = new JButton("Eliminar Empleado");
        ButtonDelete.setBounds(30,120,150,20);
        ButtonDelete.setBackground(Color.DARK_GRAY);
        ButtonDelete.setForeground(Color.WHITE);
        ButtonDelete.setFocusable(false);
        ButtonDelete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PanelConsultar.setVisible(false);
                PanelEliminar.setVisible(true);
                PanelModificar.setVisible(false);
                PanelInsert.setVisible(false);
            }
        });
        
        /*Un boton para abrir el menú de "modificacion de usuario"*/
        JButton ButtonSearch = new JButton("Buscar Empleado");
        ButtonSearch.setBounds(30,150,150,20);
        ButtonSearch.setBackground(Color.DARK_GRAY);
        ButtonSearch.setForeground(Color.WHITE);
        ButtonSearch.setFocusable(false);
        ButtonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PanelConsultar.setVisible(true);
                PanelEliminar.setVisible(false);
                PanelModificar.setVisible(false);
                PanelInsert.setVisible(false);
            }
        });
        
        /*Y añado todo esto al  menú principal*/
        PanelMenuPrincipal.add(ButtonSearch);
        PanelMenuPrincipal.add(ButtonDelete);
        PanelMenuPrincipal.add(ButtonModify);
        PanelMenuPrincipal.add(ButtonInsert);
        PanelMenuPrincipal.add(LabelWelcome);       
        
        /*Añado el panel a la clase peeeero no lo dejo visible, ya que no se va
        a ver hasta que el usuario quiera*/
        add(PanelMenuPrincipal);
        PanelMenuPrincipal.setVisible(false);
        
        
        
        /*---------------------------------------------*/
        /*Bien, ahora crearé el panel del login, el primer panel que se mostrará
        cuando el usuario abra el programa*/
        JPanel PanelLogin = new JPanel();
        PanelLogin.setLayout(null);
        PanelLogin.setBounds(0,0,800,600);
        
        /*A parte creo un label de color oscuro para dividir la pantalla en dos,
        un trozo de pantalla para ver el menú donde el usuario seleccionará que
        hacer y uno donde el usuario ejecute sus acciones de añadir, midificar,
        eliminar y consultar usuario*/
        JPanel Border = new JPanel();
        Border.setBackground(Color.DARK_GRAY);
        Border.setBounds(0,0,300,600);
        
        /*Y añado el panel*/
        add(Border);
        
        /*Ahora voy a añadir los elementos que va a tener el panel*/
        JLabel LabelUserName = new JLabel("Ingrese su nombre");
        LabelUserName.setBounds(370,160,130,30);
        JTextField TextUserName = new JTextField("");
        TextUserName.setBounds(510,160,130,30);
        JLabel LabelPass = new JLabel("Ingrese su Contraseña");
        LabelPass.setBounds(370,260,130,30);
        JPasswordField TextPass = new JPasswordField("");
        TextPass.setBounds(510,260,130,30);
        
        /*Creo los botones de "Ingresar" y "Cancelar"*/
        JButton SingIn = new JButton("Ingresar");
        SingIn.setBounds (370,360,130,30);
        /*Creo un actionListener para que cuando el usuario de click en este
        boton, pueda cerrar el panel de login y abrir el panel del menu 
        principal*/
        SingIn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //if (TextUserName.getText().equals("ADSI")&&TextPass.getText().equals("CDMC")){
                    PanelMenuPrincipal.setVisible(true);
                    PanelLogin.setVisible(false);
                //}else{
                    //JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecta");
                //}
                
            }   
        });
        
        JButton Exit = new JButton("Salir");
        Exit.setBounds (510,360,130,30);
        /*Hago lo mismo para el boton de "Cancelar" pero cuando el usuario
        de click en este boton, el programa se cerrará*/
        Exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        
        /*Y añado todos sus elementos al panel, y el panel a la ventana*/
        PanelLogin.add(Exit);
        PanelLogin.add(SingIn);
        PanelLogin.add(LabelPass);
        PanelLogin.add(TextPass);
        PanelLogin.add(LabelUserName);
        PanelLogin.add(TextUserName);
        
        add(PanelLogin); 
        
        
       
    }
    
   
    
}
