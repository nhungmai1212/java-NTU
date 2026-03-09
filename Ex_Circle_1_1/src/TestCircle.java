
public class TestCircle {

	public static void main(String[] args) {
			Circle c1 = new Circle();
			System.out.println("Hình tròn có bán kính là "
					+ c1.getRadius() + " và diện tích là " + c1.getArea());

			Circle c2 = new Circle(2.0);
			System.out.println("Hình tròn có bán kính là "
					+ c2.getRadius() + " và diện tích là " + c2.getArea());

			Circle c3 = new Circle(3.0, "blue");
			System.out.println(c3.toString());

			Circle c4 = new Circle();
			c4.setRadius(5.5);
			System.out.println("bán kính là: " + c4.getRadius());
			c4.setColor("xanh lá cây");
			System.out.println("màu là: " + c4.getColor());

			Circle c5 = new Circle(5.5);
			System.out.println(c5.toString());

			Circle c6 = new Circle(6.6);
			System.out.println(c6.toString());
			System.out.println(c6);
			System.out.println("Toán tử + cũng gọi toString(): " + c6);
		
	}
}
