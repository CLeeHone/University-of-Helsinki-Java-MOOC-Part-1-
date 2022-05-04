import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class SportStatistics {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        
        System.out.println("Team:");
        String teamName = scan.nextLine();
        
        int counter = 0;
        int homeWins = 0;
        int homeLosses = 0;
        int visitingWins = 0;
        int visitingLosses = 0;
        int totalWins = 0;
        int totalLosses = 0;
        
        while (true) {
            try (Scanner fileScanner = new Scanner (Paths.get(fileName))) {
                while (fileScanner.hasNextLine()) {
                    String wholeLine = fileScanner.nextLine();
                    String[] segment = wholeLine.split(",");
                    String homeTeam = segment[0];
                    String visitingTeam = segment[1];
                    int homePoints = Integer.valueOf(segment[2]);
                    int visitingPoints = Integer.valueOf(segment[3]);
                    
                    if(teamName.equals(homeTeam)) {
                        counter++;
                    }
                    if(teamName.equals(visitingTeam)) {
                        counter++;
                    }
                    if(teamName.equals(homeTeam) && homePoints > visitingPoints) {
                        homeWins++;
                    } 
                    if(teamName.equals(visitingTeam) && homePoints < visitingPoints) {
                        visitingWins++;
                    }
                    if(teamName.equals(visitingTeam) && homePoints > visitingPoints) {
                        visitingLosses++;
                    }
                    if(teamName.equals(homeTeam) && homePoints < visitingPoints) {
                        homeLosses++;
                    }
                    totalWins = homeWins + visitingWins;
                    totalLosses = homeLosses + visitingLosses;
                }
                System.out.println("Games: " + counter);
                System.out.println("Wins: " + totalWins);
                System.out.println("Losses: " + totalLosses);
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}