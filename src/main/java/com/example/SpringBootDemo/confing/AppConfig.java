package com.example.SpringBootDemo.confing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.LoadTimeWeavingConfigurer;
import org.springframework.context.weaving.DefaultContextLoadTimeWeaver;
import org.springframework.instrument.classloading.LoadTimeWeaver;

//@Configuration
//@EnableLoadTimeWeaving(aspectjWeaving = EnableLoadTimeWeaving.AspectJWeaving.AUTODETECT)
public class AppConfig implements LoadTimeWeavingConfigurer {

    @Override
    public LoadTimeWeaver getLoadTimeWeaver() {
        DefaultContextLoadTimeWeaver defaultContextLoadTimeWeaver = new DefaultContextLoadTimeWeaver();
//        defaultContextLoadTimeWeaver.addTransformer();
        return defaultContextLoadTimeWeaver;
    }
}