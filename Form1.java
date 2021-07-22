import javax.swing.*;
import java.awt.*;

public class Form1 {
    public static void main (String [] args) {
        //JFrame
        JFrame frame = new JFrame("Form1");
        
        //JPanel
        JPanel panel = new JPanel();
        panel.setBounds(200,350,200,200);
        panel.setLayout(null);
        
        //JLabel for Student's Registration Form
        JLabel jl1 = new JLabel("Student Registration Form");
        jl1.setBounds(300,0,500,70);
        
        //Font for Student's Registration Form
        Font ff_jl1 = new Font("Times New Roman", Font.BOLD, 30);
        jl1.setFont(ff_jl1);
        
        panel.add(jl1);
        
        //JLabel for Student ID
        JLabel jl2 = new JLabel("Student ID:");
        jl2.getText();
        jl2.setBounds(42,60,100,50);
        
        //Font for Student ID
        Font ff_jl2 = new Font("Arial", Font.BOLD, 16);
        jl2.setFont(ff_jl2);
        
        panel.add(jl2);
        
        //JTextField for Student ID
        JTextField text2 = new JTextField();
        text2.setBounds(145,70,120,30);
        
        panel.add(text2);
        
        //JLabel for School Year
        JLabel jl3 = new JLabel();
        jl3.setText("School Year:");
        jl3.setBounds(670,60,100,50);
        
        // Font for School Year
        Font ff_jl3 = new Font("Arial", Font.BOLD, 16);
        jl3.setFont(ff_jl3);
        
        panel.add(jl3);
        
        //JComboBox for School Year
        String SchoolYear[] = {"2014-2015", "2015-2016", "2016-2017", "2017-2018", "2018-2019", "2019-2020", "2020-2021" };      
        JComboBox cb = new JComboBox(SchoolYear);
        cb.setBounds(795,70,150,30);
        
        //Font for JComboBox of School Year
        Font ff_cb = new Font("Arial", Font.BOLD, 14);
        cb.setFont(ff_cb);
        
        panel.add(cb);
        
        //JLabel for First Name
        JLabel jl4 = new JLabel();
        jl4.setText("First Name:");
        jl4.setBounds(40,110,100,50);
        
        //Font for First Name
        Font ff_jl4 = new Font("Arial", Font.BOLD, 16);
        jl4.setFont(ff_jl4);
        
        panel.add(jl4);
        
        //JTextField for First Name
        JTextField text3 = new JTextField();
        text3.setBounds(145,120,160,30);
        
        panel.add(text3);
        
        //JLabel for Last Name
        JLabel jl5 = new JLabel();
        jl5.setText("Last Name:");
        jl5.setBounds(330,110,100,50);
        
        //Font for Last Name
        Font ff_jl5 = new Font("Arial", Font.BOLD, 16);
        jl5.setFont(ff_jl5);
        
        panel.add(jl5);
        
        //JTextField for Last Name
        JTextField text4 = new JTextField();
        text4.setBounds(430,120,180,30);
        
        panel.add(text4);
        
        //JLabel for Middle Name
        JLabel jl6 = new JLabel();
        jl6.setText("Middle Name:");
        jl6.setBounds(665,110,130,50);
        
        //Font for Middle Name
        Font ff_jl6 = new Font("Arial", Font.BOLD, 16);
        jl6.setFont(ff_jl6);
        
        panel.add(jl6);
        
        //JTextField for Middle Name
        JTextField text5 = new JTextField();
        text5.setBounds(795,120,150,30);
        
        panel.add(text5);
        
        //JLabel for Address
        JLabel jl7 = new JLabel("Address:");
        jl7.getText();
        jl7.setBounds(57,160,110,50);
        
        //Font for Address
        Font ff_jl7 = new Font("Arial", Font.BOLD, 16);
        jl7.setFont(ff_jl7);
        
        panel.add(jl7);
        
        //JTextArea for Address
        JTextArea area1 = new JTextArea();
        area1.setBounds(145,170,160,50);
        
        panel.add(area1);
        
        //Jlabel for Date of Birth
        JLabel jl8 = new JLabel();
        jl8.setText("Date of Birth:");
        jl8.setBounds(317,160,110,50);
        
        //Font for Date of Birth
        Font ff_jl8 = new Font("Arial", Font.BOLD, 16);
        jl8.setFont(ff_jl8);
        
        panel.add(jl8);
        
        //JComboBox for Date of Birth----->Year
        String Year[] = {"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003"};      
        JComboBox cb1 = new JComboBox(Year);
        cb1.setBounds(430,170,60,30);
        
        //Font for JComboBox of Date of Birth
        Font ff_cb1 = new Font("Arial", Font.BOLD, 14);
        cb1.setFont(ff_cb1);
        
        //JComboBox for Date of Birth------->Month
        String Month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};      
        JComboBox cb2 = new JComboBox(Month);
        cb2.setBounds(500,170,90,30);
        
        //Font
        Font ff_cb2 = new Font("Arial", Font.BOLD, 14);
        cb2.setFont(ff_cb2);
        
        //JComboBox for Date of Birth------->Day
        String Day[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};      
        JComboBox cb3 = new JComboBox(Day);
        cb3.setBounds(600,170,50,30);
        
        //Font
        Font ff_cb3 = new Font("Arial", Font.BOLD, 14);
        cb3.setFont(ff_cb3);
        
        panel.add(cb1);
        panel.add(cb2);
        panel.add(cb3);
        
        //JLabel for Place of Birth
        JLabel jl9 = new JLabel();
        jl9.setText("Place of Birth:");
        jl9.setBounds(660,160,115,50);
        
        //Font for Place of Birth
        Font ff_jl9 = new Font("Arial", Font.BOLD, 16);
        jl9.setFont(ff_jl9);
        
        panel.add(jl9);
        
        //JTextArea for Place of Birth
        JTextArea area2 = new JTextArea();
        area2.setBounds(795,170,150,50);
        
        panel.add(area2);
        
        //JLabel for Age
        JLabel jl10 = new JLabel();
        jl10.setText("Age:");
        jl10.setBounds(90,230,70,50);
        
        //Font for Age
        Font ff_jl10 = new Font("Arial", Font.BOLD, 16);
        jl10.setFont(ff_jl10);
        
        panel.add(jl10);
        
        //JTextField for Age
        JTextField text6= new JTextField();
        text6.setBounds(145,240,90,30);
        
        panel.add(text6);
        
        //Jlabel for Gender
        JLabel jl11 = new JLabel();
        jl11.setText("Gender:");
        jl11.setBounds(355,230,100,50);
        
        //Font for Gender
        Font ff_jl11 = new Font("Arial", Font.BOLD, 16);
        jl11.setFont(ff_jl11);
        
        panel.add(jl11);
        
        //JRadioButton for Gender---Male
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(430,230,65,50);
        
        //Font for RadioButton of Gender
        Font ff_r1 = new Font("Arial", Font.BOLD, 12);
        r1.setFont(ff_r1);
        
        //JRadioButton for Gender---Female
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(510,230,120,50);
        
        //Font
        Font ff_r2 = new Font("Arial", Font.BOLD, 12);
        r2.setFont(ff_r2);
        
        panel.add(r1);
        panel.add(r2);
        
        //JLabel for Status
        JLabel jl12 = new JLabel();
        jl12.setText("Status:");
        jl12.setBounds(715,230,100,50);
        
        //Font for Status
        Font ff_jl12 = new Font("Arial", Font.BOLD, 16);
        jl12.setFont(ff_jl12);
        
        panel.add(jl12);
        
        //JComboBox for Status
        String status[] = {"Single","Married"};      
        JComboBox cb4 = new JComboBox(status);
        cb4.setBounds(795,240,150,30);
        
        //Font for JComboBox for Status
        Font ff_cb4 = new Font("Arial", Font.BOLD, 14);
        cb4.setFont(ff_cb4);
        
        panel.add(cb4);
        
        //JLabel for Year
        JLabel jl13 = new JLabel();
        jl13.setText("Year:");
        jl13.setBounds(87,280,70,50);
        
        //Font for Year
        Font ff_jl13 = new Font("Arial", Font.BOLD, 16);
        jl13.setFont(ff_jl13);
        
        panel.add(jl13);
        
        //JComboBox for Year
        String Y[]= {"1st","2nd","3rd","4th"};  
        JComboBox cb5 = new JComboBox(Y);
        cb5.setBounds(145,290,100,30);
        
        //Font for JComboBox of Year
        Font ff_cb5 = new Font("Arial", Font.BOLD, 14);
        cb5.setFont(ff_cb5);
        
        panel.add(cb5);
        
        //JLabel for Guardian
        JLabel jl14 = new JLabel();
        jl14.setText("Guardian:");
        jl14.setBounds(345,280,100,50);
        
        //Font for Guardian
        Font ff_jl14 = new Font("Arial", Font.BOLD, 16);
        jl14.setFont(ff_jl14);
        
        panel.add(jl14);
        
        //JTextField for Guardian
        JTextField text7= new JTextField();
        text7.setBounds(435,290,190,30);
        
        panel.add(text7);
        
        //Jlabel for Relation
        JLabel jl15 = new JLabel();
        jl15.setText("Relation:");
        jl15.setBounds(705,280,100,50);
        
        //Font for Relation
        Font ff_jl15 = new Font("Arial", Font.BOLD, 16);
        jl15.setFont(ff_jl15);
        
        panel.add(jl15);
        
        //JTextField for Relation
        JTextField text8= new JTextField();
        text8.setBounds(795,290,150,30);
        
        panel.add(text8);
        
        //Jlabel for address
        JLabel jl16 = new JLabel();
        jl16.setText("Address:");
        jl16.setBounds(57,330,70,50);
        
        //Font for address
        Font ff_jl16 = new Font("Arial", Font.BOLD, 16);
        jl16.setFont(ff_jl16);
        
        panel.add(jl16);
        
        //JTextArea for address
        JTextArea area3 = new JTextArea();
        area3.setBounds(145,345,310,50);
        
        panel.add(area3);
        
        //JLabel for Contact
        JLabel jl17 = new JLabel();
        jl17.setText("Contact #:");
        jl17.setBounds(540,330,80,50);
        
        //Font for Contact
        Font ff_jl17 = new Font("Arial", Font.BOLD, 16);
        jl17.setFont(ff_jl17);
        
        panel.add(jl17);
        
        //JTextField for Contact
        JTextField text9 = new JTextField();
        text9.setBounds(635,345,310,30);
        
        panel.add(text9);
        
        //JButton
        JButton b1 = new JButton("|<");
        b1.setBounds(50,455,80,30);
        
        JButton b2 = new JButton("<<");
        b2.setBounds(140,455,80,30);
        
        JButton b3 = new JButton(">>");
        b3.setBounds(230,455,80,30);
        
        JButton b4 = new JButton(">|");
        b4.setBounds(320,455,80,30);
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        
        //JLabel
        JLabel jl18 = new JLabel();
        jl18.setText("0 of 0");
        jl18.setBounds(410,445,130,50);
        
        //Font
        Font ff_jl18 = new Font("Arial", Font.BOLD, 16);
        jl18.setFont(ff_jl18);
        
        panel.add(jl18);
        
        //JButton
        JButton b5 = new JButton("New");
        b5.setBounds(600,450,150,40);
        
        JButton b6 = new JButton("Save");
        b6.setBounds(770,450,190,40);
        
        panel.add(b5);
        panel.add(b6);
        
        frame.add(panel);
        frame.setBounds(190,140,1000,550);
        frame.setVisible(true);
        frame.setResizable(false);
        
    }
}