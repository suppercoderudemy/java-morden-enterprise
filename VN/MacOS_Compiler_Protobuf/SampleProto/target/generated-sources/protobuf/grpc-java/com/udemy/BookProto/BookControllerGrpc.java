package com.udemy.BookProto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: Book.proto")
public final class BookControllerGrpc {

  private BookControllerGrpc() {}

  public static final String SERVICE_NAME = "BookController";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.udemy.BookProto.BookOuterClass.CreateBookRequest,
      com.udemy.BookProto.BookOuterClass.CreateBookResponse> getCreateBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBook",
      requestType = com.udemy.BookProto.BookOuterClass.CreateBookRequest.class,
      responseType = com.udemy.BookProto.BookOuterClass.CreateBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.udemy.BookProto.BookOuterClass.CreateBookRequest,
      com.udemy.BookProto.BookOuterClass.CreateBookResponse> getCreateBookMethod() {
    io.grpc.MethodDescriptor<com.udemy.BookProto.BookOuterClass.CreateBookRequest, com.udemy.BookProto.BookOuterClass.CreateBookResponse> getCreateBookMethod;
    if ((getCreateBookMethod = BookControllerGrpc.getCreateBookMethod) == null) {
      synchronized (BookControllerGrpc.class) {
        if ((getCreateBookMethod = BookControllerGrpc.getCreateBookMethod) == null) {
          BookControllerGrpc.getCreateBookMethod = getCreateBookMethod = 
              io.grpc.MethodDescriptor.<com.udemy.BookProto.BookOuterClass.CreateBookRequest, com.udemy.BookProto.BookOuterClass.CreateBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookController", "CreateBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.udemy.BookProto.BookOuterClass.CreateBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.udemy.BookProto.BookOuterClass.CreateBookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookControllerMethodDescriptorSupplier("CreateBook"))
                  .build();
          }
        }
     }
     return getCreateBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.udemy.BookProto.BookOuterClass.GetBookRequest,
      com.udemy.BookProto.BookOuterClass.GetBookResponse> getGetBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBooks",
      requestType = com.udemy.BookProto.BookOuterClass.GetBookRequest.class,
      responseType = com.udemy.BookProto.BookOuterClass.GetBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.udemy.BookProto.BookOuterClass.GetBookRequest,
      com.udemy.BookProto.BookOuterClass.GetBookResponse> getGetBooksMethod() {
    io.grpc.MethodDescriptor<com.udemy.BookProto.BookOuterClass.GetBookRequest, com.udemy.BookProto.BookOuterClass.GetBookResponse> getGetBooksMethod;
    if ((getGetBooksMethod = BookControllerGrpc.getGetBooksMethod) == null) {
      synchronized (BookControllerGrpc.class) {
        if ((getGetBooksMethod = BookControllerGrpc.getGetBooksMethod) == null) {
          BookControllerGrpc.getGetBooksMethod = getGetBooksMethod = 
              io.grpc.MethodDescriptor.<com.udemy.BookProto.BookOuterClass.GetBookRequest, com.udemy.BookProto.BookOuterClass.GetBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookController", "GetBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.udemy.BookProto.BookOuterClass.GetBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.udemy.BookProto.BookOuterClass.GetBookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookControllerMethodDescriptorSupplier("GetBooks"))
                  .build();
          }
        }
     }
     return getGetBooksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookControllerStub newStub(io.grpc.Channel channel) {
    return new BookControllerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookControllerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookControllerFutureStub(channel);
  }

  /**
   */
  public static abstract class BookControllerImplBase implements io.grpc.BindableService {

    /**
     */
    public void createBook(com.udemy.BookProto.BookOuterClass.CreateBookRequest request,
        io.grpc.stub.StreamObserver<com.udemy.BookProto.BookOuterClass.CreateBookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBookMethod(), responseObserver);
    }

    /**
     */
    public void getBooks(com.udemy.BookProto.BookOuterClass.GetBookRequest request,
        io.grpc.stub.StreamObserver<com.udemy.BookProto.BookOuterClass.GetBookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBooksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.udemy.BookProto.BookOuterClass.CreateBookRequest,
                com.udemy.BookProto.BookOuterClass.CreateBookResponse>(
                  this, METHODID_CREATE_BOOK)))
          .addMethod(
            getGetBooksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.udemy.BookProto.BookOuterClass.GetBookRequest,
                com.udemy.BookProto.BookOuterClass.GetBookResponse>(
                  this, METHODID_GET_BOOKS)))
          .build();
    }
  }

  /**
   */
  public static final class BookControllerStub extends io.grpc.stub.AbstractStub<BookControllerStub> {
    private BookControllerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookControllerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookControllerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookControllerStub(channel, callOptions);
    }

    /**
     */
    public void createBook(com.udemy.BookProto.BookOuterClass.CreateBookRequest request,
        io.grpc.stub.StreamObserver<com.udemy.BookProto.BookOuterClass.CreateBookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBooks(com.udemy.BookProto.BookOuterClass.GetBookRequest request,
        io.grpc.stub.StreamObserver<com.udemy.BookProto.BookOuterClass.GetBookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBooksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookControllerBlockingStub extends io.grpc.stub.AbstractStub<BookControllerBlockingStub> {
    private BookControllerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookControllerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookControllerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookControllerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.udemy.BookProto.BookOuterClass.CreateBookResponse createBook(com.udemy.BookProto.BookOuterClass.CreateBookRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.udemy.BookProto.BookOuterClass.GetBookResponse getBooks(com.udemy.BookProto.BookOuterClass.GetBookRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBooksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookControllerFutureStub extends io.grpc.stub.AbstractStub<BookControllerFutureStub> {
    private BookControllerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookControllerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookControllerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookControllerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.udemy.BookProto.BookOuterClass.CreateBookResponse> createBook(
        com.udemy.BookProto.BookOuterClass.CreateBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.udemy.BookProto.BookOuterClass.GetBookResponse> getBooks(
        com.udemy.BookProto.BookOuterClass.GetBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBooksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BOOK = 0;
  private static final int METHODID_GET_BOOKS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BOOK:
          serviceImpl.createBook((com.udemy.BookProto.BookOuterClass.CreateBookRequest) request,
              (io.grpc.stub.StreamObserver<com.udemy.BookProto.BookOuterClass.CreateBookResponse>) responseObserver);
          break;
        case METHODID_GET_BOOKS:
          serviceImpl.getBooks((com.udemy.BookProto.BookOuterClass.GetBookRequest) request,
              (io.grpc.stub.StreamObserver<com.udemy.BookProto.BookOuterClass.GetBookResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BookControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookControllerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.udemy.BookProto.BookOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookController");
    }
  }

  private static final class BookControllerFileDescriptorSupplier
      extends BookControllerBaseDescriptorSupplier {
    BookControllerFileDescriptorSupplier() {}
  }

  private static final class BookControllerMethodDescriptorSupplier
      extends BookControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookControllerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookControllerFileDescriptorSupplier())
              .addMethod(getCreateBookMethod())
              .addMethod(getGetBooksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
