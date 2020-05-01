import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainConnection {

	public static void main(String[] args) {
		String html;
		html = ("C:\\Users\\Zac\\eclipse-workspace\\FirstProject\\src\\index.html");
		try {
			BufferedWriter htmlBw = new BufferedWriter(new FileWriter (html));
			htmlBw.write(html);
			htmlBw.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
