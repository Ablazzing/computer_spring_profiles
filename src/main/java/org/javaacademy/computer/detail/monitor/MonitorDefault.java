package org.javaacademy.computer.detail.monitor;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(value = {MonitorSony.class, MonitorLg.class})
public class MonitorDefault extends Monitor {

    @Override
    public String toString() {
        return "MonitorDefault{" +
               "name='" + name + '\'' +
               '}';
    }
}
