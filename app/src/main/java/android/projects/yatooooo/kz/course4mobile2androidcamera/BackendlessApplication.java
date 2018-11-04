package android.projects.yatooooo.kz.course4mobile2androidcamera;

import android.app.Application;
import android.os.DeadObjectException;

import com.backendless.Backendless;

public class BackendlessApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl(Defaults.SERVER_URL);
        Backendless.initApp(getApplicationContext(), Defaults.APPLICATION_ID, Defaults.API_KEY);
    }
}
