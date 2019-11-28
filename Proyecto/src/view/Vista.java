package view;

import com.sun.java.swing.SwingUtilities3;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Vista extends JFrame{
    
    public boolean loged = false;
    
    public Vista(){
        
           
        setTitle("Personal de la construccion");
        setBounds(0,0,800,600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
    
    public void menuPrincipal (){
        
        loged = false;
        
        JPanel PanelMenuPrincipal = new JPanel();
        PanelMenuPrincipal.setLayout(null);
        PanelMenuPrincipal.setBackground(Color.DARK_GRAY);
        PanelMenuPrincipal.setBounds(0,0,300,600);
        
        
        
        JLabel LabelWelcome = new JLabel("Bienvenido");
        LabelWelcome.setForeground(Color.WHITE);
        LabelWelcome.setBounds(30,20,100,20);
        
                
        
        JButton ButtonInsert = new JButton("Registrar Empleado");
        ButtonInsert.setBounds(30,60,150,20);
        ButtonInsert.setBackground(Color.DARK_GRAY);
        ButtonInsert.setForeground(Color.WHITE);
        ButtonInsert.setFocusable(false);
        
        JButton ButtonModify = new JButton("Editar Empleado");
        ButtonModify.setBounds(30,90,150,20);
        ButtonModify.setBackground(Color.DARK_GRAY);
        ButtonModify.setForeground(Color.WHITE);
        ButtonModify.setFocusable(false);
        
        JButton ButtonDelete = new JButton("Eliminar Empleado");
        ButtonDelete.setBounds(30,120,150,20);
        ButtonDelete.setBackground(Color.DARK_GRAY);
        ButtonDelete.setForeground(Color.WHITE);
        ButtonDelete.setFocusable(false);
        
        JButton ButtonSearch = new JButton("Buscar Empleado");
        ButtonSearch.setBounds(30,150,150,20);
        ButtonSearch.setBackground(Color.DARK_GRAY);
        ButtonSearch.setForeground(Color.WHITE);
        ButtonSearch.setFocusable(false);
        
        PanelMenuPrincipal.add(ButtonSearch);
        PanelMenuPrincipal.add(ButtonDelete);
        PanelMenuPrincipal.add(ButtonModify);
        PanelMenuPrincipal.add(ButtonInsert);
        PanelMenuPrincipal.add(LabelWelcome);       
        
        
        add(PanelMenuPrincipal);
    }  
    
    public void login (){
        
        JPanel PanelLogin = new JPanel();
        PanelLogin.setLayout(null);
        PanelLogin.setBounds(0,0,800,600);
        
        JPanel Border = new JPanel();
        Border.setBackground(Color.DARK_GRAY);
        Border.setBounds(0,0,300,600);
        
        add(Border);
        
        JLabel LabelUserName = new JLabel("Ingrese su nombre");
        LabelUserName.setBounds(370,160,130,30);
        JTextArea TextUserName = new JTextArea("");
        TextUserName.setBounds(510,160,130,30);
        JLabel LabelPass = new JLabel("Ingrese su Contraseña");
        LabelPass.setBounds(370,260,130,30);
        JTextArea TextPass = new JTextArea("");
        TextPass.setBounds(510,260,130,30);
        
        JButton SingIn = new JButton("Ingresar");
        SingIn.setBounds (370,360,130,30);
        SingIn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                PanelLogin.setVisible(false);
                loged = true;
            }   
        });
        
        JButton Exit = new JButton("Salir");
        Exit.setBounds (510,360,130,30);
        Exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        
        PanelLogin.add(Exit);
        PanelLogin.add(SingIn);
        PanelLogin.add(LabelPass);
        PanelLogin.add(TextPass);
        PanelLogin.add(LabelUserName);
        PanelLogin.add(TextUserName);
        
        add(PanelLogin); 
    }
    
   
    /*JPanel PanelMenuSecundario = new JPanel();
    PanelMenuSecundario.setLayout(null);
    PanelMenuSecundario.setBounds(400,0,400,600);*/
}
