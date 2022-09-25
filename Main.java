import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);    
		
		try {
		    boolean repeater = false;
		    boolean searchEnable = false;
		    boolean deleteEnable = false;
		    int arrayList[] = null;
		    int size;
		    String errorMessage = "";
		    String foundMessage = "";
		    String displayMessage = "";
		    String deleteMessage = "";
		    String createdMessage = "";
		    String insertMessage = "";
		    do{
        		
		        System.out.println("\n\t\tArray Operation");
        	    System.out.println("MENU");
        	    System.out.println("[1] CREATE ARRAY");
        	    System.out.println("[2] INSERT ARRAY");
        	    System.out.println("[3] SEARCH");
        	    System.out.println("[4] DISPLAY");
        	    System.out.println("[5] DELETE");
        	    System.out.println("[0] STOP");
    		    System.out.print("Enter your option: ");
    		    int input = scan.nextInt();
    		    
    		    switch(input){
    		        case 1:
    		            clearScreen();
    		            System.out.println("===============================");
    		            System.out.println("\tOPTION CREATE");
    		            System.out.println("===============================");
    		            System.out.print("Enter size of array: ");
    		            size = scan.nextInt();
    		            arrayList = new int[size];
                
    		            createdMessage = "Array is created!";
    		            repeater = true;
    		            searchEnable = true;
    		            deleteEnable = true;
    		            
    		            clearScreen();
                        System.out.print(createdMessage);
    		           
    		            break;
    		        case 2:
    		            if(arrayList == null){
    		                errorMessage = "ERROR: You dont have an array";
    		                repeater = true;
        		            clearScreen();
                            System.out.print(errorMessage);
    		            }else{
    		                clearScreen();
    		                System.out.println("===============================");
    		                System.out.println("\tOPTION INSERT");
    		                System.out.println("Your array need "+arrayList.length+" element.");
    		                System.out.println("Press -99 to exit");
    		                System.out.println("===============================");
    		                for(int i = 0; i<arrayList.length; i++){
    		                    System.out.print("Enter element for index "+i+": ");
        		                int element = scan.nextInt();
        		                if(element == -99){
        		                    break;
        		                }
        		                arrayList[i] = element;
        		            }
        		            insertMessage = "Insert Element successfully";
        		            repeater = true;
        		            clearScreen();
                            System.out.print(insertMessage);
    		            }
    		            
    		            break;
    		        case 3:
    		            clearScreen();
    		            System.out.println("===============================");
                        System.out.println("\tOPTION SEARCH");
                        System.out.println("===============================");
    		            if(arrayList == null){
    		                errorMessage = "ERROR: You dont have an array";
    		                repeater = true;
        		            clearScreen();
                            System.out.print(errorMessage);
    		            }else if(searchEnable == false){
    		                errorMessage = "NO EXISTING ELEMENT";
    		                repeater = true;
        		            clearScreen();
                            System.out.print(errorMessage);
    		            }else{
    		                System.out.print("Enter search: ");
        		            int search = scan.nextInt();
    		                for(int i = 0; i<arrayList.length; i++){
    		                    
    		                    if(arrayList[i] == search){
    		                        foundMessage = "The "+ search +" is in index "+i;
      		                    }
        		            }
        		            repeater = true;
        		            clearScreen();
                            System.out.print(insertMessage);
    		            }
    		            break;
    		        case 4:
    		            displayMessage = "CURRENT ARRAY: "+Arrays.toString(arrayList);
    		            clearScreen();
    		            System.out.print(displayMessage);
    		            repeater = true;
    		            break;
    		        case 5:
    		            clearScreen();
                        System.out.println("===============================");
                        System.out.println("\tOPTION DELETE");
                        System.out.println("===============================");
    		            if(arrayList == null){
    		                errorMessage = "ERROR: You dont have an array";
    		                repeater = true;
        		            clearScreen();
                            System.out.print(errorMessage);
    		            }else if(searchEnable == false){
    		                errorMessage = "NO EXISTING ELEMENT";
    		                repeater = true;
        		            clearScreen();
                            System.out.print(errorMessage);
    		            }else{
    		                System.out.print("Enter the Element to Remove: ");
                            int deleteElement = scan.nextInt();
                          
                            for(int i=0; i<arrayList.length; i++)
                            {
                               if(deleteElement==arrayList[i])
                               {
                                  for(int j=i; j<(arrayList.length-1); j++)
                                   arrayList[j] = arrayList[j+1];
                                   deleteMessage = "Removed the "+deleteElement+" successfully!";
                                break;
                               }
                            }
        		            repeater = true;
        		            clearScreen();
                            System.out.print(deleteMessage);
    		            }
    		           
    		            break;
    		        case 6:
    		            System.exit(1);
    		        default:
    		    }
		        
		    }while(repeater);
		    
		} catch(Exception e) {
		    clearScreen();
		    System.out.print("INPUT_ERROR:Invalid! input must be a number.");
		}
	}
	static void clearScreen(){
	    System.out.print("\033[H\033[2J"); //Clear Screen
        System.out.flush(); //Clear Screen
	}
}
