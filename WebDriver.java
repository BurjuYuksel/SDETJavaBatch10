package class27.EastCteamProject2;

public interface WebDriver {


        void open();

        void close();

        String getTitle();
    }
    interface TakesScreenShot{
    void getScreenShot();

    }

    interface RemoteWebDriver extends TakesScreenShot,WebDriver {
        void navigate();
    }

   class ChromeDriver implements RemoteWebDriver {
    @Override
       public void open(){

    }

       @Override
       public void close() {
           
       }

       @Override
       public String getTitle() {
           return null;
       }


       @Override
       public void getScreenShot() {

       }

       @Override
       public void navigate() {

       }
   }

 abstract class FireFoxDriver implements RemoteWebDriver {
     @Override
     public void open() {

     }

     @Override
     public void close() {

     }

     @Override
     public String getTitle() {
         return null;
     }


     @Override
     public void getScreenShot() {

     }

     @Override
     public void navigate() {
     }
 }

         class SafariDriver implements RemoteWebDriver {
             @Override
             public void open() {

             }

             @Override
             public void close() {

             }

             @Override
             public String getTitle() {
                 return null;
             }


             @Override
             public void getScreenShot() {

             }

             @Override
             public void navigate() {



     }

 }






