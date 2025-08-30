package org.example.springbeans.service;

public class HelloXmlService {

    private UtilsService utilsService;

    public String hello() {
        return utilsService.append("hello from Xml");
    }

    public void setUtilsService(UtilsService utilsService) {
        this.utilsService = utilsService;
    }
}
