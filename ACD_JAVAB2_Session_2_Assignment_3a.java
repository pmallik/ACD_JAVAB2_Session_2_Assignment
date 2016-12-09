
public class ACD_JAVAB2_Session_2_Assignment_3a {
	public static void main(String args[])
    {
		// Session 2 Assignment 3
		// Create a Diamond of char by using nested for loop
		
        for(char i='A';i<='C';i++)
        {
            for(char k='C';k>=i;k--)
            {
                System.out.print(" ");
            }
            for(char j='A';j<=i-1;j++) 
            {
                System.out.print(j);
            }
            for (char j = i; j >= 'A'; j--) { 
                System.out.print(j);

            }
           
            System.out.println();
           
    
        
     
	} 
        // Reverse looping for alphabet pyramid
        
        for(char i='B';i>='A';i--)
        {
            for(char k='C';k>=i;k--)
            {
                System.out.print(" ");
            }
            for(char j='A';j<=i-1;j++) 
            {
                System.out.print(j);
            }
            for (char j = i; j >= 'A'; j--) { 
                System.out.print(j);

            }
           
            System.out.println();
           
    
        
     
	} 
            

           
        }

	
		
	}

    
        	
    
    
     


