package COW17;

public class Player
{
    protected String _name;
    protected int _number, _gamesPlayed;

    public Player(String name, int number, int gamesPlayed){
        _name = name;
        _number = number;
        _gamesPlayed = gamesPlayed;
    }
    
    public String toString(){
        return String.format("%s - %d\nGames Played: %d", _name, _number, _gamesPlayed);
    }
    
}
