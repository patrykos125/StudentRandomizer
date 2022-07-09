package com.company;

public class IleLosujemyWiekszeOdilosci extends Exception{
    String message;
    public IleLosujemyWiekszeOdilosci(String message) {
        this.message=message;
    }

    @Override
    public String toString() {
        return "IleLosujemyWiekszeOdilosci{" +
                "message='" + message + '\'' +
                '}';
    }
}

