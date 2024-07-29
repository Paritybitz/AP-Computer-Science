package COW17;

public class Function1
{
    protected double _h;

    public Function1(double h){
        _h = h;
    }
    
    public int getValueAt (int x){
        return (int)(x - _h);
    }
    
}
