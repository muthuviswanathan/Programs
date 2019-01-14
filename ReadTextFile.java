import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) {
		FileInputStream fInputStream = null;
		try {
			fInputStream = new FileInputStream("E:/Java Workspace/Files/abc.txt");
			try {
				int i = 0;
				while ((i = fInputStream.read()) != -1) {
					System.out.print((char) i);
				}
			} catch (IOException e) {
				e.getMessage();
			}
		} catch (FileNotFoundException e) {
			e.getMessage();
		} finally {
			try {
				fInputStream.close();
			} catch (IOException e) {
				e.getMessage();
			}
		}
	}

}
