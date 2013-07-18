package cn.uc.gamesdk.ilistener;

public interface UCCallbackListener<T> {
	void callback(int statuscode, T data);
}
