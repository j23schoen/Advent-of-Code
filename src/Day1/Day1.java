/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * full description and challenges can be found at http://adventofcode.com/
 */
package Day1;

import Day2.Day2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author j23schoen
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
          
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("floor:" + countFloors());
        System.out.println(Day2.wrappingPaperNeeded());
        System.out.println(Day2.ribbonNeeded());
    }
    
    //this first method was task 1 for day 1 of advent of code. a '(' parenthesis meant go up one floor.
    //a ')' meant go down one floor. Given the input, figure out which floor Santa ends up on.
    public static int countFloors(){
        String input = "((((()(()(((((((()))(((()((((()())(())()(((()((((((()((("
                + ")(()(((()(()((())))()((()()())))))))))()((((((())((()))(((((("
                + ")(((((((((()()))((()(())()((())((()(()))((()))()))()(((((()((("
                + "()()))()())((()((((())()())()((((())()(()(()(((()(())(()(())(("
                + "(((((())()()(((())(()(()(()(())))(()((((())((()))(((()(()()((("
                + "((()()(()(((()(((((())()))()((()(()))()((()((((())((((())(()(("
                + "(())()()(()()()()()(())((((())((())(()()))()((((())))((((()())"
                + "()((((())((()())((())(())(((((()((((()(((()((((())(()(((()()))"
                + "()))((((((()((())()())))(((()(()))(()()(()(((()(()))((()()()()"
                + ")((()()()(((())())()())())())((()))(()(()))(((((()(()(())((()("
                + "())(())()((((()())()))((((())(())((())())((((()(((())(())((()("
                + ")((((()((((((()(())()()(()(()()((((()))(())()())()))(())))(())"
                + "))())()()(())(()))()((()(()(())()()))(()())))))(()))(()()))(()"
                + ")(((((()(()(()()((())()())))))((())())((())(()(())((()))(())(("
                + "(()((((((((()()()(()))()()(((()))()((()()(())(())())()(()(()))"
                + ")(((((()(())(())(()))))())()))(()))()(()(((((((()((((())))())("
                + "))())())()((((((((((((((()()((((((()()()())())()())())())(())("
                + "())))())((()())((()(()))))))()))))))))))))))))())((())((())()("
                + ")))))))(((()((()(()()))((())(()()))()()())))(())))))))(()(((())"
                + "))())()())))()()(())()))()(()))())((()()))))(()))))()))(()()(()"
                + ")))))))()(((()))))()(()))(())())))))()))((()))((()))())(()))))))"
                + ")))((((())()))()))()))())(())()()(())))())))(()())()))((()()(())"
                + "))(())((((((()(())((()(((()(()()(())))()))))))()))()(()((()))()("
                + "()))(()(((())((((())())(())(()))))))))())))))))())())))))())))))"
                + "()()(((())()(()))))))))())))))(())()()()))()))()))(()(())()()())"
                + "())))))))())()(()(()))))()()()))))())(()))))()()))))()())))))(((("
                + "))()()))(()))))))))))()()))))()()()))))(()())())()()())()(()))))"
                + "()(()))(())))))))(((((())(())())()()))()()))(())))))()(()))))(()"
                + ")(()()))()())()))()))()))()))))())()()))())())))(()))(()))))))()"
                + ")()(((())()))))))))()))()())))())))())))()))))))))))()()))(()())"
                + ")))))(())()(()))))())(()))))(()))))(()())))))())())()()))))())())"
                + ")))))))(()))))()))))))()(()())))))))()))())))())))())))())))))))("
                + "))(()()))))))(()())())))()())()))))))))))))))())))()(())))()))())"
                + "()()(())(()()))(())))())()())(()(()(()))))())))))))))))())(()))()"
                + "))()))))(())()())()())))))))))))()()))))))))))))())())))))(()())))))))))))())(())))()))))))))())())(()))()))(())))()))()()(())()))))))()((((())()))())())))))()))()))))((()())()))))())))(())))))))))))))))))()))))()()())()))()()))))())()))((()())))())))(()))(()())))))))()))()))))(())))))))(())))))())()()(()))())()))()()))))())()()))))())()))())))))))(()))))()())()))))))))(()))())))(()))()))))(())()))())())(())())())))))))((((())))))()))()))()())()(())))()))()))()())(()())()()(()())()))))())())))))(()))()))))())(()()(())))))(())()()((())())))))(())(())))))))())))))))))()(())))))))()())())())()(()))))))))(()))))))))())()()))()(()))))))()))))))())))))))(())))()()(())()())))))(((())))()((())()))())))(()()))())(())())))()(((()())))))()(()()())))()()(()()(()()))())()(()()()))())()()))()())(()))))())))))())))(())()()))))(()))))(())(()))(())))))()()))()))))())()))()()(())())))((()))())()))))))()()))))((()(()))))()()))))))())))))())(()((()())))))))))))()())())))()))(()))))))(()))(())()())))(()))))))))())()()()()))))(()())))))))((())))()))(()))(())(())()())()))))))))(())))())))(()))()()))(()()))(()))())))()(())))())((()((()(())))((())))()))))((((())())()())))(())))()))))))())(()()((())))())()(()())))))(()())()))())))))))((())())))))))(()(()))())()()(()()(((()(((()())))))()))))))()(())(()()((()()(())()()))())()())()))()())())())))))))(((())))))))()()))))))(((())()))(()()))(()()))))(()(()()((((())()())((()()))))(()(())))))()((()()()())()()((()((()()))(()))(((()()()))(((())))()(((())()))))))((()(())())))(()())(((((()(()))(()((()))(()())()))))(()(()))()(()))(())(((())(()()))))()()))(((()))))(()()()()))())))((()()()(())()))()))))()()))()))))))((((((()()()))))())((()()(((()))))(()(())(()()())())())))()(((()()))(())((())))(()))(()()()())((())())())(()))))()))()((()(())()(()()(())(()))(())()))(())(()))))(())(())())(()()(()((()()((())))((()))()((())))(((()()()()((((()))(()()))()()()(((())((())())(()()(()()()))()((())(())()))())(((()()(())))()((()()())()())(()(())())(((())(())())((())(())()(((()()))(())))((())(()())())(())((()()()((((((())))((()(((((())()))()))(())(()()))()))(())()()))(())((()()())()()(()))())()((())))()((()()())((((()())((())())())((()((()))()))((())((()()(()((()()(((())(()()))))((()((())()(((())(()((())())((())(()((((((())())()(()())()(())(((())((((((()(())(()((()()()((()()(()()()())))()()(((((()()))()((((((()))()(()(()(()(((()())((()))())()((()))(())))()))()()))())()()))())((((())(()(()))(((((((())(((()(((((()(((()()((((())(((())())))(()()()(()(()))()))((((((()))((()(((()(())((()((((()((((((())(((((())))(((()(()))))(((()(((())()((())(()((()))(((()()(((())((((()(()(((((()))(((()(((((((()(()()()(()(()(()()())(())(((((()(())())()())(()(()(()))()(()()()())(()()(()((()))()((())())()(()))((())(()))()(()))()(((()(()(()((((((()()()()())()(((((()()(((()()()((()(((((()))((((((((()()()(((((()))))))(()()()(())(()))(()()))))(())()))(((((()(((((()()(()(()())(((()))((((()((()(()(()((()(()((())))()(((()((()))((()))(((((((((()((()((()(())))()((((()((()()))((())(((()(((((()()(()(()()((()(()()()(((((((())())()())))))((((()()(()))()))(()((())()(()(((((((((()()(((()(()())(()((()())((())())((((()(((()(((()((((()((()((((()(()((((((())((((((((((((()()(()()((((((((((((((()((()()))()((((((((((((())((((()(()())((()(()(()))()(((((()()(((()()))()())(())((()(((((()((())(((((()((()(((((()))()()((((())()((((())(((((((((()(())(()(())))())(()((())(((())(())(())())(()(()(())()()((()((())()(((()(((((()(())))()(((()((())))((()()()(((()(((()((()(()(())(()((()())(()(()(((()(((((((((())(()((((()()))(()((((()()()()(((()((((((((()(()()((((((()(()()(()((()((((((((((()()(((((((()())(())))(((()()))(((((()((()()())(()()((((())((()((((()))))(())((()(()()(((()(()(((()((((()(((((()))())())(()((())()))(((()())((())((())((((()((()((((((())(()((((()()))((((((())()(()))((()(((())((((((((((()()(((((()(((((()((()()()((((())))(()))()((()(())()()((()((((((((((()((())(())(((((()(()(()()))((((()((((()()((()(((()(((((((((()(()((()((()))((((((()(((())()()((()(((((((()())))()()(()((()((()()(((()(()()()()((((()((())((((()(((((((((()(((()()(((()(()(((()(((()((())()(()((()(()(()(()))()(((()))(()((((()((())((((())((((((())(()))(()((((())((()(()((((((((()()((((((()(()(()()()(())((()((()()(((()(((((((()()((()(((((((()))(((((()(((()(()()()(()(((()((()()((())(()(((((((((()(()((()((((((()()((())()))(((((()((())()())()(((((((((((()))((((()()()()())(()()(()(()()))()))(()))(()(((()()))())(()(()))()()((())(()())()())()(()))()))(()()(()((((((())((()(((((((((((()(())()((()(()((()((()(()((()((((((((((()()())((())()(())))((())()())()(((((()(()())((((()((()(())(()))(((())()((()))(((((())(()))()()(()))(((())((((()((((()(())))(((((((()))))())()())(())((())()(()()((()(()))()(()()(()()((()())((())((()()))((((()))()()))(()()(())()()(((((()(())((()((((()))()))(()())())(((()()(()()))(())))))(()))((())(((((()((((()))()((((()))()((())(((())))(((()())))((()(()()((";
  
        int floors = 0;
        char leftParen = '(';
        char rightParen = ')';
        int countLeft = 0;
        int countRight = 0;
        int negativeFloorPosition = 0;
        
        for (int i =0; i < input.length(); i++){
            if(input.charAt(i) == leftParen){
                countLeft++;
            }
            else if(input.charAt(i) == rightParen){
                countRight++;
            }
            else{
                System.out.println("error occurred");
            }
            floors = countLeft - countRight;
            if(floors == -1){
                negativeFloorPosition = i + 1;
                break;
            }
            else{
            }
        }
    
        System.out.println("Day1: \n" + "negative floor position: " + negativeFloorPosition + "\n");
        return floors;
    }
    
}
