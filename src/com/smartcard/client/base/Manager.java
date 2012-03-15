package com.smartcard.client.base;

import com.smartcard.client.base.iface.IManager;

public abstract class Manager implements IManager {

	protected View parentView;
	
	protected View view; // 在 manager 初始，等同於在 controller 初始；manager 為 controller 的延伸
	protected Controller controller;
	public Manager(View parentView, Controller controller){
		
		this.parentView = parentView;
		
		this.controller = controller;
		
		init();
		
	}
	
	public abstract void init();
	
	public abstract void show();
	
}
