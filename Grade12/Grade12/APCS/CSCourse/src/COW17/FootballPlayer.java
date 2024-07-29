package COW17;

public class FootballPlayer extends Player{
    protected int _touchdowns, _receptions, _tackles;

    public FootballPlayer(String name, int number, int gamesPlayed, int touchdowns, int receptions, int tackles){
        //ini parent class
        super(name, number, gamesPlayed);

        _touchdowns = touchdowns;
        _receptions = receptions;
        _tackles = tackles;
    }

    public String toString(){
        return String.format("%s\nTouchdowns: %d\nReceptions: %d\nTackles: %d", super.toString(), _touchdowns, _receptions, _tackles);
    }
}
