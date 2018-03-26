package com.example.lexer.controller;

import com.example.lexer.model.LexerModel;
import com.example.lexer.view.UserView;
import com.jflex.lexer.Yylex;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

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
            String[] argv = new String[1];
            argv[0] = lexerModel.getFileName();

            // Create a stream to hold the output
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            // IMPORTANT: Save the old System.out!
            PrintStream old = System.out;
            // Tell Java to use your special stream
            System.setOut(ps);
            // Print some output: goes to your special stream
           // System.out.println("Foofoofoo!");
            Yylex.main(argv);
            // Put things back
            System.out.flush();
            System.setOut(old);
            // Show what happened
            //System.out.println("Here: " + baos.toString());

            lexerModel.setConsoleData(baos.toString());
            userView.getTextAreaConsole().setText(lexerModel.getConsoleData());

            JOptionPane.showMessageDialog(null, "Thank you", "Well done", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
