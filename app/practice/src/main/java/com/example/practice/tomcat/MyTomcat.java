package com.example.practice.tomcat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: practice
 * @Date: 2019/3/6 20:24
 * @Author: Yi.Liu
 * @Description:
 */
public class MyTomcat {

    public static void main(String[] args) {

        try {
            ServerSocket socket = new ServerSocket(8080);
            Socket accept = socket.accept();
            accept.getKeepAlive();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
