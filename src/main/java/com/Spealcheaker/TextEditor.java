package com.Spealcheaker;

public class TextEditor {
private Spellchecker spellchecker;

public TextEditor(Spellchecker spellchecker){
    System.out.println("insider the speak cheaker");
    this.spellchecker=spellchecker;
}
    public void spellCheck() {
        spellchecker.checkSpelling();
    }
}
