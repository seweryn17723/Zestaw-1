public class UserAuthentication implements Main.Authenication {
    String currentlyUsername = "Joker";
    String currentlyPassword = "synMłynarza";

    @Override
    public boolean login(String username, String password){


        if(currentlyUsername ==  username && currentlyPassword == password){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void logout(){
        System.out.println("Pomyślnie wylogowano użytkownika.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {

        if(currentlyUsername ==  username && currentlyPassword == oldPassword){
            this.currentlyPassword = newPassword;
            return true;
        }else{
            return false;
        }
    }
}
