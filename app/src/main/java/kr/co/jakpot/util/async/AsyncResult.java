package kr.co.jakpot.util.async;

/**
 * Created by jungyunmin on 2017-04-11.
 */

public class AsyncResult {
    public int resultCode = 0;
    public String result =  "";
    public AsyncCommand nextCommand = null;
    public Object resultObject = null;
}
