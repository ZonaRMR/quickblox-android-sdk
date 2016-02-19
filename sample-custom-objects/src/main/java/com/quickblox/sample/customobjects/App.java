package com.quickblox.sample.customobjects;

import com.quickblox.core.QBSettings;
import com.quickblox.sample.core.CoreApp;
import com.quickblox.sample.customobjects.definition.Consts;

public class App extends CoreApp {

    @Override
    public void onCreate() {
        super.onCreate();

        QBSettings.getInstance().init(this, Consts.APP_ID, Consts.AUTH_KEY, Consts.AUTH_SECRET);
        QBSettings.getInstance().setAccountKey(Consts.ACCOUNT_KEY);
    }
}