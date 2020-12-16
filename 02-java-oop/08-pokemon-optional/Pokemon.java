public class Pokemon {
    String name;
    int health;
    String type;
    static int count;

    public Pokemon(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
    }

    public void attackPokemon(Pokemon name){
        name.health = name.health - 10; 
    }
    
    public String getName(){
        return name; 
    }
    public int getHealth(){
        return health; 
    }
    public String getType(){
        return type; 
    }
    public void setName(String name){
        this.name = name; 
    }
    public void setHealth(int health){
        this.health = health; 
    }
    public void setType(String type){
        this.type = type; 
    }
    
}