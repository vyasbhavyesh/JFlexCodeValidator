package com.example.lexer;

import com.example.lexer.controller.UserInputController;
import com.example.lexer.model.LexerModel;
import com.example.lexer.view.UserView;

public class Start {

    public static void main(String[] args) {
        LexerModel lexerModel = new LexerModel();
        UserView userView = new UserView("Lexer Demo");
        UserInputController userInputController = new UserInputController(lexerModel,userView);
        userInputController.initController();
    }
}
