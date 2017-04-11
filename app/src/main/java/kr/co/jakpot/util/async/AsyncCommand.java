package kr.co.jakpot.util.async;

import android.content.Context;

/**
 * Created by jungyunmin on 2017-04-11.
 */

public class AsyncCommand implements IAsyncThreadRun {

    public Context context = null;
    public boolean isCancelled = false;
    public final static int RESULT__OK = 1;
    public final static int RESULT__FAIL = 2;
    public final static int RESULT__CANCELLED = 3;

    public final static int RESULT__FAIL_SESSION_INVALIDATED = 101;
    public final static int RESULT__FAIL_SESSION_INACTIVED = 102;

    public AsyncCommand(Context context){
        this.context = context;
    }

    @Override
    public AsyncResult threadRun() {
        AsyncResult result = new AsyncResult();
        result.resultCode = RESULT__OK;
        result.result = "";
        result.nextCommand = null;

        return result;
    }

    public OnAsyncResultListener mOnAsyncResultListener;

    public void setOnAsyncResultListener(OnAsyncResultListener listener)
    {
        mOnAsyncResultListener = listener;
    }

    public interface OnAsyncResultListener
    {
        public void onAsyncResult(AsyncResult result);
    }

    @Override
    public void cancelAsyncTask() {
        this.isCancelled = true;
    }
}
