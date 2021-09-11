package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Display {


    JTextField expression = new JTextField();
    JTextField result = new JTextField("");
    JTextArea history = new JTextArea(0,20);

    JTextField getExpression(){
        expression.setEditable(false);
        expression.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
        return expression;
    }

    JTextField getResult(){
        result.setEditable(false);
        result.setBackground(Color.LIGHT_GRAY);
        result.setOpaque(true);
        result.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
        result.setHorizontalAlignment(SwingConstants.RIGHT);
        return result;
    }

    JTextArea getHistory(){
        history.setEditable(false);
        history.setLineWrap(true);
        history.setMinimumSize(new Dimension(200,350));
        return history;
    }
}
