package hit.coolweather.util;

/**
 * Created by Min on 10/4/2015.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
