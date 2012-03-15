package com.smartcard.client.main;

import com.smartcard.client.base.Controller;
import com.smartcard.client.base.View;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.widgets.layout.VLayout;

public class MainView extends View {

	public MainView(Controller controller){
		
		super(controller);
		
	}
	
	public void init(){
		
		this.setWidth100();
		this.setHeight100();
		
		this.setLayoutAlign(Alignment.CENTER);
		this.setAlign(Alignment.CENTER);
		
	}
	
}
