package COW17;

public class Function2 extends Function1
{
    protected double _e;;

    public Function2(double h , double e){
        super(h);

        _e = e;
    }

    public int getValueAt (int x){
        return (int) (Math.pow(super.getValueAt(x), _e));
    }
    
}
