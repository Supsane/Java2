package ru.geekbrains.java.lesson4.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by chashurin on 03.03.2017.
 */
public class UserWindow extends JFrame {

    public UserWindow() {
        setTitle("Чат");
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel indentPanel = new JPanel(new GridLayout(1, 1, 5, 0));
        indentPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));

        JPanel mainPanel = new JPanel(new GridLayout(1, 1, 5, 0));
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPane.setResizeWeight(0.8);

        JPanel corPanel = new JPanel(new GridLayout(1, 1, 5, 0));
        corPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        JTextArea corresp = new JTextArea();
        corresp.setLineWrap(true);
        corPanel.add(corresp);
        splitPane.setTopComponent(corPanel);


        JPanel sendPanel = new JPanel(new GridLayout(1,2));
        sendPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        sendPanel.setBackground(Color.LIGHT_GRAY);
        JTextArea message = new JTextArea();
        message.setLineWrap(true);
        sendPanel.add(message);

        JPanel sendButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        sendButton.setBackground(Color.LIGHT_GRAY);
        JPanel sendButton1 = new JPanel(new BorderLayout());
        sendButton1.add(sendButton, BorderLayout.SOUTH);
        JButton send = new JButton("Отправить");
        sendButton.add(send);
        sendPanel.add(sendButton);

        splitPane.setBottomComponent(sendPanel);

        mainPanel.add(splitPane);

        indentPanel.add(mainPanel);

        add(indentPanel);
        setVisible(true);
    }
}
