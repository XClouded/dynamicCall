package cn.uc.gamesdk.core;

import android.app.Activity;
import cn.uc.gamesdk.api.apiLogin;
import cn.uc.gamesdk.iconst.CApi;
import cn.uc.gamesdk.iface.IActivityControl;
import cn.uc.gamesdk.iface.IDexClassLoader;
import cn.uc.gamesdk.iface.IDispatcher;
import cn.uc.gamesdk.ilistener.UCCallbackListener;
import cn.uc.gamesdk.layout.ActivityLayout;

public class Dispatcher implements IDispatcher {
	private static final String CLASS_NAME = "DISPATCHER FROM CORE";

	private static Dispatcher _dispatcher = null;
	private static IDexClassLoader _classLoader = null;

	public static Dispatcher getInstance() {
		if (null == _dispatcher)
			_dispatcher = new Dispatcher();

		return _dispatcher;
	}

	@Override
	public boolean loadClass(String clazz) {
		return false;
	}

	@Override
	public boolean loadMethodFromClass(String apiName,
			UCCallbackListener<String> listener, Object... params) {
		if (CApi.API_LOGIN.equals(apiName)) {
			apiLogin.setLoingMessage(params[0].toString());// 调用 DEX内部的方法
			listener.callback(0, "I am from core dispatcher");
			
			// 调用外部DEX类的方法
			IDispatcher classDispatcher = _classLoader.Creator(CApi.API_UPDATE);
			classDispatcher.loadMethodFromClass("h5",listener, new Object[] {});
		}

		return true;
	}

	@Override
	public void setClassLoader(IDexClassLoader classLoader) {
		_classLoader = classLoader;
	}

	@Override
	public void invokeActivity(IActivityControl activity) {
		Activity mainActivity=(Activity)activity;
		ActivityLayout layout=new ActivityLayout(mainActivity);
		mainActivity.setContentView(layout);
	}
}
