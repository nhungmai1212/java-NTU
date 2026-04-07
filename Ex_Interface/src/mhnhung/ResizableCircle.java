package mhnhung;

public class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(double radius) {
        super(radius);
    }
    @Override
    public void resize(int percent) {
        double newRadius = getRadius() * percent / 100.0;
        setRadius(newRadius);
    }
}
