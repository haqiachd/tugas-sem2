package com.wsibd.w5.tugas;

import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class DrawShapes extends Applet { // extends dari class Appliet

    Font font;
    Color redColor, blueColor;
    Color backgroundColor;

    /**
     * Override dari method init dari class Applet
     */
    @Override
    public void init(){
        font = new Font("Arial", Font.ITALIC, 18);

        redColor = Color.red;
        backgroundColor = Color.ORANGE;

        blueColor = new Color(0, 0, 122);

        setBackground(backgroundColor);
    }

    /**
     * Override dari method stop dari class Applet
     */
    @Override
    public void stop(){

    }

    /**
     * Override dari method paint dari class Applet
     */
    @Override
    public void paint(Graphics graph){
        graph.setFont(font);
        graph.drawString("Draw Shapes", 90, 20);

        graph.setColor(blueColor);

        graph.drawRect(120, 120, 120, 120);

        graph.fillRect(115, 155, 90,90);

        graph.setColor(redColor);

        graph.fillArc(110, 110, 50, 50, 0, 360);

        graph.setColor(Color.CYAN);

        graph.drawRect(50, 50, 50, 50);

        graph.fillRect(50, 50, 60, 60);
    }

}
