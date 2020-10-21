package lession08_1019;

public class File {
	private static int fileCount;

	public static int getFileCount() {
		return fileCount;
	}

	public static void setFileCount(int fileCount) {
		File.fileCount = fileCount;
	}

	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public File(String fileName) {
		super();
		fileCount++;
		this.fileName = fileName;
	}

	public File() {
		super();
		fileCount++;
	}

	public StringBuffer fileGetSuffix(String fileName) {
		StringBuffer result = new StringBuffer();
		result.append(File.fileCount);
		char[] strArray = fileName.toCharArray();
		int findcount = 0;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == '.') {
				findcount = i;
			}
		}
		char[] resultArray = new char[strArray.length - findcount];
		System.arraycopy(strArray, findcount, resultArray, 0, strArray.length - findcount);
		for (char c : resultArray) {
			result.append(c);
		}

		return result;
	}

}
