import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top 10 Players Based on Goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 Players Based on Penalty Amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(10);
        
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        NHLStatistics.teamStatistics("PHI");
        
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
