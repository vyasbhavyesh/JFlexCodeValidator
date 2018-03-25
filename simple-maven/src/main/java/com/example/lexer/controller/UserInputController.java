package com.example.lexer.controller;

import com.example.lexer.model.LexerModel;
import com.example.lexer.view.UserView;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class UserInputController {

    private LexerModel lexerModel;
    private UserView userView;

    public UserInputController(LexerModel lexerModel,UserView userView){
        this.lexerModel = lexerModel;
        this.userView = userView;
    }

    public void initController(){
        userView.getButtonImportFile().addActionListener(e -> buttonImportFileActionPerformed());
        userView.getRadioButtonShowingErrors().addActionListener(e -> radioButtonShowingErrorsActionPerformed());
        userView.getRadioButtonCorrectingFile().addActionListener(e -> radioButtonCorrectingFileActionPerformed());
        userView.getButtonSubmit().addActionListener(e -> buttonSubmitActionPerformed());
    }

    private void buttonImportFileActionPerformed(){
        JFileChooser  jFileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnVal = jFileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            lexerModel.setFileName(file.getAbsolutePath());
            userView.getTextFieldFileName().setText(lexerModel.getFileName());
        }
    }

    private void radioButtonShowingErrorsActionPerformed(){
        if(lexerModel.getAction() != null){
            lexerModel.getAction().setActionNumber(0);
        }else {
            LexerModel.Action action = LexerModel.Action.SHOW;
            lexerModel.setAction(action);
        }
    }

    private void radioButtonCorrectingFileActionPerformed() {
        if (lexerModel.getAction() != null) {
            lexerModel.getAction().setActionNumber(1);
        } else {
            LexerModel.Action action = LexerModel.Action.CORRECT;
            lexerModel.setAction(action);
        }
    }

    private void buttonSubmitActionPerformed(){
        if(lexerModel.getFileName().length() == 0 || lexerModel.getAction() == null){
            JOptionPane.showMessageDialog(null, "File name or action is empty.", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Thank you", "Warning", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}
