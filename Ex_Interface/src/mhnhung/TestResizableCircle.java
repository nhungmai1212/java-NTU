package mhnhung;

public class TestResizableCircle {

	public static void main(String[] args) {
		ResizableCircle c = new ResizableCircle(10);
        System.out.println("Before resize: " + c.getRadius());
        c.resize(50);
        System.out.println("After resize: " + c.getRadius());

	}

}
