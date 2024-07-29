package COW17.Testers;

import COW17.BasketBallPlayer;
import COW17.FootballPlayer;
import COW17.Player;

public class PlayerTester
{
    public static void main(String[] args){
        System.out.println("Do players work: " + testPlayers());
    }
    
    public static boolean testPlayers(){
        boolean success = true;
        
        Player player1 = new Player("Bob Bobertson", 2, 20);
        Player player2 = new Player("Crissy Crabtree", 4, 40);
        if(!player1.toString().equals("Bob Bobertson - 2\nGames Played: 20") || !player2.toString().equals("Crissy Crabtree - 4\nGames Played: 40")){
            success = false;
            System.out.println("Player is not working");
        }
        
        Player player3 = new BasketBallPlayer("Doug Derp", 6, 100, 2000, 700, 200, 500);
        //System.out.println(player3);
        //System.out.println("Doug Derp - 6\nGames Played: 100\nPoints Scored: 2000\nRebounds: 700\nSteals: 200\nBlocks: 500");
        Player player4 = new BasketBallPlayer("Eilleen Engles", 8, 101, 2400, 900, 100, 800);        
        //System.out.println(player4);
        if(!player3.toString().equals("Doug Derp - 6\nGames Played: 100\nPoints Scored: 2000\nRebounds: 700\nSteals: 200\nBlocks: 500") || !player4.toString().equals("Eilleen Engles - 8\nGames Played: 101\nPoints Scored: 2400\nRebounds: 900\nSteals: 100\nBlocks: 800")){
            success = false;
            System.out.println("BasketBallPlayer is not working");
        }
        
        Player player5 = new FootballPlayer("Frank Beamer", 56, 40, 3, 4, 200);
        System.out.println(player5);
        System.out.println("Frank Beamer - 56\nGames Played: 40Touchdowns: 3\nReceptions: 4\nTackles: 200");
        Player player6 = new FootballPlayer("Yaro Mayewsky", 13, 44, 88, 321, 8);
        System.out.println(player6);
        if(!player5.toString().equals("Frank Beamer - 56\nGames Played: 40\nTouchdowns: 3\nReceptions: 4\nTackles: 200") || !player6.toString().equals("Yaro Mayewsky - 13\nGames Played: 44\nTouchdowns: 88\nReceptions: 321\nTackles: 8")){
            success = false;
            System.out.println("FootballPlayer is not working");
        }
        
        return success;
    }
}
