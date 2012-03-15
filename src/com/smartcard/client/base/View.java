package com.smartcard.client.base;

import com.smartcard.client.base.iface.IView;
import com.smartgwt.client.widgets.layout.VLayout;

public abstract class View extends VLayout implements IView {

	protected Controller controller;
	public View(Controller controller){
		
		this.controller = controller;
		
		init(); // 建構子剩餘的參數設定、屬性設定，由子類別實作
		
	}
	
	public abstract void init();
	
}
