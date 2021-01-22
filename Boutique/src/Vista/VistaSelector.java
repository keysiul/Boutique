package Vista;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class VistaSelector extends JFrame {

    private JButton vistaLogin, vistaEmpleado, vistaCliente, vistaProveedor,
            vistaPrenda, vistaVenta;
    private JPanel principal;
    private JLabel imagen;

    public VistaSelector(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800,500);

        vistaLogin = new JButton("L O G I N");
        vistaEmpleado = new JButton("E M P L E A D O S");
        vistaCliente = new JButton("C L I E N T E S");
        vistaProveedor= new JButton("PROVEEDORES");
        vistaPrenda= new JButton("S T O C K");
        vistaVenta = new JButton("V E N T A");

        principal = new JPanel();
        principal.setLayout(null);
        principal.setBackground(Color.WHITE);
        principal.setBorder(BorderFactory.createTitledBorder( BorderFactory.createLineBorder(
                new Color(0x002A5C), 2), "   REBELS BOUTIQUE   "));

        vistaLogin.setBounds(530,100,140,30);
        principal.add(vistaLogin);
        vistaCliente.setBounds(530,140,140,30);
        principal.add(vistaCliente);
        vistaEmpleado.setBounds(530,180,140,30);
        principal.add(vistaEmpleado);
        vistaPrenda.setBounds(530,220,140,30);
        principal.add(vistaPrenda);
        vistaProveedor.setBounds(530,260,140,30);
        principal.add(vistaProveedor);
        vistaVenta.setBounds(530,300,140,30);
        principal.add(vistaVenta);

        URL url = this.getClass().getResource("/img/logo.jpg");
        Image image = new ImageIcon(url).getImage();
        ImageIcon icon = new ImageIcon(image.getScaledInstance(400,400,Image.SCALE_SMOOTH));
        imagen = new JLabel();
        imagen.setIcon(icon);
        imagen.setHorizontalTextPosition(SwingConstants.CENTER);
        imagen.setVerticalTextPosition(SwingConstants.BOTTOM);

        imagen.setBounds(50,50,400,400);
        principal.add(imagen);

        setContentPane(principal);
        validate();
    }
    public static void main(String []args){
        VistaSelector v = new VistaSelector();
    }

}
