package cn.uc.gamesdk.update;

import android.os.Bundle;
import cn.uc.gamesdk.iface.IActivityControl;
import cn.uc.gamesdk.iface.IDexClassLoader;
import cn.uc.gamesdk.iface.IDispatcher;
import cn.uc.gamesdk.ilistener.SdkCallbackListener;

public class Dispatcher implements IDispatcher {
	private static final String CLASS_NAME = "DISPATCHER FROM UPDATE";

	private static final String CLASS_UPDATE_H5 = "h5";
	private static final String CLASS_UPDATE_CORE = "core";

	private static Dispatcher _dispatcher = null;
	private static IDexClassLoader _classLoader = null;
	private SdkCallbackListener sdkCallBackListener = null;

	public static Dispatcher getInstance() {
		if (null == _dispatcher) {
			_dispatcher = new Dispatcher();
		}

		return _dispatcher;
	}

	public boolean loadClass(String clazz) {

		return false;
	}

	@Override
	public void invokeActivity(IActivityControl activity) {

	}

	@Override
	public Bundle loadMethodFromClass(String apiName, Bundle data) {

		return null;
	}

	@Override
	public Bundle loadMethodFromClass(String apiName) {
		return loadMethodFromClass(apiName,null);
	}
	
	@Override
	public void registerCallback(SdkCallbackListener listener) {
		sdkCallBackListener = listener;
	}

	public SdkCallbackListener getRegisterCallback() {
		return sdkCallBackListener;
	}
}
