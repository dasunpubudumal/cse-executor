package it.uom.cse;

public enum OperationType {

    ADD("ADD"),
    MULT("MULTIPLY"),
    EXIT("EXIT");

    String opeartionString;

    OperationType(String opeartionString) {
        this.opeartionString = opeartionString;
    }

    public String getOpeartionString() {
        return opeartionString;
    }

    public void setOpeartionString(String opeartionString) {
        this.opeartionString = opeartionString;
    }
}
