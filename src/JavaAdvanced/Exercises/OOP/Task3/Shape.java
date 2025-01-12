package JavaAdvanced.Exercises.OOP.Task3;

public class Shape {
    private String color;
    private boolean isFilled;

    public Shape(String color, boolean isFilled) {
        this.color=color;
        this.isFilled=isFilled;
    }

    public Shape(){
        this.color="unknown";
        this.isFilled=false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        String s =  "Shape with color of "+color+" ";
        if (isFilled){
            s += "and filled";
        }
        else {
            s += "not filled";
        }
        return s;
    }

}
