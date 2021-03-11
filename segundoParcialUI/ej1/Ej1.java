package segundoParcial.ej1;

import controls.Button;
import controls.TextBox;
import org.junit.Assert;
import org.openqa.selenium.By;
import singletonSession.Session;
import org.junit.Assert;
import singletonSession.Session;
import segundoParcial.ej1.LoginModal;

public class Ej1 {


        LoginModal loginModal = new LoginModal();

        String user = "patrick@upb.com";
        String pwd = "1234";

        @org.junit.Test
        public void verify_login_todoly() throws InterruptedException {
            String newName = "Gavin";
            Session.getSession().getDriver().get("https://todo.ly/");
            loginModal.loginButton.click();
            loginModal.loginAction(user, pwd);
            loginModal.userButton.click();
            loginModal.settingsButton.click();
            loginModal.editNameButton.click();

            loginModal.nameTextBox.set(newName);
            loginModal.saveButton.click();
            String name = loginModal.nameLabel(newName).getText();

            Thread.sleep(2000);
            Assert.assertEquals("ERROR !!Cuenta no creada", newName, name);
        }




}
