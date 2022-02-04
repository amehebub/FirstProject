package Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day2 d = new Day2();
		d.RR();
		
	}
		
	public void RR() {	
		try {
			
		FileReader fr = new FileReader("C:\\Users\\SHARMI\\Desktop\\New folder\\asad.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());	
		br.close();
		}catch(IOException e){
			System.out.println("Excepetion happend");
		}
		}

	}


