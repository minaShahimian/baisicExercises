package exercises.number17;

public enum  MyColor {
    Black(0,0,0),
    White(1,1,1),
    Red(1,0,0),
    Yellow(0,0,1),
    Blue(0,1,0);

    private float R,Y,B;

    MyColor(float r, float y, float b) {
        R = r;
        Y = y;
        B = b;
    }
}
