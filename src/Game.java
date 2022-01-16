import java.util.ArrayList;

public class Game {
    public  void gamedekitaze(){
        ArrayList<Integer> intBoard = new ArrayList<Integer>();
        
       

        Board board = new Board();
        InputBoard inputBoard = new InputBoard();
        Judgement judgeMent = new Judgement();
        
        board.startBoard(intBoard);
        //binput.aaaa();
        inputBoard.StrBoard();
        
        
        //cpuと対戦（ターン）
        //決着がついたときbreakでぬける
        for (int i = 0; i < 9; i++) {
            
            if(i%2== 0){
                System.out.println("　　　　　　　　　　　　");
                System.out.println("あなたの番です");
                inputBoard.input("o");
                board.startBoard(intBoard);
                inputBoard.StrBoard();
                if(judgeMent.winner() == true){
                    break;
                }
                if(i==8){
                    System.out.println("　　　　　　　　　　　　");
                    System.out.println("引き分けです。");
                    break;
                }
                
            }
            else if(i%2==1){ 
                System.out.println("　　　　　　　　　　　　");
                System.out.println("cpuの番です");
                inputBoard.input("x");
                board.startBoard(intBoard);
                inputBoard.StrBoard();
                if(judgeMent.loser() == true){
                    break;
                };
            } 
        }
    }
}
