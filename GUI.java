
package contadorbotones;
import  Contador.Contador;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

 class GUI extends JFrame{
    Contador con = new Contador();
    public JLabel cont1;
    public JLabel cont2;
    public JPanel vent;
    public Container contenedor;
    public GUI(){
        contenedor=getContentPane();
        cont1= new JLabel();
        cont2= new JLabel();
        vent= new JPanel(null);
        this.setTitle(" Contador de pulsaciones ");
        setSize(400,200);
        this.getContentPane().setBackground(Color.BLACK);//ESTABLESER EL COLOR DE LA VENTANA
        //con.setBackground(Color.RED);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        conf();
        
    }
    public void conf (){
        //propiedades de las ventanas
        vent.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
        vent.setPreferredSize(new Dimension(400, 400));
        vent.setSize(400, 200);
        
        //botones
        Botones bot=new Botones();
        vent.add(bot.boton1);
        vent.add(bot.boton2);
        vent.add(bot.boton3);
        //bot.setBackground(Color.RED);
        contenedor.add(vent, BorderLayout.NORTH);
        // Anexion del JLabel Boton1

       vent.add(cont1);
       cont1.setText("Precione el boton  1");
       cont1.setBounds(20,100,200,50);
        //JLabel boton 2
       cont2.setText("Precione el boton  2");
       cont2.setBounds(200,100,200,50);
       vent.add(cont2);
       //crecion de oyente
       Oyenteboton1 oBoton1= new Oyenteboton1();
       Oyenteboton2 oBoton2= new Oyenteboton2();
       Oyenteboton3 oBoton3= new Oyenteboton3();
       //asicnar boton al oyente
       bot.boton1.addActionListener((ActionListener)oBoton1);
       bot.boton2.addActionListener((ActionListener)oBoton2);
       bot.boton3.addActionListener((ActionListener)oBoton3);
       }
    public class    Oyenteboton1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            con.incrementa();
            cont1.setText("A pulsado:"+con.getPulsaciones()+" veces el boton 1");
            
        }
    }
    public class Oyenteboton2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            con.incrementa1();
            cont2.setText("A pulsado:"+con.getpu()+" veces el boton 2");
                  
        }
    }
    
         public class Oyenteboton3 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            con.reinicio();
            cont1.setText("Precione el boto 1");
            cont2.setText("Precione el boto 2");
                  
        }
    }
        
    }
    
    

