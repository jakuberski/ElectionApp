package electionapp;

import java.util.ArrayList;
import java.io.*; 
import java.util.*;
import java.util.Collections;

public class Vote {
	
	
    ArrayList<String> demVoters; 
    ArrayList<String> repVoters; 

    public Vote(){
        this.demVoters = new ArrayList<String>();
        this.repVoters = new ArrayList<String>();
    }
    
    public int getDemVoters(){
        return demVoters.size();
    }
    
    public int getRepVoters(){
        return repVoters.size();
    }
    
    public void alphabetize(){
        Collections.sort(demVoters);
        Collections.sort(repVoters);
    }
    
    public int count(int arr[], int n, int x) 
    { 
        int res = 0; 
        for (int i=0; i<n; i++) 
            if (x == arr[i]) 
              res++; 
        return res; 
    } 
}
