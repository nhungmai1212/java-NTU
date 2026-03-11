
public class TestMain {

	public static void main(String[] args) {
		InvoiceItem inv1 = new InvoiceItem("A101", "But do", 888, 0.08);
        System.out.println(inv1);

        inv1.setQty(999);
        inv1.setUnitPrice(0.99);

        System.out.println(inv1);

        System.out.println("id la: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("So luong la: " + inv1.getQty());
        System.out.println("Gia don vi la: " + inv1.getUnitPrice());

        System.out.println("Tong cong la: " + inv1.getTotal());
    	}

}
