package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Buttons    {



    Font sansSerif = new Font(Font.SANS_SERIF, Font.BOLD, 20);

    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn0 = new JButton("0");
    JButton btnDot = new JButton(".");
    JButton btnAdd = new JButton("+");
    JButton btnSubtract = new JButton("-");
    JButton btnMultiply = new JButton("*");
    JButton btnDivide = new JButton("/");
    JButton btnEnter = new JButton("=");
    JButton btnDel = new JButton("DEL");
    JButton btnClear = new JButton("C");
    JButton btnMinus = new JButton("+/-");
    JButton btnClearAll = new JButton("CE");





    public JButton getBtnClearAll(){
        btnClearAll.setBackground(Color.LIGHT_GRAY);
        btnClearAll.setForeground(Color.BLACK);
        btnClearAll.setFont(sansSerif);

        return btnClearAll;
    }

    JButton getBtnMinus(){
        btnMinus.setBackground(Color.white);
        btnMinus.setForeground(Color.BLACK);
        btnMinus.setFont(sansSerif);
        return btnMinus;
    }


    JButton getBtn1(){
        btn1.setBackground(Color.white);
        btn1.setForeground(Color.BLACK);
        btn1.setFont(sansSerif);
        InputMap inputMap = btn1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(btn1.getText().toString()), btn1.getText().toString());
        inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + btn1.getText().toString()), btn1.getText().toString());
        return btn1;
    }
    JButton getBtn2(){
        btn2.setBackground(Color.white);
        btn2.setForeground(Color.BLACK);
        btn2.setFont(sansSerif);
        InputMap inputMap = btn2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(btn2.getText().toString()), btn2.getText().toString());
        inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + btn2.getText().toString()), btn2.getText().toString());
        return btn2;
    }

    JButton getBtn3(){
        btn3.setBackground(Color.white);
        btn3.setForeground(Color.BLACK);
        btn3.setFont(sansSerif);
        InputMap inputMap = btn3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(btn3.getText().toString()), btn3.getText().toString());
        inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + btn3.getText().toString()), btn3.getText().toString());
        return btn3;
    }

    JButton getBtn4(){
        btn4.setBackground(Color.white);
        btn4.setForeground(Color.BLACK);
        btn4.setFont(sansSerif);
        InputMap inputMap = btn4.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(btn4.getText().toString()), btn4.getText().toString());
        inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + btn4.getText().toString()), btn4.getText().toString());
        return btn4;

    }

    JButton getBtn5(){
        btn5.setBackground(Color.white);
        btn5.setForeground(Color.BLACK);
        btn5.setFont(sansSerif);
        InputMap inputMap = btn5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(btn5.getText().toString()), btn5.getText().toString());
        inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + btn5.getText().toString()), btn5.getText().toString());
        return btn5;
    }

    JButton getBtn6(){
        btn6.setBackground(Color.white);
        btn6.setForeground(Color.BLACK);
        btn6.setFont(sansSerif);
        InputMap inputMap = btn6.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(btn6.getText().toString()), btn6.getText().toString());
        inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + btn6.getText().toString()), btn6.getText().toString());
        return btn6;
    }

    JButton getBtn7(){
        btn7.setBackground(Color.white);
        btn7.setForeground(Color.BLACK);
        btn7.setFont(sansSerif);
        InputMap inputMap = btn7.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(btn7.getText().toString()), btn7.getText().toString());
        inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + btn7.getText().toString()), btn7.getText().toString());
        return btn7;
    }

    JButton getBtn8(){
        btn8.setBackground(Color.white);
        btn8.setForeground(Color.BLACK);
        btn8.setFont(sansSerif);
        InputMap inputMap = btn8.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(btn8.getText().toString()), btn8.getText().toString());
        inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + btn8.getText().toString()), btn8.getText().toString());
        return btn8;
    }

    JButton getBtn9(){
        btn9.setBackground(Color.white);
        btn9.setForeground(Color.BLACK);
        btn9.setFont(sansSerif);
        InputMap inputMap = btn9.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(btn9.getText().toString()), btn9.getText().toString());
        inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + btn9.getText().toString()), btn9.getText().toString());
        return btn9;
    }

    JButton getBtn0(){
        btn0.setBackground(Color.white);
        btn0.setForeground(Color.BLACK);
        btn0.setFont(sansSerif);
        InputMap inputMap = btn0.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(btn0.getText().toString()), btn0.getText().toString());
        inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + btn0.getText().toString()), btn0.getText().toString());
        return btn0;
    }

    JButton getBtnDot(){
        btnDot.setBackground(Color.white);
        btnDot.setForeground(Color.BLACK);
        btnDot.setFont(sansSerif);
        InputMap inputMap = btnDot.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(btnDot.getText().toString()), btnDot.getText().toString());
        inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + btnDot.getText().toString()), btnDot.getText().toString());
        return btnDot;
    }

    JButton getBtnAdd(){
        btnAdd.setBackground(Color.LIGHT_GRAY);
        btnAdd.setForeground(Color.BLACK);
        btnAdd.setFont(sansSerif);
        btnAdd.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "Plus");


        return btnAdd;
    }

    JButton getBtnSubtract(){
        btnSubtract.setBackground(Color.LIGHT_GRAY);
        btnSubtract.setForeground(Color.BLACK);
        btnSubtract.setFont(sansSerif);
        btnSubtract.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "Minus");


        return btnSubtract;
    }

    JButton getBtnMultiply(){
        btnMultiply.setBackground(Color.LIGHT_GRAY);
        btnMultiply.setForeground(Color.BLACK);
        btnMultiply.setFont(sansSerif);
        btnMultiply.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0), "Multiply");


        return btnMultiply;
    }

    JButton getBtnDivide(){
        btnDivide.setBackground(Color.LIGHT_GRAY);
        btnDivide.setForeground(Color.BLACK);
        btnDivide.setFont(sansSerif);
        btnDivide.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0), "Divide");


        return btnDivide;
    }

    JButton getBtnEnter(){
        btnEnter.setBackground(Color.orange);
        btnEnter.setForeground(Color.BLACK);
        btnEnter.setFont(sansSerif);
        btnEnter.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");

        return btnEnter;
    }

    JButton getBtnDel(){
        btnDel.setBackground(Color.LIGHT_GRAY);
        btnDel.setForeground(Color.BLACK);
        btnDel.setFont(sansSerif);
        btnDel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "Delete");
        btnDel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "Backspace");


        return btnDel;
    }

    JButton getBtnClear(){
        btnClear.setBackground(Color.LIGHT_GRAY);
        btnClear.setForeground(Color.BLACK);
        btnClear.setFont(sansSerif);
        return btnClear;
    }



















}




