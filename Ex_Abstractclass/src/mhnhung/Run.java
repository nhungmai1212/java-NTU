package mhnhung;

public class Run {

	public static void main(String[] args) {
		Cat c = new Cat("MiMi");
        Dog d1 = new Dog("Dog1");
        Dog d2 = new Dog("Dog2");
        BigDog bd1 = new BigDog("BigDog1");
        BigDog bd2 = new BigDog("BigDog2");
        System.out.println("Loi chao cua cac con vat: ");
        c.greets();
        d1.greets();
        d1.greets(d2);
        bd1.greets();
        bd1.greets(d1);
        bd1.greets(bd2);

	}

}
