package com.example.lexer.view;

import javax.swing.*;

public class UserView {

    private JFrame frame;
    private JPanel panelInput;
    private JTextField  textFieldFileName;
    private JButton buttonImportFile;
    private JLabel labelOption;
    private ButtonGroup buttonGroupAction;
    private JRadioButton radioButtonShowingErrors;
    private JRadioButton radioButtonCorrectingFile;
    private JButton buttonSubmit;
    private JLabel labelConsole;
    private JScrollPane scrollPane;
    private JTextArea textAreaConsole;

    public UserView(String title){

        frame = new JFrame(title);
        panelInput = new JPanel();

        textFieldFileName = new JTextField();
        buttonImportFile = new JButton();
        labelOption = new JLabel();
        buttonGroupAction = new ButtonGroup();
        radioButtonShowingErrors = new JRadioButton();
        radioButtonCorrectingFile = new JRadioButton();
        buttonSubmit = new JButton();
        labelConsole = new JLabel();
        scrollPane = new JScrollPane();
        textAreaConsole = new JTextArea();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        buttonImportFile.setText("Browse");

        buttonGroupAction.add(radioButtonShowingErrors);
        radioButtonShowingErrors.setText("Showing errors");
        radioButtonShowingErrors.setActionCommand("Show");

        buttonGroupAction.add(radioButtonCorrectingFile);
        radioButtonCorrectingFile.setText("Correcting File");
        radioButtonCorrectingFile.setActionCommand("Correct");

        labelOption.setText("Select any one action:");

        buttonSubmit.setText("Submit");

        textAreaConsole.setColumns(20);
        textAreaConsole.setRows(5);
        scrollPane.setViewportView(textAreaConsole);

        labelConsole.setText("Console");

        GroupLayout jPanel1Layout = new GroupLayout(panelInput);
        panelInput.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(217, 217, 217)
                                                        .addComponent(buttonSubmit))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(102, 102, 102)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(textFieldFileName, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(buttonImportFile))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(labelOption, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(55, 55, 55)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(radioButtonShowingErrors)
                                                                                .addComponent(radioButtonCorrectingFile)))
                                                                .addComponent(labelConsole))))
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textFieldFileName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonImportFile))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelOption)
                                        .addComponent(radioButtonShowingErrors))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonCorrectingFile)
                                .addGap(26, 26, 26)
                                .addComponent(buttonSubmit)
                                .addGap(66, 66, 66)
                                .addComponent(labelConsole)
                                .addGap(18, 18, 18)
                                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                .addGap(29, 29, 29))
        );

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panelInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelInput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frame.pack();
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getpanelInput() {
        return panelInput;
    }

    public void setpanelInput(JPanel panelInput) {
        this.panelInput = panelInput;
    }

    public JTextField getTextFieldFileName() {
        return textFieldFileName;
    }

    public void setTextFieldFileName(JTextField textFieldFileName) {
        this.textFieldFileName = textFieldFileName;
    }

    public JButton getButtonImportFile() {
        return buttonImportFile;
    }

    public void setButtonImportFile(JButton buttonImportFile) {
        this.buttonImportFile = buttonImportFile;
    }

    public JLabel getLabelOption() {
        return labelOption;
    }

    public void setLabelOption(JLabel labelOption) {
        this.labelOption = labelOption;
    }

    public ButtonGroup getButtonGroupAction() {
        return buttonGroupAction;
    }

    public void setButtonGroupAction(ButtonGroup buttonGroupAction) {
        this.buttonGroupAction = buttonGroupAction;
    }

    public JRadioButton getRadioButtonShowingErrors() {
        return radioButtonShowingErrors;
    }

    public void setRadioButtonShowingErrors(JRadioButton radioButtonShowingErrors) {
        this.radioButtonShowingErrors = radioButtonShowingErrors;
    }

    public JRadioButton getRadioButtonCorrectingFile() {
        return radioButtonCorrectingFile;
    }

    public void setRadioButtonCorrectingFile(JRadioButton radioButtonCorrectingFile) {
        this.radioButtonCorrectingFile = radioButtonCorrectingFile;
    }

    public JButton getButtonSubmit() {
        return buttonSubmit;
    }

    public void setButtonSubmit(JButton buttonSubmit) {
        this.buttonSubmit = buttonSubmit;
    }

    public JLabel getLabelConsole() {
        return labelConsole;
    }

    public void setLabelConsole(JLabel labelConsole) {
        this.labelConsole = labelConsole;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JTextArea getTextAreaConsole() {
        return textAreaConsole;
    }

    public void setTextAreaConsole(JTextArea textAreaConsole) {
        this.textAreaConsole = textAreaConsole;
    }
}

