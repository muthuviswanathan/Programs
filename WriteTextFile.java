import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) {
		FileOutputStream fOut = null;
		String s = "Testing FOUT";
		try {
			fOut = new FileOutputStream("E:/Java Workspace/Files/sample.txt");
			byte b[] = s.getBytes();
			fOut.write(b);
			System.out.println("File has been written successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fOut.flush();
				fOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}