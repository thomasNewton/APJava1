import javax.swing.*;
import java.awt.event.*;  //need for event handler
class gui{
    public static void main(String args[]){
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       JButton button1 = new JButton("Click me");
       frame.getContentPane().add(button1); // Adds Button to content pane of frame
       button1.setSize(30, 50);
      
       
     
     ActionListener al =new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            button1.setText(e.toString());  
        }};
    button1.addActionListener(al);


       frame.setVisible(true);
    }

}
