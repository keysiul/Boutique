package Vista;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class VistaLogin extends JFrame {
    SpringLayout lay;
    JPanel logo, login, completo;
    JLabel username, password, newuser, imagen;
    JButton inicio, registro;
    JTextField textUser;
    JPasswordField textPass;


    public VistaLogin(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800,500);
        completo= new JPanel();
        completo.setLayout(new GridLayout(1,2));
        completo.add(logo());
        completo.add(insertLogin());
        setContentPane(completo);
        validate();
    }

    private  JPanel insertLogin() {
        login=new JPanel();
        login.setBackground(new Color(0xFFFFFF));
        login.setBorder(BorderFactory.createTitledBorder( BorderFactory.createLineBorder(
                new Color(0x002A5C), 2), "LOGIN"));
        //login.setBounds(300,20,300,200);
        username= new JLabel("Usuario: ");
        password= new JLabel("Contraseña: ");
        newuser= new JLabel("¿Nuevo usuario?");
        inicio= new JButton("Iniciar sesión");
        registro= new JButton("Registrate");
        textPass= new JPasswordField();
        textUser=new JTextField();

        login.setLayout(null);
        username.setBounds(120,70,100,25);
        login.add(username);
        textUser.setBounds(180,70,100,25);
        login.add(textUser);
        password.setBounds(100,120,100,25);
        login.add(password);
        textPass.setBounds(180,120,100,25);
        login.add(textPass);
        inicio.setBounds(200,170,120,25);
        login.add(inicio);
        newuser.setBounds(100,250,120,25);
        login.add(newuser);
        registro.setBounds(200,250,120,25);
        login.add(registro);
        return login;

    }

    private JPanel logo(){
        logo = new JPanel();
        logo.setBackground(new Color(0xFFFFFF));
        URL url = this.getClass().getResource("/img/logo.jpg");
        Image image = new ImageIcon(url).getImage();
        ImageIcon icon = new ImageIcon(image.getScaledInstance(400,400,Image.SCALE_SMOOTH));
        imagen = new JLabel();
        imagen.setIcon(icon);
        imagen.setHorizontalTextPosition(SwingConstants.CENTER);
        imagen.setVerticalTextPosition(SwingConstants.BOTTOM);

        logo.add(imagen);
        return logo;
    }


    public static void main(String [] args){
        VistaLogin vl=new VistaLogin();
    }
}
