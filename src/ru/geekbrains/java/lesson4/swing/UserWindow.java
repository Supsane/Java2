package ru.geekbrains.java.lesson4.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        splitPane.setResizeWeight(1);

        JScrollPane scrollBar = new JScrollPane();
        JPanel corPanel = new JPanel(new GridLayout(1, 1, 5, 0));
        corPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        JTextArea corresp = new JTextArea();
        corresp.setLineWrap(true);
        corresp.setWrapStyleWord(true);
        corresp.setEditable(false);
        corPanel.add(corresp);
        corPanel.add(scrollBar);
        splitPane.setTopComponent(corresp);


        JPanel sendPanel = new JPanel(new FlowLayout());
        sendPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
        sendPanel.setBackground(Color.LIGHT_GRAY);
        JTextArea message = new JTextArea();
        message.setLineWrap(true);
        message.setWrapStyleWord(true);
        message.setSize(440, 1);
        sendPanel.add(message);

        JPanel sendButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        sendButton.setBackground(Color.LIGHT_GRAY);
        JPanel sendButton1 = new JPanel(new BorderLayout());
        sendButton1.add(sendButton, BorderLayout.CENTER);
        JButton send = new JButton("Отправить");
        sendButton.add(send);
        sendPanel.add(sendButton);

        splitPane.setBottomComponent(sendPanel);

        mainPanel.add(splitPane);

        indentPanel.add(mainPanel);

        add(indentPanel);
        setVisible(true);


        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!message.getText().equals("")) corresp.setText(corresp.getText() + "\n" + message.getText());
                message.setText("");
                message.grabFocus();
            }
        });
    }
}
