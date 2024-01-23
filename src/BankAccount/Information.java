package BankAccount;

public class Information {
    private String ID , cusID , userID , pinCode ;
    private int soDu ;

    public Information(String ID, String cusID, String userID, String pinCode, int soDu) {
        this.ID = ID;
        this.cusID = cusID;
        this.userID = userID;
        this.pinCode = pinCode;
        this.soDu = soDu;
    }
    public void deposit (int tien){
        this.soDu += tien ;
    }
    public void withdraw (int tien){
        if(this.soDu >= 50000)
        {
            this.soDu -= tien ;

        }
    }
//    public void transfer(){
//
//    }
}
