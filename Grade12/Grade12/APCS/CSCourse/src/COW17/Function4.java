package COW17;

public class Function4 extends Function3
{
    private double _k;;

    public Function4(double h , double e, double a, double k){
        super(h, e, a);

        _k = k;
    }

    public int getValueAt (int x) {
        return (int) (super.getValueAt(x) + _k);
    }
}
