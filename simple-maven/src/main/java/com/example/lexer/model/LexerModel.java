package com.example.lexer.model;

public class LexerModel {

    private String fileName = "";

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private String consoleData;

    public String getConsoleData() {
        return consoleData;
    }

    public void setConsoleData(String consoleData) {
        this.consoleData = consoleData;
    }

    public enum Action {
        SHOW(1),CORRECT(2);

        private int actionNumber;

        private Action(int actionNumber){
            this.actionNumber = actionNumber;
        }

        public int getActionNumber() {
            return actionNumber;
        }

        public void setActionNumber(int actionNumber) {
            this.actionNumber = actionNumber;
        }
    }

    private Action action;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action){
        this.action = action;
    }

}
