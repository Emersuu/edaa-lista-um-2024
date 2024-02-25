package Animal;
public class Animal {
    private int id;
    private String tipo;
    private String habitat;
    
    public Animal(int id, String tipo, String habitat) {
        this.id = id;
        this.tipo = tipo;
        this.habitat = habitat;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}