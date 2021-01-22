package Vista;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class VistaIngresarEmpleado extends JFrame {
    private JLabel lrfc,lnombre,lapellidoP,
            lapellidoM,ldomicilio,lfechaN,lfechaC, imagen;
    private JTextField trfc,tnombre,tapellidoP,
            tapellidoM,tdomicilio,tfechaN,tfechaC;
    private JPanel panel;
    private JButton botonBuscar, btnInsertar, btnActualizar, btnEliminar;
    private JDateChooser calendar1, calendar2;

    public VistaIngresarEmpleado(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800,500);
        panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));
        panel.setBorder(BorderFactory.createTitledBorder( BorderFactory.createLineBorder(
                new Color(0x002A5C), 2), "   EMPLEADO   "));
        panel.add(ladoIzquierdo());
        panel.add(ladoDerecho());
        setContentPane(panel);
        getContentPane().setBackground(Color.WHITE);
        validate();
    }

    private JPanel ladoIzquierdo(){
        JPanel izq = new JPanel();
        izq.setLayout(null);
        izq.setBackground(Color.WHITE);

        URL url = this.getClass().getResource("/img/logo.jpg");
        Image image = new ImageIcon(url).getImage();
        ImageIcon icon = new ImageIcon(image.getScaledInstance(100,85,Image.SCALE_SMOOTH));
        imagen = new JLabel();
        imagen.setIcon(icon);
        imagen.setBounds(5,5,100,100);
        izq.add(imagen);

        lrfc = new JLabel("RFC: ");
        trfc = new JTextField(20);
        lrfc.setBounds(105,70,40,25);
        izq.add(lrfc);
        trfc.setBounds(150,70,120,25);
        izq.add(trfc);
        lnombre = new JLabel("Nombre:");
        tnombre = new JTextField(20);
        lnombre.setBounds(90,120,100,25);
        izq.add(lnombre);
        tnombre.setBounds(150,120,120,25);
        izq.add(tnombre);
        lapellidoP = new JLabel("Apellido paterno:  ");
        tapellidoP = new JTextField(20);
        lapellidoP.setBounds(40,170,110,25);
        izq.add(lapellidoP);
        tapellidoP.setBounds(150,170,120,25);
        izq.add(tapellidoP);
        lapellidoM = new JLabel("Apellido materno");
        tapellidoM = new JTextField(20);
        lapellidoM.setBounds(40,220,110,25);
        izq.add(lapellidoM);
        tapellidoM.setBounds(150,220,120,25);
        izq.add(tapellidoM);
        return izq;
    }

    private JPanel ladoDerecho(){
        JPanel der = new JPanel();
        der.setLayout(null);
        der.setBackground(Color.WHITE);
        botonBuscar = new JButton("Buscar");
        botonBuscar.setBounds(150,70,120,25);
        der.add(botonBuscar);
        ldomicilio = new JLabel("Domicilio: ");
        ldomicilio.setBounds(75,120,100,25);
        der.add(ldomicilio);
        tdomicilio = new JTextField();
        tdomicilio.setBounds(140,120,200,25);
        der.add(tdomicilio);
        lfechaN = new JLabel("Fecha de nacimiento: ");
        lfechaN.setBounds(10,150,125,25);
        der.add(lfechaN);
        calendar1 = new JDateChooser();
        calendar1.setDateFormatString("yyyy-MM-dd");
        calendar1.setBounds(140,150,100,25);
        der.add(calendar1);
        lfechaC = new JLabel("Fecha de Contratación: ");
        lfechaC.setBounds(5,190,135,25);
        der.add(lfechaC);
        calendar2 = new JDateChooser();
        calendar2.setDateFormatString("yyyy-MM-dd");
        calendar2.setBounds(140,190,100,25);
        der.add(calendar2);

        btnInsertar = new JButton("Insertar");
        btnInsertar.setBounds(15,350,100,25);
        der.add(btnInsertar);
        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(120,350,100,25);
        der.add(btnActualizar);
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(230,350,100,25);
        der.add(btnEliminar);


        return der;
    }
    public String getFechaN(){
        java.util.Date  fecha=calendar1.getDate();
        DateFormat f=new SimpleDateFormat("yyyy-MM-dd");
        String fecha2=f.format(fecha);
        return fecha2;
    }
    public String getFechaC(){
        java.util.Date  fecha=calendar2.getDate();
        DateFormat f=new SimpleDateFormat("yyyy-MM-dd");
        String fecha2=f.format(fecha);
        return fecha2;
    }

    public static void main(String[]args){
        new VistaIngresarEmpleado();
    }
}
