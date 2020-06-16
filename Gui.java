/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

/**
 *
 * @author mert_
 */

import javax.swing.JFrame;

public class Gui {

    public static void main(String[] args) {

        JFrame f = new JFrame("Rock Paper Scissors!");

        f.setSize(480, 150);
        f.setLocationRelativeTo(null); 

        f.add(new Panel());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
