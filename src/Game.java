import java.util.ArrayList;

public class Game {
    public  void gamedekitaze(){
        ArrayList<Integer> deck = new ArrayList<Integer>();
        
       

        Board board = new Board();
        InputBoard inputBoard = new InputBoard();
        Judgement judgeMent = new Judgement();
        
        board.startBoard(deck);
        //binput.aaaa();
        inputBoard.StrBoard();
        
        
        //cpuと対戦（ターン）
        //決着がついたときbreakでぬける
        for (int i = 0; i < 9; i++) {
            
            if(i%2== 0){
                System.out.println("　　　　　　　　　　　　");
                System.out.println("あなたの番です");
                inputBoard.input("o");
                board.startBoard(deck);
                inputBoard.StrBoard();
                if(i==8){
                    System.out.println("　　　　　　　　　　　　");
                    System.out.println("引き分けです。");
                    break;
                }
                if(judgeMent.winner() == true){
                    break;
                


                }
                
                
            }
            else if(i%2==1){ 
                System.out.println("　　　　　　　　　　　　");
                System.out.println("cpuの番です");
                inputBoard.input("x");
                board.startBoard(deck);
                inputBoard.StrBoard();
                if(judgeMent.loser() == true){
                    break;

                };
                
            } 
        


        }

    }
    
}
