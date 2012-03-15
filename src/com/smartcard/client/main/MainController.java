package com.smartcard.client.main;

import com.smartcard.client.base.Controller;
import com.smartcard.client.base.Manager;
import com.smartcard.client.base.View;

public class MainController extends Controller {

	public MainController(View parentView, Controller parentController) { // 父類別有的建構子，子類別也要實作
		
		super(parentView, parentController);
		
	}

	@Override
	public void init() { // 因為父類別沒有實作，所以子類別一定要實作
		
		manager = new MainManager(parentView, this);
		
	}

}
