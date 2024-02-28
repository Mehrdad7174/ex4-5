import java.util.Scanner;

public class TestTeam {
    public static void main(String[] args){

        Team team1 = setTeamData();
        Team team2 = setTeamData();
        Team team3 = setTeamData();

        display(team1);
        display(team2);
        display(team3);
    }

    public static Team setTeamData(){
        Scanner input = new Scanner(System.in);

        Team temp;
        String name,sport,mascot;
        System.out.println("Enter school name >> ");
        name = input.nextLine();
        System.out.println("Enter sport >> ");
        sport = input.nextLine();
        System.out.println("Enter mascot >> ");
        mascot = input.nextLine();

        temp = new Team(name,sport,mascot);

        return temp;

    }//ends our setTeamData Method

    public static void display(Team temp){

        System.out.println(temp.getSchool()+" "+temp.getSport()+" team "+temp.getMascot()+"\n" +
                "   Our motto is "+temp.MOTTO);

    }
}
