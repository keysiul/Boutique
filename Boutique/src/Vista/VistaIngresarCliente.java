package Vista;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class VistaIngresarCliente extends JFrame {
    private JLabel lidCliente,lnombre,lapellidoP,
            lapellidoM,ltipoCliente,lcompras,ltelefono, imagen;
    private JTextField tidCliente,tnombre,tapellidoP,
            tapellidoM,tTelefono;
    private JPanel panel;
    private JButton botonBuscar, btnInsertar, btnActualizar, btnEliminar;

    public VistaIngresarCliente(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800,500);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createTitledBorder( BorderFactory.createLineBorder(
                new Color(0x002A5C), 2), "   EMPLEADO   "));

        URL url = this.getClass().getResource("/img/logo.jpg");
        Image image = new ImageIcon(url).getImage();
        ImageIcon icon = new ImageIcon(image.getScaledInstance(100,85,Image.SCALE_SMOOTH));
        imagen = new JLabel();
        imagen.setIcon(icon);
        imagen.setBounds(10,10,100,100);
        panel.add(imagen);

        lidCliente = new JLabel("idEmpleado: ");
        tidCliente = new JTextField(20);
        lidCliente.setBounds(70,100,80,25);
        panel.add(lidCliente);
        tidCliente.setBounds(150,100,120,25);
        panel.add(tidCliente);
        lnombre = new JLabel("Nombre:");
        tnombre = new JTextField(20);
        lnombre.setBounds(90,150,100,25);
        panel.add(lnombre);
        tnombre.setBounds(150,150,120,25);
        panel.add(tnombre);
        lapellidoP = new JLabel("Apellido paterno:  ");
        tapellidoP = new JTextField(20);
        lapellidoP.setBounds(40,200,110,25);
        panel.add(lapellidoP);
        tapellidoP.setBounds(150,200,120,25);
        panel.add(tapellidoP);
        lapellidoM = new JLabel("Apellido materno");
        tapellidoM = new JTextField(20);
        lapellidoM.setBounds(40,250,110,25);
        panel.add(lapellidoM);
        tapellidoM.setBounds(150,250,120,25);
        panel.add(tapellidoM);

        botonBuscar = new JButton("Buscar");
        botonBuscar.setBounds(450,100,120,25);
        panel.add(botonBuscar);

        ltipoCliente = new JLabel("Tipo Cliente: ---");
        ltipoCliente.setBounds(400,170,100,25);
        panel.add(ltipoCliente);

        lcompras = new JLabel("    Compras: ---");
        lcompras.setBounds(400,200,100,25);
        panel.add(lcompras);

        ltelefono= new JLabel("Telefono:  ");
        tTelefono = new JTextField(20);
        ltelefono.setBounds(400,250,110,25);
        panel.add(ltelefono);
        tTelefono.setBounds(460,250,120,25);
        panel.add(tTelefono);

        btnInsertar = new JButton("Insertar");
        btnInsertar.setBounds(150,370,120,25);
        panel.add(btnInsertar);
        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(300,370,120,25);
        panel.add(btnActualizar);
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(450,370,120,25);
        panel.add(btnEliminar);

        setContentPane(panel);
        getContentPane().setBackground(Color.WHITE);
        validate();
    }

 public static void main(String []args){
        VistaIngresarCliente v = new VistaIngresarCliente();
 }
}
