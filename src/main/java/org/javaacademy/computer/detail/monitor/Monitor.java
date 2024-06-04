package org.javaacademy.computer.detail.monitor;

import org.springframework.beans.factory.annotation.Value;

public abstract class Monitor {
    @Value("${monitor.name}")
    protected String name;


}
