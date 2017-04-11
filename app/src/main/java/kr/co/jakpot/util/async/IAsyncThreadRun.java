package kr.co.jakpot.util.async;

/**
 * Created by jungyunmin on 2017-04-11.
 */

public interface IAsyncThreadRun {
    public AsyncResult threadRun();
    public void cancelAsyncTask();
}
