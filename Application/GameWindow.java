package Application;

import javax.swing.*;
import java.awt.*;

public class GameWindow {


    private int width = 1024;
    private int height = 768;
    private int posX = 300;
    private int posY = 150;

    private JButton btnStart;
    private jButton btnExit;

    private Map map;


    GameWindow() {
        prepareWindow();
        prepareToolsPanel();
        prepareButtons();
        prepareSettingPanel();

        map = new Map();

        mainToolsPanel.add(settingPanel, BorderLayout.NORTH);

        add(mainToolsPanel, BorderLayout.EAST);

        add(map);
        add(btnStart, BorderLayout.NORTH);
        add(btnExit, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void prepareWindow() {
        setSize(width, height);
        setLocation(posX, posY);
        setTitle("Application");
        SetResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    private void prepareToolsPanel(){
        mainToolsPanel = new JPanel();
        mainToolsPanel.setBackground(Color.ORANGE);
        mainToolsPanel.setLayout(new GridLayout(rows:2, cols:1));
    }
    private void prepareButtons() {
        btnStart = new JButton(text:"Start game");
        btnExit = new jButton(text:"End game");
    }

    private void prepareSettingPanel() {
        settingPanel = new JPanel();
        mainToolsPanel.setBackground(Color.BLUE);
        settingPanel.setLayout(new GridLayout( rows:4, cols:1));
    }

}

