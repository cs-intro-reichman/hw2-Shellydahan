// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String cheer =(args[0].toUpperCase());
            int times = Integer.parseInt( args[1]);
            for(int i=0; i<cheer.length(); i++)
            {
               char c= cheer.charAt(i);
               if(c=='A'||c=='E'||c=='F'||c=='H'||c=='I'||c=='L'||c=='M'||c=='N'||c=='O'||c=='R'||c=='S'||c=='X')
                  System.out.println("Give me an "+ c+ ": "+ c+ "!");
                else
                  System.out.println("Give me a "+ c+ ": "+ c+ "!");
            }
            System.out.println("What does that spell?");
            for(int i=0; i<times; i++)
            {
              System.out.println(cheer+ "!!!");
            }
        
             
        }
}
