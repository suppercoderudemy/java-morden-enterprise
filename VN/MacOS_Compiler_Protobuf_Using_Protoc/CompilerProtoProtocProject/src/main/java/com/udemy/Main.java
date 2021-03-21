package com.udemy;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080).addService(new BookServiceImpl())
                .build();
        server.start();
        System.out.println("Book grpc server started");
        server.awaitTermination();
    }
}
