package cn.uc.gamesdk.update;

import java.util.Map;

import android.os.Bundle;
import cn.uc.gamesdk.iface.IActivityControl;
import cn.uc.gamesdk.iface.IDispatcher;
import cn.uc.gamesdk.ilistener.SdkCallbackListener;

public class Dispatcher implements IDispatcher {
	private static final String CLASS_NAME = "DISPATCHER FROM UPDATE";

	private static final String CLASS_UPDATE_H5 = "h5";
	private static final String CLASS_UPDATE_CORE = "core";

//	private static Dispatcher _dispatcher = null;
	private SdkCallbackListener sdkCallBackListener = null;
	private Map<String, IDispatcher> dispatcherMap = null;

//	public static Dispatcher getInstance() {
//		if (null == _dispatcher) {
//			_dispatcher = new Dispatcher();
//		}
//
//		return _dispatcher;
//	}

	public boolean loadClass(String clazz) {

		return false;
	}

	@Override
	public void invokeActivity(IActivityControl activity) {

	}

	@Override
	public Bundle apiInvoke(String apiName, Bundle data) {
		data.putString("sid", "message from update.dex");
		return data;
	}

	@Override
	public Bundle apiInvoke(String apiName) {
		return apiInvoke(apiName, null);
	}

	@Override
	public void register(SdkCallbackListener listener,
			Map<String, IDispatcher> dispatcherMap) {
		this.sdkCallBackListener = listener;
		this.dispatcherMap = dispatcherMap;
	}

	public SdkCallbackListener getRegisterCallback() {
		return sdkCallBackListener;
	}
}
