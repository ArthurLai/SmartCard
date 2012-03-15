package com.smartcard.client.base;

import com.smartcard.client.base.iface.IController;

// 抽象類別就好像是一個中繼類別，先一步把子類別群裡，相同的方法先行實作
// 在透過界面的設計，讓抽象類別的子類別，一定會把剩下的方法實作完畢
public abstract class Controller implements IController {

	protected View parentView; // 每個子類別均有
	protected Controller parentController; // 每個子類別均有
	
	protected Manager manager; // 每個子類別均有
	public Controller(View parentView, Controller parentController){ // 初始參數
		
		this.parentView = parentView;
		this.parentController = parentController;
		
		init();
		
	}
	
	@Override
	public void show() {

		manager.show(); // 使用 manager 的 show()
		
	}
	
	public abstract void init();

}
