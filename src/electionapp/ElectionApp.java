
package electionapp;
import javax.swing.*;  
import java.util.ArrayList;
import java.io.*; 
import java.util.*;
import java.util.Collections;

public class ElectionApp {
//Main Class that uses JPane for the GUI
    public static void main(String[] args) {
        Vote newElection = new Vote();
        
        JOptionPane.showMessageDialog (null, "Welcome to the 2020 Election! Are you ready to cast your vote?"
                , "2020 Election", JOptionPane.INFORMATION_MESSAGE);
        String numVoters = JOptionPane.showInputDialog("How many people will be voting today?", "Voters");
        
        int votesByDistrict[] = new int[Integer.parseInt(numVoters)];
        
        for (int i = 0; i < Integer.parseInt(numVoters) ; i++){
            String name = JOptionPane.showInputDialog("Please Enter Full Name (First and Last) " + (i + 1), "Name");
            
            String district = JOptionPane.showInputDialog("Please Enter Your Disctrict Number (1 - 5):", "Disctrict Number");
        
            String vote = JOptionPane.showInputDialog("Hey " + name +  " There are two options to choose from"
                    + ": Democrat and Republican.\n Please enter 1 for Democrat and 2 for Republican\n", "Vote");
            
            votesByDistrict[i] = Integer.parseInt(district);


            if (Integer.parseInt(vote) == 1){
                newElection.demVoters.add(name);
            }
            else{
                newElection.repVoters.add(name);
            }
        }
        
        newElection.alphabetize();
        
        JOptionPane.showMessageDialog (null, "The results of the election are as follows:\n"
                    + "Democrats: " + newElection.getDemVoters() + " votes\n"
                    + "Republicans: " + newElection.getRepVoters() + " votes\n"
                    + "Names of Democrat Voters: " + newElection.demVoters.toString() + "\n"
                    + "Names of Republican Voters: " + newElection.repVoters.toString() + "\n"
                    + "Votes by District:\n\n"
                    + "District 1: " + newElection.count(votesByDistrict, votesByDistrict.length, 1) + " Votes \n"
                    + "District 2: " + newElection.count(votesByDistrict, votesByDistrict.length, 2) + " Votes \n"
                    + "District 3: " + newElection.count(votesByDistrict, votesByDistrict.length, 3) + " Votes \n"
                    + "District 4: " + newElection.count(votesByDistrict, votesByDistrict.length, 4) + " Votes \n"
                    + "District 5: " + newElection.count(votesByDistrict, votesByDistrict.length, 5) + " Votes \n"

                    , "2020 Election Results", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
