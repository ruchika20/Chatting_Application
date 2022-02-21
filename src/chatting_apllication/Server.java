package chatting_apllication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Server extends JFrame implements ActionListener{

    JPanel p1;   //--panel
    JTextField txt1;
    JTextArea txt_area;
    JButton send_bttn;
    
    Server(){
        
        setSize(450,600);
        setLocation(200,60);
        setLayout(null);
        setUndecorated(true);  // to remove frame header
        getContentPane().setBackground(Color.WHITE);
        
        p1= new JPanel();
        p1.setBounds(0,0,450,70); 
        p1.setLayout(null);
        p1.setBackground(new Color(7, 94, 84));
        add(p1);
        
        //---------------Arrow Image---------------------------
        ImageIcon arrow_1= new ImageIcon(ClassLoader.getSystemResource("icon/arrow.png"));
        Image arrow_2= arrow_1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ImageIcon arrow_3= new ImageIcon(arrow_2);
        JLabel arrow_label= new JLabel(arrow_3);
        arrow_label.setBounds(5,17,25,25);
        p1.add(arrow_label);
        
        //---------To add action in arrow icon--------------------
        arrow_label.addMouseListener(new MouseAdapter(){
            
            public void mouseClicked(MouseEvent me){
                System.exit(0);
            }
        });
        
        //------------------Profile PIc-----------------------
        ImageIcon dp_1= new ImageIcon(ClassLoader.getSystemResource("icon/server-dp-1.png"));
        Image dp_2= dp_1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon dp_3= new ImageIcon(dp_2);
        JLabel dp_label= new JLabel(dp_3);
        dp_label.setBounds(20,0,80,80);
        p1.add(dp_label);
        
        //------------------Video Icon-----------------------
        ImageIcon video_1= new ImageIcon(ClassLoader.getSystemResource("icon/video.png"));
        Image video_2= video_1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon video_3= new ImageIcon(video_2);
        JLabel video_label= new JLabel(video_3);
        video_label.setBounds(290, 20, 30, 30);
        p1.add(video_label);
        
        //------------------Phone Icon--------------------------
        ImageIcon phone_1= new ImageIcon(ClassLoader.getSystemResource("icon/phone.png"));
        Image phone_2= phone_1.getImage().getScaledInstance(35,30,Image.SCALE_DEFAULT);
        ImageIcon phone_3= new ImageIcon(phone_2);
        JLabel phone_label= new JLabel(phone_3);
        phone_label.setBounds(350, 20, 35, 30);
        p1.add(phone_label);    
      
        //-----------------3 dots icon-----------------------------
        ImageIcon icons= new ImageIcon(ClassLoader.getSystemResource("icon/3icon.png"));
        Image icons_1= icons.getImage().getScaledInstance(13,25,Image.SCALE_DEFAULT);
        ImageIcon icons_2= new ImageIcon(icons_1);
        JLabel icon_label= new JLabel(icons_2);
        icon_label.setBounds(410, 20, 13, 25);
        p1.add(icon_label); 
        
        //------------------Text Area---------------------------
        txt_area= new JTextArea();
        txt_area.setBounds(5,75,440,470);
        txt_area.setFont(new Font("SAN_SERIF", Font.PLAIN,16));
        txt_area.setEditable(false);  // to remove previous string from the text area
        add(txt_area);
        
        JLabel name= new JLabel("Ruchika");
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        name.setForeground(Color.WHITE);
        name.setBounds(110, 15, 100, 18);
        p1.add(name);   
        
        JLabel status= new JLabel("Active Now");
        status.setFont(new Font("SAN_SERIF",Font.PLAIN,14));
        status.setForeground(Color.WHITE);
        status.setBounds(110, 35, 100, 20);
        p1.add(status);
        
        txt1= new JTextField();
        txt1.setBounds(5,555,310,40);
        txt1.setFont(new Font("SAN_SERIF",Font.PLAIN, 16));
        add(txt1);       
        
        
        send_bttn= new JButton("Send");
        send_bttn.setBounds(320,555,123,40);
        send_bttn.setFont(new Font("SAN_SERIF",Font.BOLD, 16));
        send_bttn.setBackground(new Color(7, 94, 84));
        send_bttn.setForeground(Color.WHITE);
        send_bttn.addActionListener(this);
        add(send_bttn);        
        
    }
    
    //--------------overrididng actionPerformed method---------------
    public void actionPerformed(ActionEvent ae){
        
        String msgs= txt1.getText();
        txt_area.setText(txt_area.getText() +"\n"+ msgs);
        txt1.setText("");
    }
    
    //------------main method------------------------
    public static void main(String[] args) {
        new Server().setVisible(true);
    }
    
}
