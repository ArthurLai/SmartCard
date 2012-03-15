package com.smartcard.client;

import com.smartcard.client.base.Controller;
import com.smartcard.client.base.View;
import com.smartgwt.client.widgets.layout.VLayout;

public class RootLayout extends View {

	public RootLayout(Controller controller){ // root : controller 為 null
		
		super(controller);
		
	}

	@Override
	public void init() {
		
		this.setWidth100();
		this.setHeight100();
		
	}
	
}
