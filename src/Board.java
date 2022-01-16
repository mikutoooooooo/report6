import java.util.ArrayList;

//数字でボードの座標と対応させるために作成
public class Board {
    
    public void startBoard(ArrayList<Integer> intBoard) {

       
        

        for (int i = 0; i < 9; i++) {
            intBoard.add(i);
            if(i%3 == 2){
                System.out.println(intBoard.get(i));
            }
            else{ 
                System.out.print(intBoard.get(i));
            } 
        


        }
    }
    

    
}
