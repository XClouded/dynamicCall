package cn.uc.gamesdk.update;

import android.util.Log;
import cn.uc.gamesdk.iface.IDexClassLoader;
import cn.uc.gamesdk.iface.IDispatcher;
import cn.uc.gamesdk.ilistener.UCCallbackListener;

public class Dispatcher implements IDispatcher {
	private static final String CLASS_NAME="DISPATCHER FROM UPDATE";
	
	private static final String CLASS_UPDATE_H5 = "h5";
	private static final String CLASS_UPDATE_CORE = "core";

	private static Dispatcher _dispatcher = null;
	private static IDexClassLoader _classLoader = null;

	public static Dispatcher getInstance() {
		if (null == _dispatcher)
			_dispatcher = new Dispatcher();

		return _dispatcher;
	}

	@Override
	public void setClassLoader(IDexClassLoader classLoader) {
		_classLoader = classLoader;
	}
	
	public boolean loadClass(String clazz) {

		return false;
	}

	@Override
	public boolean loadMethodFromClass(String apiName,UCCallbackListener<String> listener, Object... params) {
		Log.d(CLASS_NAME,apiName);
		listener.callback(0, "I am from update dispatcher");
		return false;
	}

}
