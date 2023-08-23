public class Treasure {
    private int tier;
    private int value;
    public Treasure(){
        tier = 0;
        value= 0;
    }
    public Treasure(int i){
        tier = i;
    }
    public Treasure(int i, int a){
        tier = i; 
        value = a;
    }
    public int getValue(){
        return value;
    }
}
