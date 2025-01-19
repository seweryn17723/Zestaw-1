public class AdminAuthentication implements Main.Authenication {

    String currentlyUsername = "Terminator";
    String currentlyPassword = "123Zbyszek";

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
        System.out.println("Pomyślnie wylogowano administratora.");
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
