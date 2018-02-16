package net.codejava.excel;
 
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Differentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String agency;
		String reason;
		String patient;
		String town;
		String input;
		String date;
		int difAmount;
		
	
		JOptionPane.showMessageDialog(null, "Hey, I need some information to write this"
				+ " differential.");
		
		name = JOptionPane.showInputDialog(null,"First, I need your name.");
		agency = JOptionPane.showInputDialog(null, "Now I need the agency you worked for.");
		date = JOptionPane.showInputDialog("I need the date here please.");
		JOptionPane.showMessageDialog(null, "Alright, now I see you are requesting a differential.");
		
		
		patient = JOptionPane.showInputDialog(null,"What is the name of the patient?");
		town = JOptionPane.showInputDialog(null,"What town do they live in?");
		reason = JOptionPane.showInputDialog(null,"What is the reason for the differential?");	
		input = JOptionPane.showInputDialog("And the amount of differential you would like.");
		difAmount = Integer.parseInt(input);
		
		JOptionPane.showMessageDialog(null, "Thanks for the information. Here's what you provided.");
		
		System.out.println("Name: " + name + "\nAgency: " + agency + "\nDate: " + date + "\nPatient: "
		              + patient + "\nTown: " + town + "\nReason: " + reason+ "\nDifAmount: " + difAmount);
	}

}
