package Day2;

public class User {

    private String username;
    private String email;
    private String password;
    private int age;
    private String city;
    private String interest;

    public User(String username, String email, String password, int age,
                String city, String interest) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.city = city;
        this.interest = interest;
    }

    public boolean login(String un, String pw) {
        if (this.username.equals(un) &&
                this.password.equals(pw)) {
            System.out.println(username + " is successfully logged in");
            return  true;
        } else if (this.username.equals(un)) {
            System.out.println("Wrong Password. ");
            return  false;
        } else if (this.password.equals(pw)) {
            System.out.println("Wrong Username. ");
            return  false;
        } else {
            System.out.println("Who are you? go away!");
            return  false;
        }
    }

    public void logout() {
        System.out.println("Bye!");
    }

    public void changeInterest(String newInterest) {
        this.interest = newInterest;
        System.out.println(this.username
        + " changed current interest form "
        + this.interest + " to " + newInterest);
        this.interest = newInterest;
    }

    // getters
//    public String getUsername(){
//        return this.username;
//    }

    public void getUsername(){
        System.out.println(this.username);
    }

    // setters
    public void setUsername(String username){
        this.username = username;
    }


}

