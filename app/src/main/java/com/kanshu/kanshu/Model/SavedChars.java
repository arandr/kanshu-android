package com.kanshu.kanshu.model;

/**
 * Created by alouanemed on 06-02-2015.
 */
public class SavedChars {
    //the Chinese character
    private String Char;
    private String Chardescription;
    private int wordID;
    private String translation;
    private String pronunciation;

    public SavedChars(){}

    public String getChar() {
        return Char;
    }

    public void setChar(String aChar) {
        Char = aChar;
    }

    public String getChardescription() {
        return Chardescription;
    }

    public void setChardescription(String chardescription) {
        Chardescription = chardescription;
    }

    public int getWordID (){return wordID;}

    public void setWordID(int id){wordID = id;}

    public String getTranslation(){ return translation; }

    public void setTranslation(String translatedTo){translation = translatedTo;}

    public String getPronunciation(){return pronunciation;}

    public void setPronunciation(String charsPronouncedAs){ pronunciation = charsPronouncedAs;}

}
