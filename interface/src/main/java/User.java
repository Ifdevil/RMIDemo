import java.io.Serializable;

public class User implements Serializable{

    private String name;

    User(String name){
        super();
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
