package spice.in.myapplication;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.facebook.drawee.backends.pipeline.Fresco;

public class AsyncTaskActivity extends AppCompatActivity {

    Button buttonStart;
    ProgressBar progressBar1, progressBar2, progressBar3, progressBar4, progressBar5;
    AsyncTask asyncTask1, asyncTask2, asyncTask3, asyncTask4, asyncTask5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
        Fresco.initialize(this);

        progressBar1 = (ProgressBar)findViewById(R.id.progressbar1);
        progressBar2 = (ProgressBar)findViewById(R.id.progressbar2);
        progressBar3 = (ProgressBar)findViewById(R.id.progressbar3);
        progressBar4 = (ProgressBar)findViewById(R.id.progressbar4);
        progressBar5 = (ProgressBar)findViewById(R.id.progressbar5);

        buttonStart=(Button)findViewById(R.id.start);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                asyncTask1=new AsyncTask(progressBar1);
                asyncTask1.execute();

                asyncTask2=new AsyncTask(progressBar2);
                asyncTask2.execute();

                asyncTask3=new AsyncTask(progressBar3);
                asyncTask3.execute();

                asyncTask4=new AsyncTask(progressBar4);
                StartAsyncTaskInParallel(asyncTask4);

                asyncTask5=new AsyncTask(progressBar5);
                StartAsyncTaskInParallel(asyncTask5);

            }
        });
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void StartAsyncTaskInParallel(AsyncTask asyncTask){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        }else{
//            asyncTask.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR);
           asyncTask.execute();
//            asyncTask.cancel(true);
        }
    }


    public class AsyncTask extends android.os.AsyncTask<Void,Integer,Void>{
        ProgressBar progressBar;
        public  AsyncTask(ProgressBar progressBar){
            this.progressBar=progressBar;

        }
        @Override
        protected Void doInBackground(Void...params) {
        for (int i=0; i<100; i++){
            publishProgress(i);
            SystemClock.sleep(100);

        }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer...values) {
           progressBar.setProgress(values[0]);
        }
    }
}
