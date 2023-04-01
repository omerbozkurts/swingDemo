
public class User{
    int userId;
    String name;
    String surname;
    String username;
    String password;
    
    public User(int userId,String name,String surname, String username,String password){
    this.userId=userId;
    this.name=name;
    this.surname=surname;
    this.username=username;
    this.password=password;
    }
    
    public int getUserId(){
        return this.userId;
    }
    public void setUserId(int userId){
        this.userId=userId;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }
}
