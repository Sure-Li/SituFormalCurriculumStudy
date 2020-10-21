package lession08_1019;

import java.util.UUID;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("a.java");
		System.out.println(file.fileGetSuffix(file.getFileName()));
		File file1 = new File("b.java");		
		System.out.println(file1.fileGetSuffix(file1.getFileName()));
		for (int i = 0; i < 10; i++) {
			System.out.println(UUID.randomUUID());
		}
	}

}
