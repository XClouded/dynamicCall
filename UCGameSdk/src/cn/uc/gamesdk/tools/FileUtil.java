package cn.uc.gamesdk.tools;

import android.content.Context;
import android.content.res.AssetManager;

public class FileUtil {
	public static String getCachePath() {
		final Context ctx = GlobalVars.context;
		return ctx.getCacheDir().getAbsolutePath();
	}

	public static String getFilePath() {
		final Context ctx = GlobalVars.context;
		return ctx.getFilesDir().getAbsolutePath();
	}

	public static AssetManager getAssetManager() {
		final Context ctx = GlobalVars.context;
		return ctx.getAssets();
	}
}
