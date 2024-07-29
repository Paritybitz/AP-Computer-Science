package COW17;

public class Function3 extends Function2
{
    protected double _a;;

    public Function3(double h , double e, double a){
        super(h, e);

        _a = a;
    }

    public int getValueAt (int x){
        return (int) (_a * super.getValueAt(x));
    }
}
