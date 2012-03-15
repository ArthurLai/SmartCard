package com.smartcard.client.main;

import com.smartcard.client.base.Controller;
import com.smartcard.client.base.Manager;
import com.smartcard.client.base.View;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.widgets.Label;

// Manager : Controller 的延伸
public class MainManager extends Manager {

	public MainManager(View parentView, Controller controller) {
	
		super(parentView, controller); // 參數初始完畢
		
	}

	private Label lbl;
	
	@Override
	public void init() { // 剩餘的參數設定、屬性設定
		
		// 繼承變數初始
		view = new MainView(controller);
		
		// 私有變數初始
		lbl = new Label();
		lbl.setContents("Hello Wolrd at 2012-03-15");
		lbl.setLayoutAlign(Alignment.CENTER);
		lbl.setAlign(Alignment.CENTER);
		view.addMember(lbl);
		
		parentView.addMember(view);
		
	}
	
	@Override
	public void show() {
		
		parentView.draw(); // 
		
	}

}
