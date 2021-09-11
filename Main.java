package com.company;

import javax.swing.*;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()  {

                new Gui().ShowGui();



            }

        });
    }
}