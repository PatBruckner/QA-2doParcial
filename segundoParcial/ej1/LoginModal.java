package segundoParcial.ej1;


import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
        public TextBox emailTextBox = new TextBox(By.xpath("//input[@name='email' and @type='email']"));
        public TextBox pwdTextBox = new TextBox(By.xpath("//input[@class='form_field_control' and @type='password']"));
        public Button loginButton = new Button(By.xpath("//a[contains(.,'Login') and @class='_2q_cf']"));
        public Button login2Button = new Button(By.xpath("//button[contains(.,'Log in') and @class='submit_btn ist_button ist_button_red sel_login']"));
        public Button userButton = new Button(By.xpath("//button[@type='button' and @class='reactist_menubutton top_bar_btn settings_btn']"));
        public Button settingsButton = new Button(By.xpath("//button[@id='user_menu_settings_menuitem']"));
        public Button editNameButton = new Button(By.xpath("//a[contains(.,'Edit') and @class='inline_edit_link']"));
        public TextBox nameTextBox = new TextBox(By.xpath("//input[@type='text' and @style='width: 150px;']"));
        public Button saveButton = new Button(By.xpath("//a[contains(.,'Save') and @class='inline_edit_link']"));

        public static Label nameLabel(String name) {
            return new Label(By.xpath("//span[contains(.,'" + name + "') and @class='data']"));
        }

        public LoginModal() {
        }

        public void loginAction(String user, String pwd) {
            emailTextBox.set(user);
            pwdTextBox.set(pwd);
            login2Button.click();
        }


}
