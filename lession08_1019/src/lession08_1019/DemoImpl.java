package lession08_1019;

public class DemoImpl {

	public static void main(String[] args) {
		new Demo() {

			@Override
			public void syso(int a, Demo d) {
				System.out.println(a + "  a " + d.hashCode());
			}
		}.syso(1, new Demo() {

			@Override
			public void syso(int a, Demo d) {
				System.out.println(a + "  b " + d.getClass());

			}
		});
	}
}
