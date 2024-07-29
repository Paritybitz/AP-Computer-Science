package COW17;

public class BasketBallPlayer extends Player{
    protected int _pointsScored, _rebounds, _steals, _blocks;

    public BasketBallPlayer (String name, int number, int gamesPlayed, int pointsScored, int rebounds, int steals, int blocks){
        //ini parent class
        super(name, number, gamesPlayed);

        _pointsScored = pointsScored;
        _rebounds = rebounds;
        _steals = steals;
        _blocks = blocks;
    }

    public String toString(){
        return String.format("%s\nPoints Scored: %d\nRebounds: %d\nSteals: %d\nBlocks: %d", super.toString(), _pointsScored, _rebounds, _steals, _blocks);
    }
}
