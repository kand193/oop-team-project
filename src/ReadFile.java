import java.io.*;

public class ReadFile {
	public static StringBuffer read(String fileName) {
		StringBuffer buffer = new StringBuffer();
		try(FileInputStream file = new FileInputStream(fileName)) {
			int b;
			while((b = file.read()) != -1) {
				buffer.append((char)b);
			}
			
			if (file != null) {
				file.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Oops : FileNotFoundException");
		} catch (IOException e) {
			System.out.println("Input error");
		}
		return buffer;
	}
}
