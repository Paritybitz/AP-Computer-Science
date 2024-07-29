package COW17;

public class MultiSidedDice extends Dice
{
    private int _numSides;

    public MultiSidedDice (int numSides){
        _numSides = numSides;
    }

    public int roll(){
        return (int)(Math.random() * _numSides + 1);
    }
    
}
