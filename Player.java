import java.util.*;
public class Player {
    private ArrayList<Treasure>stack;
    private int count;
    private boolean isWet;
    public Player(){
        stack = new ArrayList<Treasure>();
        count = 0;
        isWet = false;
    }
    public int getNumberOfTreasure(){
        return stack.size();
    }
    public void addTreasure(Treasure t){
        stack.add(t);
    }
    public int getValue(){
        int result = 0;
        for (int i =0; i<stack.size();i++){
            result +=stack.get(i).getValue();
        }
        return result;
    }
    public boolean isWet(){
        return isWet;
    }
}
