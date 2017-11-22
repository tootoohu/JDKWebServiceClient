package com.service;

import com.service.HelloWsImpl;
import com.service.HelloWsImplService;

public class ClientTest {

    public static void main(String[] args) {
        HelloWsImplService helloWsImplService=new HelloWsImplService();
        HelloWsImpl helloWsImpl= helloWsImplService.getHelloWsImplPort();
        String result=helloWsImpl.getValue("Huge");
        System.out.println("-----："+result);
    }
}
