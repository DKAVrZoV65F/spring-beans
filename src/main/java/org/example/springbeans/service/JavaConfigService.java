package org.example.springbeans.service;

public class JavaConfigService {

    private final String timeOfInit;
    private Integer dayOfMonth;

    public JavaConfigService(String timeOfInit) {
        this.timeOfInit = timeOfInit;
    }

    public String hello() {
        return "Hello from JavaConfig! time:" + timeOfInit + " dayOfMonth: " + dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }
}
