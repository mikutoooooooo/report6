import java.util.ArrayList;


public class Judgement {

    InputBoard inputBoard = new InputBoard();
    

    

    public void winner(){
        

        if ((inputBoard.strBoard.get(0) == "o" && inputBoard.strBoard.get(1) == "o" && inputBoard.strBoard.get(2) == "o") || (inputBoard.strBoard.get(3) == "o" && inputBoard.strBoard.get(4) == "o" && inputBoard.strBoard.get(5) == "o") || (inputBoard.strBoard.get(6) == "o" && inputBoard.strBoard.get(7) == "o" && inputBoard.strBoard.get(8) == "o")||(inputBoard.strBoard.get(0) == "o" && inputBoard.strBoard.get(3) == "o" && inputBoard.strBoard.get(6) == "o")||(inputBoard.strBoard.get(1) == "o" && inputBoard.strBoard.get(4) == "o" && inputBoard.strBoard.get(7) == "o")||(inputBoard.strBoard.get(2) == "o" && inputBoard.strBoard.get(5) == "o" && inputBoard.strBoard.get(8) == "o")||(inputBoard.strBoard.get(0) == "o" && inputBoard.strBoard.get(4) == "o" && inputBoard.strBoard.get(8) == "o")||(inputBoard.strBoard.get(2) == "o" && inputBoard.strBoard.get(4) == "o" && inputBoard.strBoard.get(6) == "o")){

            System.out.println("oの勝ちです！！");
            
        }
        
    }


    public void loser(){
        if ((inputBoard.strBoard.get(0) == "x" && inputBoard.strBoard.get(1) == "x" && inputBoard.strBoard.get(2) == "x") || (inputBoard.strBoard.get(3) == "x" && inputBoard.strBoard.get(4) == "x" && inputBoard.strBoard.get(5) == "x") || (inputBoard.strBoard.get(6) == "x" && inputBoard.strBoard.get(7) == "x" && inputBoard.strBoard.get(8) == "x")||(inputBoard.strBoard.get(0) == "x" && inputBoard.strBoard.get(3) == "x" && inputBoard.strBoard.get(6) == "x")||(inputBoard.strBoard.get(1) == "x" && inputBoard.strBoard.get(4) == "x" && inputBoard.strBoard.get(7) == "x")||(inputBoard.strBoard.get(2) == "x" && inputBoard.strBoard.get(5) == "x" && inputBoard.strBoard.get(8) == "x")||(inputBoard.strBoard.get(0) == "x" && inputBoard.strBoard.get(4) == "x" && inputBoard.strBoard.get(8) == "x")||(inputBoard.strBoard.get(2) == "x" && inputBoard.strBoard.get(4) == "x" && inputBoard.strBoard.get(6) == "x")){

            System.out.println("oの負けです...");
            
        }

            
            
    }
        
}



    
  

