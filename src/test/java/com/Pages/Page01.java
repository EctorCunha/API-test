package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Page01 extends BasePage {

    // Cadastro
    protected static final String registrar = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]"; //Xpath
    protected static final String emailRegister = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input"; //Xpath
    protected static final String nomeRegister = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[3]/input"; //Xpath
    protected static final String passwordRegister = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input"; //Xpath
    protected static final String passwordConfirmRegister = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[5]/div/input"; //Xpath
    protected static final String toggleBalanceRegister = "//*[@id=\"toggleAddBalance\"]"; //Xpath
    protected static final String CadastrarRegister = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button"; //Xpath
    protected static final String clickClose = "//*[@id=\"btnCloseModal\"]"; //Xpath

    // Login
    protected static final String clickAccess = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[1]"; //Xpath
    protected static final String loginEmail = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input"; //Xpath
    protected static final String loginPassword = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[2]/div/input"; //Xpath
    protected static final String loginAccess = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[1]"; //Xpath

    // Extrato
    protected static final String buttonExtract = "#btn-EXTRATO"; //js
    protected static final String verifyBalanceText = "//*[@id=\"__next\"]/div/div[3]/div/div[1]/p[1]"; //Xpath
    protected static final String verifyExtractText = "//*[@id=\"textTypeTransaction\"]"; //Xpath
    protected static final String clickBack = "//*[@id=\"__next\"]/div/div[2]/div[1]"; //Xpath

    // Transferência
    protected static final String clickTranfer = "//*[@id=\"btn-TRANSFERÊNCIA\"]"; //Xpath
    protected static final String inputNumber = "//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[1]/input"; //Xpath
    protected static final String inputDigit = "//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[2]/input"; //Xpath
    protected static final String inputValue = "//*[@id=\"__next\"]/div/div[3]/form/div[2]/input"; //Xpath
    protected static final String inputDescription = "//*[@id=\"__next\"]/div/div[3]/form/div[3]/input"; //Xpath
    protected static final String buttonTransfer = "//*[@id=\"__next\"]/div/div[3]/form/button"; //Xpath
    protected static final String successMessage = "//*[@id=\"modalText\"]"; //Xpath


    // Testes back-end API Rest:


    // Métodos de registro
    public void AccountRegister (){
        WebElement register = getWebElement(By.xpath(registrar));
        register.click();
    }

    public void sessaoRegistro (String email, String nome, String senha, String confirmarSenha){

        WebElement inputEmail = getWebElement(By.xpath(emailRegister));
        inputEmail.clear();
        inputEmail.sendKeys(email);

        WebElement inputName = getWebElement(By.xpath(nomeRegister));
        inputName.clear();
        inputName.sendKeys(nome);

        WebElement inputPassword = getWebElement(By.xpath(passwordRegister));
        inputPassword.clear();
        inputPassword.sendKeys(senha);

        WebElement inputConfirmPassword = getWebElement(By.xpath(passwordConfirmRegister));
        inputConfirmPassword.clear();
        inputConfirmPassword.sendKeys(confirmarSenha);

    }

    public void getToggleBalance(){
        WebElement toggle = getWebElement(By.xpath(toggleBalanceRegister));
        toggle.click();
    }

    public void getClickRegister (){
        WebElement clickRegister = getWebElement(By.xpath(CadastrarRegister));
        clickRegister.click();
    }

    public void getClickClose (){
        WebElement close = getWebElement(By.xpath(clickClose));
        close.click();
    }

    // Login
    public void getClickAccess (){
        WebElement access = getWebElement(By.xpath(clickAccess));
        access.click();
    }

    public void getLogin (String email, String senha){

        WebElement inputEmail = getWebElement(By.xpath(loginEmail));
        inputEmail.clear();
        inputEmail.sendKeys(email);

        WebElement inputPassword = getWebElement(By.xpath(loginPassword));
        inputPassword.clear();
        inputPassword.sendKeys(senha);
    }

    public void getClickButtonAccess (){
        WebElement clickAccess = getWebElement(By.xpath(loginAccess));
        clickAccess.click();
    }

    // Extrato

    public void getClickButtonExtract (){
        WebElement clickButton = getWebElement(By.cssSelector(buttonExtract));
        clickButton.click();
    }

    public String getVerifyBalanceText(){
        WebElement identificarTexto = getWebElement(By.xpath(verifyBalanceText));
        return identificarTexto.getText();
    }

    public String getVerifyExtractText(){
        WebElement identificarTexto = getWebElement(By.xpath(verifyExtractText));
        return identificarTexto.getText();
    }

    public void getClickBack (){
        WebElement back = getWebElement(By.xpath(clickBack));
        back.click();
    }

    // Transferência
    public void getButtonTranfer (){
        WebElement clickButton = getWebElement(By.xpath(clickTranfer));
        clickButton.click();
    }

    public void getInputNumber (String numero){
        WebElement number = getWebElement(By.xpath(inputNumber));
        number.clear();
        number.sendKeys(numero);
    }

    public void getInputDigit (String digito){
        WebElement digit = getWebElement(By.xpath(inputDigit));
        digit.clear();
        digit.sendKeys(digito);
    }

    public void getInputValue (String valor){
        WebElement value = getWebElement(By.xpath(inputValue));
        value.clear();
        value.sendKeys(valor);
    }

    public void getInputDescription (String descricao){
        WebElement description = getWebElement(By.xpath(inputDescription));
        description.clear();
        description.sendKeys(descricao);
    }

    public void getClickButtonTransfer (){
        WebElement clickButton = getWebElement(By.xpath(buttonTransfer));
        clickButton.click();
    }

    public String getSuccessOrNot (){
        WebElement identificarTexto = getWebElement(By.xpath(successMessage));
        return identificarTexto.getText();
    }

}
