package chapter9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WorkingWithFiles {

	public static void main(String[] args) {
		char[] alphabetUpper = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
				'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		// writer
		System.out.println();
		
		try {
			// FileWriter writer = new FileWriter("alphabetUpper.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter("alphabetUpper.txt"));
			writer.write(alphabetUpper);
			writer.close();
			
			System.out.println("alphabetUpper has been written to alphabetUpper.txt!");
		} catch (IOException exw) {
			System.out.println(exw.toString());
		}

		// reader
		System.out.println();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("data/astronauts.csv"));
			String astronautLine = reader.readLine();

			int counter = 0;
			// final int counterMax = 6;
			
			// while (astronautLine != null && counter < counterMax) {
			while (astronautLine != null) {
				//String[] astronautColumns = astronautLine.split(",");
				String[] astronautColumns = astronautLine.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
				
				String name = astronautColumns[0];
				String dateOfBirth = astronautColumns[4];
				String birthplace = astronautColumns[5];
				String spaceflightHours = astronautColumns[9];
				StringBuilder missions = new StringBuilder();
				
				try {
					missions.append(astronautColumns[12]);
				} catch (ArrayIndexOutOfBoundsException ex) {
					// No missions for this astronaut!
					missions.append("");
				}
					
				if (missions.toString().contains("Apollo 13")) {
					System.out.printf("%s - %s - %s - %s\n", name, dateOfBirth, birthplace, spaceflightHours);
				} 

				// read next line
				astronautLine = reader.readLine();
				counter++;
			}
			
			reader.close();
		} catch (IOException exr) {
			System.out.println(exr.toString());
		}

	}

}
