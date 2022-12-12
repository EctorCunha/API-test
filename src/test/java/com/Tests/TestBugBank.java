package com.Tests;

import com.Pages.Page01;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestBugBank {

	private static Page01 page;

	@BeforeEach
	public void setUp(){
		page = new Page01();
		page.openApp();
	}

	@org.junit.jupiter.api.Test
	public void registerFlowTest() throws InterruptedException{

		// Registro
		page.AccountRegister();
		Thread.sleep(2000);
		page.sessaoRegistro( "cunha@gmail.com", "cunha", "123456", "123456");
		Thread.sleep(2000);
		page.getToggleBalance();
		Thread.sleep(2000);
        page.getClickRegister();
		Thread.sleep(2000);
		page.getClickClose();
		Thread.sleep(2000);

		// Login
		page.getClickAccess();
		Thread.sleep(2000);
		page.getLogin("cunha@gmail.com", "123456");
		page.getClickButtonAccess();
		Thread.sleep(2000);

		// Extrato
		page.getClickButtonExtract();
		Thread.sleep(2000);
		String balance = page.getVerifyBalanceText();
		assertTrue(balance.contains("Saldo disponível"));
		System.out.println("Saldo: " + balance);
		String extrato = page.getVerifyExtractText();
		assertTrue(extrato.contains("Abertura de conta"));
		System.out.println("Abertura de conta: " + extrato);
		page.getClickBack();
		Thread.sleep(2000);

		// Tranferência
		page.getButtonTranfer();
		Thread.sleep(2000);
		page.getInputNumber("212");
		Thread.sleep(2000);
		page.getInputDigit("2");
		Thread.sleep(2000);
		page.getInputValue("100");
		Thread.sleep(2000);
		page.getInputDescription("Para mim");
		Thread.sleep(2000);
		page.getClickButtonTransfer();
		Thread.sleep(2000);


		String sucesso = page.getSuccessOrNot();
		assertTrue(sucesso.contains("Conta inválida ou inexistente"));
		System.out.println("Sucesso ?: " + sucesso);


		page.quitDriver();

	}

}
