package com.zephyraft.dp._3behavior._11mediator;

public class LandingPageDialog implements Mediator {
    private Button loginButton;
    private Button regButton;
    private Select selection;
    private Input usernameInput;
    private Input passwordInput;
    private Input repeatedPswdInput;
    private Text hintText;

    @Override
    public void handleEvent(Component component, String event) {
        if (component.equals(loginButton)) {
            String username = usernameInput.text();
            String password = passwordInput.text();
            //校验数据...
            // 做业务处理...
        } else if (component.equals(regButton)) {
            // 获取usernameInput、passwordInput、repeatedPswdInput数据...
            // 校验数据...
            // 做业务处理...
        } else if (component.equals(selection)) {
            String selectedItem = selection.select();
            if (selectedItem.equals("login")) {
                usernameInput.show();
                passwordInput.show();
                repeatedPswdInput.hide();
                hintText.hide(); //...省略其他代码
            } else if (selectedItem.equals("register")) { //....
            }
        }
    }

    public void setLoginButton(Button loginButton) {
        this.loginButton = loginButton;
    }

    public void setRegButton(Button regButton) {
        this.regButton = regButton;
    }

    public void setSelection(Select selection) {
        this.selection = selection;
    }

    public void setUsernameInput(Input usernameInput) {
        this.usernameInput = usernameInput;
    }

    public void setPasswordInput(Input passwordInput) {
        this.passwordInput = passwordInput;
    }

    public void setRepeatedPswdInput(Input repeatedPswdInput) {
        this.repeatedPswdInput = repeatedPswdInput;
    }

    public void setHintText(Text hintText) {
        this.hintText = hintText;
    }
}
