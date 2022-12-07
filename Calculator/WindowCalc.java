package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowCalc extends JFrame implements WindowListener, ActionListener {
    private TextField textField = new TextField();
    private JButton b9 = new JButton("9");
    private JButton b8 = new JButton("8");
    private JButton b7 = new JButton("7");
    private JButton b6 = new JButton("6");
    private JButton b5 = new JButton("5");
    private JButton b4 = new JButton("4");
    private JButton b3 = new JButton("3");
    private JButton b2 = new JButton("2");
    private JButton b1 = new JButton("1");
    private JButton b0 = new JButton("0");
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton multip = new JButton("*");
    private JButton divi = new JButton("/");
    private JButton res = new JButton("=");
    private JButton del = new JButton("CE");
    private JButton cancel = new JButton("D");
    private JButton pm = new JButton("+/-");
    private JButton sq = new JButton("sqrt");
    private String text ="";
    private int a = 0;
    private int b = 0;
    private char z;
    private int l =55;
    private int m =55;

    public WindowCalc(){
        Font font = new Font("Impact",Font.BOLD,40);
        setLayout(null);
        setSize(400,600);
        setVisible(true);
        setLocation(600,225);
        textField.setFont(font);
        textField.setSize(315,55);
        textField.setLocation(25,25);
        textField.setVisible(true);
        add(textField);
        b9.setFont(font);
        b9.setSize(l,m);
        b9.setLocation(180,220);
        b9.setVisible(true);
        add(b9);
        b8.setFont(font);
        b8.setSize(l,m);
        b8.setLocation(100,220);
        b8.setVisible(true);
        add(b8);
        b7.setFont(font);
        b7.setSize(l,m);
        b7.setLocation(20,220);
        b7.setVisible(true);
        add(b7);
        b6.setFont(font);
        b6.setSize(l,m);
        b6.setLocation(180,300);
        b6.setVisible(true);
        add(b6);
        b5.setFont(font);
        b5.setSize(l,m);
        b5.setLocation(100,300);
        b5.setVisible(true);
        add(b5);
        b4.setFont(font);
        b4.setSize(l,m);
        b4.setLocation(20,300);
        b4.setVisible(true);
        add(b4);
        b3.setFont(font);
        b3.setSize(l,m);
        b3.setLocation(180,380);
        b3.setVisible(true);
        add(b3);
        b2.setFont(font);
        b2.setSize(l,m);
        b2.setLocation(100,380);
        b2.setVisible(true);
        add(b2);
        b1.setFont(font);
        b1.setSize(l,m);
        b1.setLocation(20,380);
        b1.setVisible(true);
        add(b1);
        b0.setFont(font);
        b0.setSize(l,m);
        b0.setLocation(100,460);
        b0.setVisible(true);
        add(b0);
        plus.setFont(font);
        plus.setSize(l,m);
        plus.setLocation(20,140);
        add(plus);
        minus.setFont(font);
        minus.setSize(l,m);
        minus.setLocation(100,140);
        minus.setVisible(true);
        add(minus);
        multip.setFont(font);
        multip.setSize(l,m);
        multip.setLocation(180,140);
        multip.setVisible(true);
        add(multip);
        divi.setFont(font);
        divi.setSize(l,m);
        divi.setLocation(260,140);
        divi.setVisible(true);
        add(divi);
        res.setFont(font);
        res.setSize(l,140);
        res.setLocation(260,390);
        res.setVisible(true);
        add(res);
        cancel.setFont(font);
        cancel.setSize(l,m);
        cancel.setLocation(260,300);
        cancel.setVisible(true);
        add(cancel);
        del.setFont(font);
        del.setSize(l,m);
        del.setLocation(260,220);
        del.setVisible(true);
        add(del);
        //pm.setFont(font);
        pm.setSize(l,m);
        pm.setLocation(20,460);
        pm.setVisible(true);
        add(pm);
        sq.setSize(l,m);
        sq.setLocation(180,460);
        sq.setVisible(true);
        add(sq);
        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        b0.addActionListener(this);
        res.addActionListener(this);
        minus.addActionListener(this);
        plus.addActionListener(this);
        multip.addActionListener(this);
        divi.addActionListener(this);
        cancel.addActionListener(this);
        del.addActionListener(this);
        pm.addActionListener(this);
        sq.addActionListener(this);

    }








    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b0){
            text = text +b0.getText();
            textField.setText(text);
        }
        if(e.getSource()==b1){
            text = text +b1.getText();
            textField.setText(text);
        }
        if(e.getSource()==b2){
            text = text +b2.getText();
            textField.setText(text);
        }
        if(e.getSource()==b3){
            text = text +b3.getText();
            textField.setText(text);
        }
        if(e.getSource()==b4){
            text = text +b4.getText();
            textField.setText(text);
        }
        if(e.getSource()==b5){
            text = text +b5.getText();
            textField.setText(text);
        }
        if(e.getSource()==b6){
            text = text +b6.getText();
            textField.setText(text);
        }
        if(e.getSource()==b7){
            text = text +b7.getText();
            textField.setText(text);
        }
        if(e.getSource()==b8){
            text = text +b8.getText();
            textField.setText(text);
        }
        if(e.getSource()==b9){
            text = text +b9.getText();
            textField.setText(text);
        }
        if(e.getSource()==del){
            text = "";
            textField.setText(text);
        }
        if(e.getSource()== plus ){
            a = Integer.parseInt(text);
            textField.setText(text+plus.getText());
            text = "";
            z ='+';
        }
        if(e.getSource()== minus ){
            a = Integer.parseInt(text);
            textField.setText(text+minus.getText());
            text = "";
            z ='-';
        }
        if(e.getSource()== multip ){
            a = Integer.parseInt(text);
            textField.setText(text+multip.getText());
            text = "";
            z ='*';
        }
        if(e.getSource()== divi ){
            a = Integer.parseInt(text);
            textField.setText(text+divi.getText());
            text = "";
            z ='/';
        }
        if(e.getSource()==cancel){
            int c = Integer.parseInt(textField.getText());
            c=c/10;
            textField.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if(e.getSource()==sq){
            int c = Integer.parseInt(textField.getText());
            c=c*c;
            textField.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if(e.getSource()==pm){
            int c = Integer.parseInt(textField.getText());
            c=c*-1;
            textField.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if(e.getSource()== res ){
            if(z=='+'){
                b=Integer.parseInt(text);
                textField.setText(String.valueOf(a+b));
            }
            else if(z=='-'){
                b=Integer.parseInt(text);
                textField.setText(String.valueOf(a-b));
            }
            else if(z=='/'){
                b=Integer.parseInt(text);
                textField.setText(String.valueOf(a/ b));
            }
            else if(z=='*'){
                b=Integer.parseInt(text);
                textField.setText(String.valueOf(a*b));
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
