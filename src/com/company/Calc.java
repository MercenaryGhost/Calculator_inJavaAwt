//package com.company;

import java.awt.*;
import java.awt.event.*;

public class Calc extends Frame implements WindowListener,ActionListener{
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,plus,minus,mult,div,dot,equal,CE,del;
    TextField top, bottom;
    Panel cpanel,lpanel,rpanel,bpanel,tpanel;
    String op;
    public Calc(){
        setLayout(new BorderLayout(5,2));
        b0 = new Button("0");
        b0.setForeground(new Color(255,255,255));
        b1 = new Button("1");
        b1.setForeground(new Color(255,255,255));
        b2 = new Button("2");
        b2.setForeground(new Color(255,255,255));
        b3 = new Button("3");
        b3.setForeground(new Color(255,255,255));
        b4 = new Button("4");
        b4.setForeground(new Color(255,255,255));
        b5 = new Button("5");
        b5.setForeground(new Color(255,255,255));
        b6 = new Button("6");
        b6.setForeground(new Color(255,255,255));
        b7 = new Button("7");
        b7.setForeground(new Color(255,255,255));
        b8 = new Button("8");
        b8.setForeground(new Color(255,255,255));
        b9 = new Button("9");
        b9.setForeground(new Color(255,255,255));
        plus = new Button("+");
        plus.setForeground(new Color(255,255,255));
        minus = new Button("-");
        minus.setForeground(new Color(255,255,255));
        mult = new Button("x");
        mult.setForeground(new Color(255,255,255));
        div = new Button("/");
        div.setForeground(new Color(255,255,255));
        dot = new Button(".");
        dot.setForeground(new Color(255,255,255));
        equal = new Button("=");
        equal.setForeground(new Color(255,255,255));
        CE = new Button("CE");
        CE.setForeground(new Color(255,255,255));
        del = new Button("del");
        del.setForeground(new Color(255,255,255));

        top = new TextField();
        top.setBackground(new Color(8,39,245));
        bottom = new TextField();
        bottom.setBackground(new Color(8,39,245));

        b0.setBackground(new Color(80,80,80));
        b1.setBackground(new Color(80,80,80));
        b2.setBackground(new Color(80,80,80));
        b3.setBackground(new Color(80,80,80));
        b4.setBackground(new Color(80,80,80));
        b5.setBackground(new Color(80,80,80));
        b6.setBackground(new Color(80,80,80));
        b7.setBackground(new Color(80,80,80));
        b8.setBackground(new Color(80,80,80));
        b9.setBackground(new Color(80,80,80));
        CE.setBackground(new Color(80,80,80));
        dot.setBackground(new Color(80,80,80));
        plus.setBackground(new Color(120,120,120));
        minus.setBackground(new Color(120,120,120));
        div.setBackground(new Color(120,120,120));
        mult.setBackground(new Color(120,120,120));
        equal.setBackground(new Color(120,120,120));
        del.setBackground(new Color(120,120,120));


        cpanel = new Panel();
        cpanel.setLayout(new GridLayout(4,3));
        cpanel.add(b1);
        cpanel.add(b2);
        cpanel.add(b3);
        cpanel.add(b4);
        cpanel.add(b5);
        cpanel.add(b6);
        cpanel.add(b7);
        cpanel.add(b8);
        cpanel.add(b9);
        cpanel.add(b0);
        cpanel.add(dot);
        cpanel.add(CE);

        lpanel = new Panel();
        lpanel.setLayout(new GridLayout(2,1));
        lpanel.add(plus);
        lpanel.add(minus);

        rpanel = new Panel();
        rpanel.setLayout(new GridLayout(2,1));
        rpanel.add(mult);
        rpanel.add(div);

        bpanel = new Panel();
        bpanel.setLayout(new GridLayout(1,2));
        bpanel.add(equal);
        bpanel.add(bottom);

        tpanel = new Panel();
        tpanel.setLayout(new GridLayout(1,2));
        tpanel.add(top);
        tpanel.add(del);

        add(cpanel, BorderLayout.CENTER);
        add(lpanel, BorderLayout.WEST);
        add(rpanel, BorderLayout.EAST);
        add(tpanel, BorderLayout.NORTH);
        add(bpanel, BorderLayout.SOUTH);

        b0.addActionListener(this);  // parameter is of type ActionListener, Calc implements it
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        dot.addActionListener(this);
        equal.addActionListener(this);
        CE.addActionListener(this);
        del.addActionListener(this);

        addWindowListener(this);
        setSize(350,450);
        setBackground(new Color(0,0,0));
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        double t,b;
        String st1,st2;

        if (b0.hasFocus()){
            st1 = top.getText();
            st1 = st1+"0";
            top.setText(st1);
        }
        if (b1.hasFocus()){
            st1 = top.getText();
            st1 = st1+"1";
            top.setText(st1);
        }
        if (b2.hasFocus()){
            st1 = top.getText();
            st1 = st1+"2";
            top.setText(st1);
        }
        if (b3.hasFocus()){
            st1 = top.getText();
            st1 = st1+"3";
            top.setText(st1);
        }
        if (b4.hasFocus()){
            st1 = top.getText();
            st1 = st1+"4";
            top.setText(st1);
        }
        if (b5.hasFocus()){
            st1 = top.getText();
            st1 = st1+"5";
            top.setText(st1);
        }
        if (b6.hasFocus()){
            st1 = top.getText();
            st1 = st1+"6";
            top.setText(st1);
        }
        if (b7.hasFocus()){
            st1 = top.getText();
            st1 = st1+"7";
            top.setText(st1);
        }
        if (b8.hasFocus()){
            st1 = top.getText();
            st1 = st1+"8";
            top.setText(st1);
        }
        if (b9.hasFocus()){
            st1 = top.getText();
            st1 = st1+"9";
            top.setText(st1);
        }
        if (dot.hasFocus()){
            st1 = top.getText();
            if (st1.indexOf('.') == -1){
                st1 = st1 +".";
                top.setText(st1);
            }
        }
        if (CE.hasFocus()){
            top.setText("");
            bottom.setText("");
        }
        if (del.hasFocus()){
            st1 = top.getText();
            if (st1.length() > 0) {
                st1 = st1.substring(0, st1.length() - 1);
                top.setText(st1);
            }
        }

        if(equal.hasFocus()){
            st1 = top.getText();
            st2 = bottom.getText();
            if(!st1.isEmpty() && !st2.isEmpty()) {
                t = Double.parseDouble(st1);
                b = Double.parseDouble(st2);
                if (op.equals("+")){
                    top.setText(Double.toString(t+b));
                    bottom.setText("");
                }
                else if (op.equals("-")){
                    top.setText(Double.toString(b-t));
                    bottom.setText("");
                }
                else if (op.equals("*")){
                    top.setText(Double.toString(b*t));
                    bottom.setText("");
                }
                else if (op.equals("/")){
                    top.setText(Double.toString(b/t));
                    bottom.setText("");
                }
            }
        }

        if (plus.hasFocus()){
            st1 = top.getText();
            if(st1.isEmpty())
                st1 = st1+"0";
            t = Double.parseDouble(st1);
            st2 = bottom.getText();
            if (st2.isEmpty()) {
                bottom.setText(Double.toString(t));
                top.setText("");
            }
            else {
                b = Double.parseDouble(st2);
                if (op.equals("+")){
                    bottom.setText(Double.toString(t+b));
                    top.setText("");
                }
                else if (op.equals("-")){
                    bottom.setText(Double.toString(b-t));
                    top.setText("");
                }
                else if (op.equals("*")){
                    bottom.setText(Double.toString(b*t));
                    top.setText("");
                }
                else if (op.equals("/")){
                    bottom.setText(Double.toString(b/t));
                    top.setText("");
                }
            }
            op = "+";
        }
        else if (minus.hasFocus()){
            st1 = top.getText();
            if(st1.isEmpty())
                st1 = st1+"0";
            t = Double.parseDouble(st1);
            st2 = bottom.getText();
            if(st2.isEmpty()) {
                bottom.setText(Double.toString(t));
                top.setText("");
            }
            else {
                b = Double.parseDouble(st2);
                if (op.equals("+")){
                    bottom.setText(Double.toString(t+b));
                    top.setText("");
                }
                else if (op.equals("-")){
                    bottom.setText(Double.toString(b-t));
                    top.setText("");
                }
                else if (op.equals("*")){
                    bottom.setText(Double.toString(b*t));
                    top.setText("");
                }
                else if (op.equals("/")){
                    bottom.setText(Double.toString(b/t));
                    top.setText("");
                }
            }
            op = "-";
        }
        else if (div.hasFocus()){
            st1 = top.getText();
            if(st1.isEmpty())
                st1 = st1+"0";
            t = Double.parseDouble(st1);
            st2 = bottom.getText();
            if(st2.isEmpty()) {
                bottom.setText(Double.toString(t));
                top.setText("");
            }
            else {
                b = Double.parseDouble(st2);
                if (op.equals("+")){
                    bottom.setText(Double.toString(t+b));
                    top.setText("");
                }
                else if (op.equals("-")){
                    bottom.setText(Double.toString(b-t));
                    top.setText("");
                }
                else if (op.equals("*")){
                    bottom.setText(Double.toString(b*t));
                    top.setText("");
                }
                else if (op.equals("/")){
                    bottom.setText(Double.toString(b/t));
                    top.setText("");
                }
            }
            op = "/";
        }
        else if (mult.hasFocus()){
            st1 = top.getText();
            if(st1.isEmpty())
                st1 = st1+"0";
            t = Double.parseDouble(st1);
            st2 = bottom.getText();
            if(st2.isEmpty()) {
                bottom.setText(Double.toString(t));
                top.setText("");
            }
            else {
                b = Double.parseDouble(st2);
                if (op.equals("+")){
                    bottom.setText(Double.toString(t+b));
                    top.setText("");
                }
                else if (op.equals("-")){
                    bottom.setText(Double.toString(b-t));
                    top.setText("");
                }
                else if (op.equals("*")){
                    bottom.setText(Double.toString(b*t));
                    top.setText("");
                }
                else if (op.equals("/")){
                    bottom.setText(Double.toString(b/t));
                    top.setText("");
                }
            }
            op = "*";
        }

    }
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}

    public static void main(String[] args) {
        // write your code here
        Calc c = new Calc();
    }
}
