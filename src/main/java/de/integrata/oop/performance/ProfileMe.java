package de.integrata.oop.performance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ProfileMe {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		String file = "C:\\develop\\eclipses\\eclipse-jee-juno-SR1-win32-x86_64\\eclipse\\notice.html";
		// String file = "d:\\Programme\\eclipse\\readme\\readme_eclipse.html";
		int loop = 1000;

		for (int i = 0; i < loop; i++) {
			try {
				ProfileMe.compress1(file);
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
		
		System.out.println(System.currentTimeMillis() - time);
	}

	public static String compress1(String filename) throws IOException {
		StringBuilder s = new StringBuilder();
		Reader reader = new BufferedReader(new FileReader(new File(filename)));
		boolean compressing = false;
		for (int c; (c = reader.read()) != -1;) {
			if (c == ' ' || c == '\n' || c == '\t' || c == '\r')
				if (compressing)
					continue;
				else
					compressing = true;
			else
				compressing = false;
			s.append(c);
		}
		reader.close();
		return s.toString();
	}

}
