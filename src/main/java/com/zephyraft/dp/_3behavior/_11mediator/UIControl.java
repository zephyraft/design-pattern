package com.zephyraft.dp._3behavior._11mediator;

import javax.swing.text.View;

public class UIControl {
    private static final String LOGIN_BTN_ID = "login_btn";
    private static final String REG_BTN_ID = "reg_btn";
    private static final String USERNAME_INPUT_ID = "username_input";
    private static final String PASSWORD_INPUT_ID = "pswd_input";
    private static final String REPEATED_PASSWORD_INPUT_ID = "repeated_pswd_input";
    private static final String HINT_TEXT_ID = "hint_text";
    private static final String SELECTION_ID = "selection";

    public static void main(String[] args) {
        Button loginButton = (Button) findViewById(LOGIN_BTN_ID);
        Button regButton = (Button) findViewById(REG_BTN_ID);
        Input usernameInput = (Input) findViewById(USERNAME_INPUT_ID);
        Input passwordInput = (Input) findViewById(PASSWORD_INPUT_ID);
        Input repeatedPswdInput = (Input) findViewById(REPEATED_PASSWORD_INPUT_ID);
        Text hintText = (Text) findViewById(HINT_TEXT_ID);
        Select selection = (Select) findViewById(SELECTION_ID);

        LandingPageDialog dialog = new LandingPageDialog();
        dialog.setLoginButton(loginButton);
        dialog.setRegButton(regButton);
        dialog.setUsernameInput(usernameInput);
        dialog.setPasswordInput(passwordInput);
        dialog.setRepeatedPswdInput(repeatedPswdInput);
        dialog.setHintText(hintText);
        dialog.setSelection(selection);

        loginButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.handleEvent(loginButton, "click");
            }
        });
        regButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.handleEvent(regButton, "click");
            }
        });
    }

    private static Component findViewById(String id) {
        return null;
    }

}
