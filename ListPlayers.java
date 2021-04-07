
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Players implements Comparable<Players> {
    String name;
    int jerseyNumber;
    double battingAvg;
    public Players(String name,int jerseyNumber,Double battingAvg){
        this.name=name;
        this.battingAvg=battingAvg;
        this.jerseyNumber=jerseyNumber;
    }

    public int compareTo(Players o) {
        return Double.compare(o.battingAvg,battingAvg);
    }
}
class ListPlayers{
    public static void main(String[] args) {
      Players aronFinch=new Players("Aron Finch",5,41.8);
      Players davidWarner=new Players("David Warner",31,45.4);
      Players marnusLabu=new Players("Marnus Labuschagne",33,39.4);
        Players steveSmith=new Players("Steve Smith",49,43.3);
        Players glennMaxwell=new Players("Glenn Maxwel",32,34.4);
        Players alexCarry=new Players("Alex Carry",4,36.4);
        Players marcusStoins=new Players("Marcus Stoinis",17,31.6);
        Players patCummins=new Players("Pat Cummins",30,9.8);
        Players mithcellStarc=new Players("Mitchell Starc",56,12.2);
        Players adamZampa=new Players("Adam Zampa",88,6.4);
        Players joshHazelwood=new Players("Josh HazelWood",38,17.7);
        Players mitchellMarsh=new Players("Mitchell Marsh",8,34.4);
        Players kaneRichardson=new Players("Kane Richardson",55,15.0);
        Players astonAgar=new Players("Aston Agar",46,21.7);
        Players nathanLyon=new Players("Nathan Lyon",67,19.2);
        List<Players> squad=new ArrayList();
        squad.add(adamZampa);
        squad.add(aronFinch);
        squad.add(alexCarry);
        squad.add(davidWarner);
        squad.add(marcusStoins);
        squad.add(marnusLabu);
        squad.add(mitchellMarsh);
        squad.add(mithcellStarc);
        squad.add(glennMaxwell);
        squad.add(patCummins);
        squad.add(steveSmith);
        squad.add(astonAgar);
        squad.add(kaneRichardson);
        squad.add(nathanLyon);
        squad.add(joshHazelwood);
        Collections.sort(squad);
        System.out.println("** Squad By Batting Average **\n");
        for(Players obj:squad){
            System.out.println("Name: "+obj.name+" | Jersey Number: "+obj.jerseyNumber+" | Batting Avg: "+obj.battingAvg);
        }
        System.out.println();
        for (int i=(squad.size())-1;i>=11;i--){
            squad.remove(i);
        }
        System.out.println("** Playing 11 **\n");
        for(Players obj:squad){
            System.out.println("Name: "+obj.name+" | Jersey Number: "+obj.jerseyNumber+" | Batting Avg: "+obj.battingAvg);
        }
        System.out.println();
        Collections.sort(squad, new Comparator<Players>() {
            @Override
            public int compare(Players o1, Players o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println("** Playing 11 By Name **\n");
        for(Players obj:squad){
            System.out.println("Name: "+obj.name+" | Jersey Number: "+obj.jerseyNumber+" | Batting Avg: "+obj.battingAvg);
        }
    }
}