package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

                                           //gestisco le eccezioni IO
	public static void main(String[] args) throws IOException {
		
		//creo l'oggetto FileWriter per creare il file prova.txt
		FileWriter myfile = new FileWriter("prova.txt");
		
		try {
			
			//scrivo sul file
			myfile.write("Questo è il mio primo file in JAVA! \n");
			myfile.write("ciao mondo!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//chiudo il file
			myfile.close();
		}
		
		//creo un oggetto File
		
	 File newfile = new File("./prova.txt");
	 //apro lo scanner
	 Scanner scan = new Scanner(newfile);
	 try {
		// leggo riga per riga
		 while (scan.hasNextLine()) {
		 String data = scan.nextLine();
		 System.out.println(data);
		 } 
		 //gestisco le eccezioni
	 } catch (Exception e){
		 e.printStackTrace();
	 }
	 finally {
		 //chiudo lo scanner
		 scan.close();
		 
	 }
	
	
	}
}
