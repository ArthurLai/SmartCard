package com.smartcard.client;

import com.google.gwt.core.client.EntryPoint;
import com.smartcard.client.base.Controller;
import com.smartcard.client.main.MainController;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SmartCard implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		RootLayout rootLayout = new RootLayout(null); // root layout - view container
		
		Controller mainController = new MainController(rootLayout, null);
		mainController.show(); // 呼叫 MainManager 的 show() 
		
	}
	
}
