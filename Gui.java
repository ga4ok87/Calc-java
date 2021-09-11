package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Gui {


    public void ShowGui() {
        Boolean isNewExpression = false;

       Buttons button = new  Buttons();
       Display display = new Display();
       StringToMath stringToMath = new StringToMath();
       MathOperation mathOperation = new MathOperation();
       Math math = new Math();

        JFrame frame = new JFrame("КАЛЬКУЛЯТОР");

        JScrollPane scrollPane = new JScrollPane(display.getHistory());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JPanel numbersPanel = new JPanel(new GridLayout(0,4));
        JPanel displayPanel = new JPanel(new GridLayout(0,1));
        JPanel historyPanel = new JPanel(new GridLayout(0,1));
        JPanel mainPanel = new JPanel((new BorderLayout()));

        frame.setPreferredSize(new Dimension(600,350));
        frame.setLayout(new BorderLayout(1,1));


        Action numberAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.isNewExpression == true) display.getResult().setText("");

                if (display.getResult().getText().length() == 0) {

                    if (e.getActionCommand() == "0") {
                        display.getResult().replaceSelection(e.getActionCommand() + ".");
                    }
                    else if (e.getActionCommand() == "."){
                        display.getResult().replaceSelection("0.");
                    }
                    else display.getResult().replaceSelection(e.getActionCommand());
                }
                else if  (e.getActionCommand() == ".") {
                    if (display.getResult().getText().contains(".")) {
                        display.getResult().getText().replace(".", "");
                    }
                    else display.getResult().replaceSelection(e.getActionCommand());
                }
                else display.getResult().replaceSelection(e.getActionCommand());

                display.isNewExpression = false;
            }
        };

        Action mathAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (display.getResult().getText().length() == 0) display.getExpression(). replaceSelection("");

                else display.getExpression().replaceSelection(display.getResult().getText().toString()+e.getActionCommand());
                display.getResult().setText("");
            }
        };

        Action deleteAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                display.getResult().setText(""+display.getResult().getText().substring(0, display.getResult().getText().length()-1));
            }

        };

        Action clearResult = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.getResult().setText("");
            }
        };

        Action resultAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getExpression().getText().length() == 0) display.getExpression().setText("");
                else
                    display.getExpression().replaceSelection(display.getResult().getText().toString());
                String str = display.getExpression().getText().toString();

                MathExpression mathExpression = stringToMath.StringToMathExpression(str);
                Double res = mathOperation.Operation(mathExpression.numbers, mathExpression.mathSymbols);


                display.getResult().setText(math.formatDouble(res));
                display.getHistory().replaceSelection(display.getExpression().getText().toString() + "=" + display.getResult().getText().toString() + "\n");
                display.getExpression().setText("");
                display.isNewExpression = true;
            }
        };

        Action plusMinusAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getResult().getText().contains("-")) {
                    display.getResult().setText(display.getResult().getText().replace("-", ""));

                }
                else display.getResult().setText("-"+display.getResult().getText().toString());
            }
        };


        Action clearAll = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.getResult().setText("");
                display.getExpression().setText("");
                display.getHistory().setText(null);
            }
        };








        numbersPanel.add(button.getBtnClearAll());
        button.getBtnClearAll().addActionListener(clearAll);

        numbersPanel.add(button.getBtnClear());
        button.getBtnClear().addActionListener(clearResult);


        numbersPanel.add(button.getBtnDel());
        button.getBtnDel().addActionListener(deleteAction);
        button.getBtnDel().getActionMap().put("Delete", deleteAction);
        button.getBtnDel().getActionMap().put("Backspace", deleteAction);

        numbersPanel.add(button.getBtnDivide());
        button.getBtnDivide().addActionListener(mathAction);
        button.getBtnDivide().getActionMap().put("Divide", mathAction);

        numbersPanel.add(button.getBtn7());
        button.getBtn7().addActionListener(numberAction);
        button.getBtn7().getActionMap().put(button.getBtn7().getText().toString(), numberAction);

        numbersPanel.add(button.getBtn8());
        button.getBtn8().addActionListener(numberAction);
        button.getBtn8().getActionMap().put(button.getBtn8().getText().toString(), numberAction);

        numbersPanel.add(button.getBtn9());
        button.getBtn9().addActionListener(numberAction);
        button.getBtn9().getActionMap().put(button.getBtn9().getText().toString(), numberAction);

        numbersPanel.add(button.getBtnMultiply());
        button.getBtnMultiply().addActionListener(mathAction);
        button.getBtnMultiply().getActionMap().put("Multiply", mathAction);

        numbersPanel.add(button.getBtn4());
        button.getBtn4().addActionListener(numberAction);
        button.getBtn4().getActionMap().put(button.getBtn4().getText().toString(), numberAction);

        numbersPanel.add(button.getBtn5());
        button.getBtn5().addActionListener(numberAction);
        button.getBtn5().getActionMap().put(button.getBtn5().getText().toString(), numberAction);

        numbersPanel.add(button.getBtn6());
        button.getBtn6().addActionListener(numberAction);
        button.getBtn6().getActionMap().put(button.getBtn6().getText().toString(), numberAction);

        numbersPanel.add(button.getBtnSubtract());
        button.getBtnSubtract().addActionListener(mathAction);
        button.getBtnSubtract().getActionMap().put("Minus", mathAction);

        numbersPanel.add(button.getBtn1());
        button.getBtn1().addActionListener(numberAction);
        button.getBtn1().getActionMap().put(button.getBtn1().getText().toString(), numberAction);

        numbersPanel.add(button.getBtn2());
        button.getBtn2().addActionListener(numberAction);
        button.getBtn2().getActionMap().put(button.getBtn2().getText().toString(), numberAction);

        numbersPanel.add(button.getBtn3());
        button.getBtn3().addActionListener(numberAction);
        button.getBtn3().getActionMap().put(button.getBtn3().getText().toString(), numberAction);

        numbersPanel.add(button.getBtnAdd());
        button.getBtnAdd().addActionListener(mathAction);
        button.getBtnAdd().getActionMap().put("Plus", mathAction);

        numbersPanel.add(button.getBtnMinus()); //+/-
        button.getBtnMinus().addActionListener(plusMinusAction);

        numbersPanel.add(button.getBtn0());
        button.getBtn0().addActionListener(numberAction);
        button.getBtn0().getActionMap().put(button.getBtn0().getText().toString(), numberAction);

        numbersPanel.add(button.getBtnDot());
        button.getBtnDot().addActionListener(numberAction);
        button.getBtnDot().getActionMap().put(button.getBtnDot().getText().toString(), numberAction);

        numbersPanel.add(button.getBtnEnter());
        button.getBtnEnter().addActionListener(resultAction);
        button.getBtnEnter().getActionMap().put("Enter", resultAction);


















        displayPanel.add(display.getExpression());
        displayPanel.add(display.getResult());

        historyPanel.add(scrollPane);
        historyPanel.setVisible(false);

        mainPanel.add(numbersPanel, BorderLayout.CENTER);
        mainPanel.add(displayPanel, BorderLayout.NORTH);

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(historyPanel, BorderLayout.EAST);















        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);


                int fontSize = frame.getHeight()/9;
                display.getResult().setFont(new Font(Font.SANS_SERIF, Font.BOLD, fontSize));
                display.getExpression().setFont(new Font(Font.SANS_SERIF, Font.ITALIC, fontSize));


                if (frame.getWidth() >= 600){
                    historyPanel.setVisible(true);
                }else historyPanel.setVisible(false);
            }
        });




        frame.getContentPane().setBackground(Color.WHITE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400,400));
    }
}
