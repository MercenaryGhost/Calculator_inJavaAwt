package com.company;
import java.awt.*;
import java.awt.event.*;
public class Main {
    Main(){
        Frame f = new Frame();
        Button b = new Button();
        b.setBounds(30,90,10,10);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
	// write your code here
        //Calc c = new Calc();
    }
}

class NestedLayout extends Frame{
    TextArea textArea;
    Button bSaveAs, bok, bExit;
    TextField fileField;

public NestedLayout () {
        setLayout(new BorderLayout(2,2));
        textArea = new TextArea(12,40);
        bSaveAs = new Button("SaveAs");
        fileField = new TextField();
        bok = new Button("Ok");
        bExit = new Button("Exit");
        add(textArea, BorderLayout.CENTER);
        Panel bpanel = new Panel();
        bpanel.setLayout(new GridLayout(2,1));
        Panel subpanel1 = new Panel();
        Panel subpanel2 = new Panel();
        subpanel1.setLayout(new BorderLayout());
        subpanel2.setLayout(new FlowLayout(FlowLayout.RIGHT,2,2));
        subpanel1.add(bSaveAs, BorderLayout.WEST);
        subpanel1.add(fileField, BorderLayout.CENTER);
        subpanel2.add(bok);
        subpanel2.add(bExit);
        bpanel.add(subpanel1);
        bpanel.add(subpanel2);
        add(bpanel, BorderLayout.SOUTH);
        setSize(300,300);
        setVisible(true);
    }
}

class Border {
    Frame f;
    Border() {
        f = new Frame();
        f.setLayout(new BorderLayout(20,2));
        Button b1 = new Button ("B1");
        Button b2 = new Button ("B2");
        Button b3 = new Button ("B3");
        Button b4 = new Button ("B4");
        Button b5 = new Button ("B5");

        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.EAST);
        f.add(b3, BorderLayout.WEST);
        f.add(b4, BorderLayout.SOUTH);
        f.add(b5, BorderLayout.CENTER);


        f.setSize(300,300);
        f.setVisible(true);
    }
}
