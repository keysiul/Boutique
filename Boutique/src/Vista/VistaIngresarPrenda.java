package Vista;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class VistaIngresarPrenda extends JFrame {
    private JLabel lidPrenda,lnombreP,ltalla,
            lcolor,lmarca,lgenero,lprecioVenta,lprecioCompra, imagen;
    private JTextField tidPrenda,tnombreP,tTalla,
            tcolor,tmarca,tgenero,tprecioVenta,tprecioCompra;
    private JPanel panel;
    private JButton botonBuscar, btnInsertar, btnEliminar, btnActualizar;

    public VistaIngresarPrenda(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800,500);

        setContentPane(init());
        validate();

    }

    private JPanel init() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createTitledBorder( BorderFactory.createLineBorder(
                new Color(0x002A5C), 2), "   PRENDA   "));

        URL url = this.getClass().getResource("/img/logo.jpg");
        Image image = new ImageIcon(url).getImage();
        ImageIcon icon = new ImageIcon(image.getScaledInstance(100,85,Image.SCALE_SMOOTH));
        imagen = new JLabel();
        imagen.setIcon(icon);
        imagen.setBounds(10,10,100,100);
        panel.add(imagen);
        lidPrenda = new JLabel("idPrenda:");
        tidPrenda = new JTextField(20);
        lidPrenda.setBounds(80,100,80,25);
        panel.add(lidPrenda);
        tidPrenda.setBounds(150,100,120,25);
        panel.add(tidPrenda);
        lnombreP = new JLabel("Prenda:");
        tnombreP = new JTextField(20);
        lnombreP.setBounds(90,150,100,25);
        panel.add(lnombreP);
        tnombreP.setBounds(150,150,120,25);
        panel.add(tnombreP);
        ltalla = new JLabel("Talla:  ");
        tTalla = new JTextField(20);
        ltalla.setBounds(100,200,110,25);
        panel.add(ltalla);
        tTalla.setBounds(150,200,120,25);
        panel.add(tTalla);
        lcolor = new JLabel("Color: ");
        tcolor = new JTextField(20);
        lcolor.setBounds(100,250,110,25);
        panel.add(lcolor);
        tcolor.setBounds(150,250,120,25);
        panel.add(tcolor);
        lmarca = new JLabel("Marca:  ");
        lmarca.setBounds(100,300,100,25);
        panel.add(lmarca);
        tmarca = new JTextField();
        tmarca.setBounds(150,300,120,25);
        panel.add(tmarca);

        botonBuscar = new JButton("Buscar");
        botonBuscar.setBounds(450,100,120,25);
        panel.add(botonBuscar);


        lgenero = new JLabel("Genero: ");
        lgenero.setBounds(400,200,100,25);
        panel.add(lgenero);
        tgenero = new JTextField();
        tgenero.setBounds(450,200,120,25);
        panel.add(tgenero);
        lprecioVenta = new JLabel("Precio Venta:  ");
        lprecioVenta.setBounds(370,250,120,25);
        panel.add(lprecioVenta);
        tprecioVenta = new JTextField();
        tprecioVenta.setBounds(450,250,120,25);
        panel.add(tprecioVenta);
        lprecioCompra = new JLabel("Precio Compra:  ");
        lprecioCompra.setBounds(360,300,120,25);
        panel.add(lprecioCompra);
        tprecioCompra = new JTextField();
        tprecioCompra.setBounds(450,300,120,25);
        panel.add(tprecioCompra);

        btnInsertar = new JButton("Insertar");
        btnInsertar.setBounds(150,370,120,25);
        panel.add(btnInsertar);
        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(300,370,120,25);
        panel.add(btnActualizar);
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(450,370,120,25);
        panel.add(btnEliminar);

        return panel;

    }

    public static void main(String []args){
        VistaIngresarPrenda v = new VistaIngresarPrenda();
    }
}
