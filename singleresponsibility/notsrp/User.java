public class User {
    private String name;
    private String email;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // this is not srp which isn't related to managing user data
    public void sendEmailNotification(String message){
        System.out.println("success to send email notification");
    }
}
