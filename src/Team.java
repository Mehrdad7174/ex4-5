public class Team {

    //create instance variables
    private String school;
    private String sport;
    private String mascot;
    public final static String MOTTO = "Sportsmanship!";

    public Team(){
        //default constructor
    }

    public Team(String aSchool, String aSport, String aMascot){

        school=aSchool;
        sport=aSport;
        mascot=aMascot;

    }//ends our Team constructor
    //ends our constructor method

    //being creating getter/setter methods

    public String getSchool(){return school;}
    public String getSport(){return sport;}
    public String getMascot(){return mascot;}
}//ends the Team class
