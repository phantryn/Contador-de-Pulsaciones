
package contadorbotones;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones extends JButton {
    
    public JButton boton1;
    public JButton boton2;
    public JButton boton3;
    public Botones(){
        boton1=new JButton();
        boton2=new JButton();
        boton3=new JButton();
          disenobotones();
    }
  
    

public void disenobotones(){
boton1.setText("Boton 1");
boton1.setPreferredSize(new Dimension(230, 80));
boton1.setBounds(20,50,100,50);


boton2.setText("Boton 2");
boton2.setPreferredSize(new Dimension(130, 50));
boton2.setBounds(270,50,100,50);


boton3.setText("Reiniciar");
boton3.setPreferredSize(new Dimension(130, 50));
boton3.setBounds(150,60,100,30);



}
}