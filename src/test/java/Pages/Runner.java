package Pages;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class Runner {
    OpenBrowser openBR = new OpenBrowser();
    Register cliclregister = new Register();
    AccountServices tranfer =new AccountServices();
    AccountServices Request =  new AccountServices();
    AccountServices openaccount= new AccountServices();
    AccountServices logout = new AccountServices();
    LogIn setlogin =new LogIn();

    @BeforeSuite
    public void setupBrowser() {
        openBR.setupBrowser();
    }

    @Test(priority = 1)
    public void setSetligin(){

        setlogin.setlogin();
    }
    @Test(priority = 2)
    public void setnewaccount(){
        openaccount.OpenNewacc();
    }
    @Test(priority = 3)
    public void setTranfer(){
        tranfer.settranferloan();
    }
    @Test (priority = 4)
    public void setRequestloan(){
        Request.Requestloan();
    }
@Test(priority = 5)
    public void setlogout(){
        logout.Logout();
}
    @Test(priority = 6)
    public void setCliclregister(){
        cliclregister.register();
    }
}