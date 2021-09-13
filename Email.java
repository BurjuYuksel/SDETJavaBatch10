package class27.EastCteamProject2;

public class Email {


        public static void main(String[] args) {
            Registration r=new Registration();
            r.seteMail("burcuyuksel.t@gmail.com");
            r.setUserName("burju yuksel");
            r.setPassword("3456brc");

        }
    }

    class Registration{
        private String eMail;
        private String userName;
        private String password;

        public void geteMail() {


        }

        public void seteMail(String eMail) {
            this.eMail = eMail;
            if(eMail.contains("yahoo")) System.out.println("valid e mail address");
            else System.out.println("invalid e mail address!");
        }

        public void getUserName() {

        }

        public void setUserName(String userName) {
            this.userName = userName;
            if(!userName.isEmpty()&&userName.length()>6) System.out.println("valid user name");
            else System.out.println("invalid user name!");
        }

        public void getPassword() {

        }

        public void setPassword(String password) {
            this.password = password;
            if (!password.isEmpty() && password.length() > 6 && !password.contains(userName))
                System.out.println("valid password");
            else System.out.println("invalid password!");


    }

}