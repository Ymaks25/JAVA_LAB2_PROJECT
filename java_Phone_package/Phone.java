package java_Phone_package;


public class Phone {

    private int id;

    private String Lastname;

    private String patronymic;

    private int account_number;

    private int local_minutes;

    private int international_minutes;

    public Phone(){
        this.id = 0;
        this.Lastname = "";
        this.patronymic = "";
        this.account_number = 0;
        this.local_minutes = 0;
        this.international_minutes = 0;
    }
    
    public Phone(int id, String Lastname, String patronymic, int account_number, int local_minutes, int international_minutes){
        this.id = id;
        this.Lastname = Lastname;
        this.patronymic = patronymic;
        this.account_number = account_number;
        this.local_minutes = local_minutes;
        this.international_minutes = international_minutes;
    }

    public String toString(){
        return id+"  "+Lastname+"  "+patronymic+"  "+account_number+"  "+local_minutes+"  "+international_minutes+"\n";
    }
    
    public int get_id(){
        return id;
    }

    public String get_Lastname(){
        return Lastname;
    }

    public String get_patronymic(){
        return patronymic;
    }

    public int get_account_number(){
        return account_number;
    }

    public int get_local_minutes(){
        return local_minutes;
    }

    public int get_international_minutes(){
        return international_minutes;
    }

    public void set_id(int id){
        this.id = id;
    }

    public void set_Lastname(String Lastname){
        this.Lastname = Lastname;
    }

    public void set_patronymic(String patronymic){
        this.patronymic = patronymic;
    }

    public void set_account_number(int account_number){
        this.account_number = account_number;
    }

    public void set_local_minutes( int local_minutes ){
        this.local_minutes = local_minutes;
    }

    public void set_international_minutes(int international_minutes){
        this.international_minutes = international_minutes;
    }

    public void print_columns(){
        System.out.println( "id  Lastname  patronymic  account_number  local_minutes  international_minutes\n");
    }
    
}
