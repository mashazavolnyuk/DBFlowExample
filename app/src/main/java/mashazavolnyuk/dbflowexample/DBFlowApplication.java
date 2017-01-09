package mashazavolnyuk.dbflowexample;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowLog;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by Dark Maleficent on 08.01.2017.
 */

public class DBFlowApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(new FlowConfig.Builder(this)
                .openDatabasesOnInit(true).build());
        FlowLog.setMinimumLoggingLevel(FlowLog.Level.V);
    }
}
