package codes;

import utils.BasicFileUtils;
import utils.BasicUtils;

import java.util.List;

public class Budget {
    public String filename;

    public Budget(String filename){
        this.filename = filename;
    }

    public void setCatagoryandLimit(){
        String numOfCatagories = BasicUtils.takeStringInput("How many catagories you want to add? ");
        int num = Integer.parseInt(numOfCatagories);
        while(num>0){
            String catagory = BasicUtils.takeStringInput("Enter catagory name: ");
            String expenselimit = BasicUtils.takeStringInput("Enter expected limit for this: ");
            int limit = Integer.parseInt(expenselimit);
            BasicFileUtils.write(filename, catagory+","+limit+",0");
            num--;
        }
    }

    public void viewTotalSpending(){
        List<String> lines = BasicFileUtils.read(filename);
        if(lines.size()==0){
            System.out.println("No records yet");
            return;
        }
        for(String line : lines){
            String[] parts = BasicFileUtils.splitIntoParts(line);
            System.out.println("Catagpry : "+parts[0]+" --- Expected spending limit : "+parts[1]+" --- Your spendings : "+parts[2]);
        }
    }
}
