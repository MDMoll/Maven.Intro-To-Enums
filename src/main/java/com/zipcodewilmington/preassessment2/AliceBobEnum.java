package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE("ALICE"),
    BOB("BOB");
    
    private String name;
    
    AliceBobEnum(String name) {
        this.name = name;
    }
    
    public String getCatchPhrase() {
        return "Hey, my name is " + name + "!";
    }
    
    public boolean isAlice() {
        return this.equals(ALICE);
    }
    
    public boolean isBob() {
        return this.equals(BOB);
    }
}
