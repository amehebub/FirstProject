package Demo;
import java.io.FileWriter;
import java.io.IOException;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter fr = new FileWriter("C:\\Users\\SHARMI\\Desktop\\New folder\\asad.txt");
		fr.write("First time writing");
		System.out.println("Writing successful");
		fr.close();

	}catch(IOException e) {
		System.out.println("Exception happened");
		e.printStackTrace();
	}
		

}
}