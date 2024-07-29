package COW17;

public class MultiValueDice extends Dice
{
    protected int[] _values;;

    public MultiValueDice(int[] values){
        _values = values;
    }

    public int roll(){
        int randomValue =  (int)(Math.random() * _values.length);
        return _values[randomValue];
    }
    
}
