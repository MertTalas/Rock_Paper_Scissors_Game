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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener { 

    Game currentGame = new Game();
    JButton r;
    JButton p;
    JButton s;

    JLabel lblPlayerChoice;
    JLabel lblCpuChoice;
    JLabel lblGamesPlayed;

    JLabel gamecounter;
    JLabel playerWinCount;
    JLabel cpuWinCount;

    Panel() {

        lblGamesPlayed = new JLabel("Games Played: ( )");
        lblCpuChoice = new JLabel("");
        lblPlayerChoice = new JLabel("");

        playerWinCount = new JLabel("CPU Wins: ( )");
        cpuWinCount = new JLabel("Player Wins: ( )");

        gamecounter = new JLabel("");
        r = new JButton("Rock");
        p = new JButton("Paper");
        s = new JButton("Scissors");

        add(r);
        add(p);
        add(s);
        add(gamecounter);

        r.addActionListener(this);
        p.addActionListener(this);
        s.addActionListener(this);

        add(lblGamesPlayed);
        add(lblCpuChoice);
        add(lblPlayerChoice);

        add(playerWinCount);
        add(cpuWinCount);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        gamecounter.setText("Games Played: " + currentGame.gamecount);
        playerWinCount.setText("Player Wins: " + currentGame.playerWins);
        cpuWinCount.setText("CPU Wins: " + currentGame.cpuWins);
        if (e.getSource() == r) {
            lblPlayerChoice.setText("Player chose Rock");
            int cpuRoll = currentGame.cpuRoll();
            cpuCheck(cpuRoll);
            lblGamesPlayed.setText(currentGame.playerRoll(1, cpuRoll));

        } else if (e.getSource() == p) {
            lblPlayerChoice.setText("Player chose Paper");
            int cpuRoll = currentGame.cpuRoll();
            cpuCheck(cpuRoll);
            lblGamesPlayed.setText((currentGame.playerRoll(2, cpuRoll)));
        } else if (e.getSource() == s) {
            lblPlayerChoice.setText("Player chose Scissors");
            int cpuRoll = currentGame.cpuRoll();
            cpuCheck(cpuRoll);
            lblGamesPlayed.setText((currentGame.playerRoll(3, cpuRoll)));
        }
    }

    public void cpuCheck(int cpuRoll) {
        if (cpuRoll == 1) {
            lblCpuChoice.setText("CPU chose Rock,");
        }
        if (cpuRoll == 2) {
            lblCpuChoice.setText("CPU chose Paper,");
        }
        if (cpuRoll == 3) {
            lblCpuChoice.setText("CPU chose Scissors,");
        }
    }
}
