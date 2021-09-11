package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Display {


    JTextField expression = new JTextField();
    JTextField result = new JTextField("");
    JTextArea history = new JTextArea(0,20);
    Boolean isNewExpression = false;
    JTextField getExpression(){
        expression.setEditable(false);

        return expression;
    }

    JTextField getResult(){
        result.setEditable(false);
        result.setBackground(Color.LIGHT_GRAY);
        result.setOpaque(true);

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
