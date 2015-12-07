/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author j23schoen
 */
public class Day2 {
    
    //Task 1
    public static String wrappingPaperNeeded(){
        int paperRequired = 0;
        int total = 0;
        String file;
        file = "/Users/j23schoen/Documents/Advent\ of\ Code/Day\ 2\ length\ width\ height.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
                                
                                String numbers[] = sCurrentLine.split("x");
                                String length = numbers[0];
                                String width = numbers[1];
                                String height = numbers[2];
                                
                                int l = Integer.parseInt(length);
                                int w = Integer.parseInt(width);
                                int h = Integer.parseInt(height);
                                
                                int extra = Math.min(l*w, w*h);
                                int newExtra = Math.min(extra, h*l);
                                paperRequired = (2 * (l * w)) + (2 * (w * h)) + (2 * (h * l));
                                total = total + paperRequired + newExtra;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
        return "Day2 Task 1: \npaper required: " + total + " feet\n";
    }
    
    //Task 2
    public static String ribbonNeeded(){
        String file = "/Users/j23schoen/Documents/Advent\ of\ Code/Day\ 2\ Ribbon.txt";
        int total = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
                                
                                String numbers[] = sCurrentLine.split("x");
                                String length = numbers[0];
                                String width = numbers[1];
                                String height = numbers[2];
                                
                                int l = Integer.parseInt(length);
                                int w = Integer.parseInt(width);
                                int h = Integer.parseInt(height);
                                
                                List<Integer> dims = Arrays.asList(l, w, h);
                                Collections.sort(dims);
                                int ribbonLength = (2*(dims.get(0) + dims.get(1)));
                                int bowLength = l*w*h;
                                total += ribbonLength + bowLength;
                                
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
        return "Day2 Task 2:\nribbons and bows: " + total + " feet";
    }
}
