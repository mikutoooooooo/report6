import java.util.ArrayList;
public class Board {
    public void startBoard(ArrayList<Integer> deck) {

       
        

        for (int i = 0; i < 9; i++) {
            deck.add(i);
            if(i%3 == 2){
                System.out.println(deck.get(i));
            }
            else{ 
                System.out.print(deck.get(i));
            } 
        


        }
    }
    

    
}
