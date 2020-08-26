package com.abanoub.CharReplacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.abanoub.CharReplacer.charReplace.replace;

class HelloFrame extends JFrame {

    public HelloFrame() {
        super("My First Swing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 100);
        setVisible(true);
        setLocationRelativeTo(null);
        initComponents();

    }
    private void initComponents() {

        JTextField inputText = new JTextField("Input");
        JTextField outputText = new JTextField("Output");
        JButton transform = new JButton("Auto-Replace");
        transform.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = replace(inputText.getText());
                outputText.setText(str);
            }
        });

        add(inputText);
        add(transform);
        add(outputText);
        setLayout(new GridLayout(1, 3, 10, 0));
    }

    


}
