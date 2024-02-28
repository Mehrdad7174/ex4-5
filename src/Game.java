public class Game {
    private Team team1;
    private Team team2;
    private String time;

    //create our constructors
    public Game(){

    }//ends our empty constructor

    public Game(Team t1, Team t2, String time){
        team1=t1;
        team2=t2;
        this.time=time;
    }

    //begin create our methods to get/set
    public Team getTeam1(){
        return team1;
    }
    public Team getTeam2(){
        return team2;
    }
    public String getTime(){
        return time;
    }
}//ends Game class
