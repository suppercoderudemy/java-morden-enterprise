package com.udemy;

import com.udemy.BookProto.BookControllerGrpc;
import com.udemy.BookProto.BookOuterClass;
import io.grpc.stub.StreamObserver;

public class BookServiceImpl extends BookControllerGrpc.BookControllerImplBase {
  @Override
  public void createBook(
      BookOuterClass.CreateBookRequest request,
      StreamObserver<BookOuterClass.CreateBookResponse> responseObserver) {
    // super.createBook(request, responseObserver);
    // Need to call business layer to do something
    System.out.println("Create book successfully");
    BookOuterClass.CreateBookResponse createBookResponse =
        BookOuterClass.CreateBookResponse.newBuilder().setMsg("Create book successfully").build();
    responseObserver.onNext(createBookResponse);
    responseObserver.onCompleted();
  }

    @Override
    public void getBooks(BookOuterClass.GetBookRequest request, StreamObserver<BookOuterClass.GetBookResponse> responseObserver) {
        super.getBooks(request, responseObserver);
    }
}
