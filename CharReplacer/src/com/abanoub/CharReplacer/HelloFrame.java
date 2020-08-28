package com.abanoub.CharReplacer;

import javax.swing.*;
import java.awt.*;

import static com.abanoub.CharReplacer.CharReplace.replace;

class HelloFrame extends JFrame {

    public HelloFrame() {
        super("Character Replacer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        initComponents();

    }
    private void initComponents() {

        JTextField inputText = new JTextField("Input");
        JTextField outputText = new JTextField("Output");
        JButton transform = new JButton("Auto-Replace");
        transform.addActionListener(e -> {
            String str = replace(inputText.getText());
            outputText.setText(str);
        });

        add(inputText);
        add(transform);
        add(outputText);
        setLayout(new GridLayout(1, 3, 10, 0));
    }
}
