package cn.uc.gamesdk;

import java.util.Map;

import cn.uc.gamesdk.iface.IDispatcher;

public class UCGameSdk {

//	private static IDispatcher[] _dispatchers = null;
	
	private static Map<String, IDispatcher> dexLoaderMap = null;
	
	public static boolean init()
	{
		
		dexLoaderMap = new HashMap<String, IDispatcher>();
		return false;
	}
}
