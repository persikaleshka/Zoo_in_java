package com.example;

import com.google.inject.AbstractModule;

public class ZooModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(VeterinaryClinic.class).toInstance(new VeterinaryClinic());
        bind(Zoo.class);
    }
}
