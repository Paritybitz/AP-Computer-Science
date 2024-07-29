package COW3;

import java.awt.*;

public class Digit {
    private int _value;
    private Box _topBar;
    private Box _middleBar;
    private Box _bottomBar;
    private Box _upperRightBar;
    private Box _lowerRightBar;
    private Box _upperLeftBar;
    private Box _lowerLeftBar;

    public Digit(int value) {
        _value = value;
    }
    public Digit(int value, Box topBar, Box middleBar, Box bottomBar, Box upperRightBar, Box lowerRightBar, Box upperLeftBar, Box lowerLeftBar) {
        _value = value;
        _topBar = topBar;
        _middleBar = middleBar;
        _bottomBar = bottomBar;
        _upperRightBar = upperRightBar;
        _lowerRightBar = lowerRightBar;
        _upperLeftBar = upperLeftBar;
        _lowerLeftBar = lowerLeftBar;
    }

    public int getValue() {
        return (_value);
    }

    public void increment() {
        _value++;
        if (_value > 9){
            _value = 0;
        }
    }


    public void decrement() {
        _value--;
        if (_value < 0){
            _value = 9;
        }
    }

    public void setValue(int nextValue) {
        _value = nextValue;
    }

    public String toString() {
        return (String.valueOf(this._value));
    }

    public boolean equals(Digit otherDigit) {
        return (this._value == otherDigit.getValue());
    }

    public int compareTo(Digit otherDigit) {
        if (this.getValue() == otherDigit.getValue())
            return (0);
        else if (this.getValue() > otherDigit.getValue())
            return (1);
        else
            return (-1);
    }

    public Box getBar(String whichBar)
    {
        Box theBar;

        if (whichBar == "Top")
            return (_topBar);
        else if (whichBar == "Middle")
            return (_middleBar);
        else if (whichBar == "Bottom")
            return (_bottomBar);
        else if (whichBar == "Upper Right")
            return (_upperRightBar);
        else if (whichBar == "Upper Left")
            return (_upperLeftBar);
        else if (whichBar == "Lower Left")
            return (_lowerRightBar);
        else
            return (_lowerLeftBar);
    }
    public void paint (Graphics g)
    {
        _topBar.paint(g);
        _middleBar.paint(g);
        _bottomBar.paint(g);
        _upperRightBar.paint(g);
        _upperLeftBar.paint(g);
        _lowerRightBar.paint(g);
        _lowerLeftBar.paint(g);
    }

    public void updateDisplay()
    {

    }
}
