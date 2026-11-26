//  Creazione oggetto Apple, oggetto di interesse.
//  Attraverso classe speciale Enum Colour, stabilire il parametro dell'oggetto colour

public class Apple {


    private Color color;
    private int weight;


    public Apple (Color color, int weight){

        this.color = color;
        this.weight = weight;

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
