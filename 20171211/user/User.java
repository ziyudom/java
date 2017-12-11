package user;


public class User implements Comparable<User>{
    private int number; //番号
    private String name; //名前

    public User(){};

    public int compareTo( User obj){
        //番号が低ければ
        if( this.number < obj.number ){
            return -1;
        }
        if( this.number > obj.number ){
            return 1;
        }

        return 0 ;

    }

    //番号セット
    public void setNumber(int _num){
        this.number = _num;
    }
    //名前セット
    public void setName(String _name){
        this.name = _name;
    }
    //名前ゲット
    public String getName(){
        return this.name;
    }
}
