public abstract class Figura {
    private String color;

    public abstract double area();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
