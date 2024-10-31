package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.0)",
    comments = "Source: messages.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MessagesGrpc {

  private MessagesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Messages";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.MessagesProto.PostMessageRequest,
      proto.MessagesProto.PostMessageResponse> getPostMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostMessage",
      requestType = proto.MessagesProto.PostMessageRequest.class,
      responseType = proto.MessagesProto.PostMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.MessagesProto.PostMessageRequest,
      proto.MessagesProto.PostMessageResponse> getPostMessageMethod() {
    io.grpc.MethodDescriptor<proto.MessagesProto.PostMessageRequest, proto.MessagesProto.PostMessageResponse> getPostMessageMethod;
    if ((getPostMessageMethod = MessagesGrpc.getPostMessageMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getPostMessageMethod = MessagesGrpc.getPostMessageMethod) == null) {
          MessagesGrpc.getPostMessageMethod = getPostMessageMethod =
              io.grpc.MethodDescriptor.<proto.MessagesProto.PostMessageRequest, proto.MessagesProto.PostMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.MessagesProto.PostMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.MessagesProto.PostMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("PostMessage"))
              .build();
        }
      }
    }
    return getPostMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.MessagesProto.DeleteMessageRequest,
      proto.MessagesProto.DeleteMessageResponse> getDeleteMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMessage",
      requestType = proto.MessagesProto.DeleteMessageRequest.class,
      responseType = proto.MessagesProto.DeleteMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.MessagesProto.DeleteMessageRequest,
      proto.MessagesProto.DeleteMessageResponse> getDeleteMessageMethod() {
    io.grpc.MethodDescriptor<proto.MessagesProto.DeleteMessageRequest, proto.MessagesProto.DeleteMessageResponse> getDeleteMessageMethod;
    if ((getDeleteMessageMethod = MessagesGrpc.getDeleteMessageMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getDeleteMessageMethod = MessagesGrpc.getDeleteMessageMethod) == null) {
          MessagesGrpc.getDeleteMessageMethod = getDeleteMessageMethod =
              io.grpc.MethodDescriptor.<proto.MessagesProto.DeleteMessageRequest, proto.MessagesProto.DeleteMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.MessagesProto.DeleteMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.MessagesProto.DeleteMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("DeleteMessage"))
              .build();
        }
      }
    }
    return getDeleteMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.MessagesProto.GetChatMessagesRequest,
      proto.MessagesProto.GetChatMessagesResponse> getGetChatMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChatMessages",
      requestType = proto.MessagesProto.GetChatMessagesRequest.class,
      responseType = proto.MessagesProto.GetChatMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.MessagesProto.GetChatMessagesRequest,
      proto.MessagesProto.GetChatMessagesResponse> getGetChatMessagesMethod() {
    io.grpc.MethodDescriptor<proto.MessagesProto.GetChatMessagesRequest, proto.MessagesProto.GetChatMessagesResponse> getGetChatMessagesMethod;
    if ((getGetChatMessagesMethod = MessagesGrpc.getGetChatMessagesMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getGetChatMessagesMethod = MessagesGrpc.getGetChatMessagesMethod) == null) {
          MessagesGrpc.getGetChatMessagesMethod = getGetChatMessagesMethod =
              io.grpc.MethodDescriptor.<proto.MessagesProto.GetChatMessagesRequest, proto.MessagesProto.GetChatMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChatMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.MessagesProto.GetChatMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.MessagesProto.GetChatMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("GetChatMessages"))
              .build();
        }
      }
    }
    return getGetChatMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.MessagesProto.EditMessageRequest,
      proto.MessagesProto.EditMessageResponse> getEditMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditMessage",
      requestType = proto.MessagesProto.EditMessageRequest.class,
      responseType = proto.MessagesProto.EditMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.MessagesProto.EditMessageRequest,
      proto.MessagesProto.EditMessageResponse> getEditMessageMethod() {
    io.grpc.MethodDescriptor<proto.MessagesProto.EditMessageRequest, proto.MessagesProto.EditMessageResponse> getEditMessageMethod;
    if ((getEditMessageMethod = MessagesGrpc.getEditMessageMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getEditMessageMethod = MessagesGrpc.getEditMessageMethod) == null) {
          MessagesGrpc.getEditMessageMethod = getEditMessageMethod =
              io.grpc.MethodDescriptor.<proto.MessagesProto.EditMessageRequest, proto.MessagesProto.EditMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.MessagesProto.EditMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.MessagesProto.EditMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("EditMessage"))
              .build();
        }
      }
    }
    return getEditMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.MessagesProto.GetUserLastMessagesRequest,
      proto.MessagesProto.GetUserLastMessagesResponse> getGetUserLastMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserLastMessages",
      requestType = proto.MessagesProto.GetUserLastMessagesRequest.class,
      responseType = proto.MessagesProto.GetUserLastMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.MessagesProto.GetUserLastMessagesRequest,
      proto.MessagesProto.GetUserLastMessagesResponse> getGetUserLastMessagesMethod() {
    io.grpc.MethodDescriptor<proto.MessagesProto.GetUserLastMessagesRequest, proto.MessagesProto.GetUserLastMessagesResponse> getGetUserLastMessagesMethod;
    if ((getGetUserLastMessagesMethod = MessagesGrpc.getGetUserLastMessagesMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getGetUserLastMessagesMethod = MessagesGrpc.getGetUserLastMessagesMethod) == null) {
          MessagesGrpc.getGetUserLastMessagesMethod = getGetUserLastMessagesMethod =
              io.grpc.MethodDescriptor.<proto.MessagesProto.GetUserLastMessagesRequest, proto.MessagesProto.GetUserLastMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserLastMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.MessagesProto.GetUserLastMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.MessagesProto.GetUserLastMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("GetUserLastMessages"))
              .build();
        }
      }
    }
    return getGetUserLastMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessagesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagesStub>() {
        @java.lang.Override
        public MessagesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagesStub(channel, callOptions);
        }
      };
    return MessagesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessagesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagesBlockingStub>() {
        @java.lang.Override
        public MessagesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagesBlockingStub(channel, callOptions);
        }
      };
    return MessagesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessagesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagesFutureStub>() {
        @java.lang.Override
        public MessagesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagesFutureStub(channel, callOptions);
        }
      };
    return MessagesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void postMessage(proto.MessagesProto.PostMessageRequest request,
        io.grpc.stub.StreamObserver<proto.MessagesProto.PostMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostMessageMethod(), responseObserver);
    }

    /**
     */
    default void deleteMessage(proto.MessagesProto.DeleteMessageRequest request,
        io.grpc.stub.StreamObserver<proto.MessagesProto.DeleteMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMessageMethod(), responseObserver);
    }

    /**
     */
    default void getChatMessages(proto.MessagesProto.GetChatMessagesRequest request,
        io.grpc.stub.StreamObserver<proto.MessagesProto.GetChatMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChatMessagesMethod(), responseObserver);
    }

    /**
     */
    default void editMessage(proto.MessagesProto.EditMessageRequest request,
        io.grpc.stub.StreamObserver<proto.MessagesProto.EditMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditMessageMethod(), responseObserver);
    }

    /**
     */
    default void getUserLastMessages(proto.MessagesProto.GetUserLastMessagesRequest request,
        io.grpc.stub.StreamObserver<proto.MessagesProto.GetUserLastMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserLastMessagesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Messages.
   */
  public static abstract class MessagesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MessagesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Messages.
   */
  public static final class MessagesStub
      extends io.grpc.stub.AbstractAsyncStub<MessagesStub> {
    private MessagesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagesStub(channel, callOptions);
    }

    /**
     */
    public void postMessage(proto.MessagesProto.PostMessageRequest request,
        io.grpc.stub.StreamObserver<proto.MessagesProto.PostMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMessage(proto.MessagesProto.DeleteMessageRequest request,
        io.grpc.stub.StreamObserver<proto.MessagesProto.DeleteMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChatMessages(proto.MessagesProto.GetChatMessagesRequest request,
        io.grpc.stub.StreamObserver<proto.MessagesProto.GetChatMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChatMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editMessage(proto.MessagesProto.EditMessageRequest request,
        io.grpc.stub.StreamObserver<proto.MessagesProto.EditMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserLastMessages(proto.MessagesProto.GetUserLastMessagesRequest request,
        io.grpc.stub.StreamObserver<proto.MessagesProto.GetUserLastMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserLastMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Messages.
   */
  public static final class MessagesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MessagesBlockingStub> {
    private MessagesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagesBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.MessagesProto.PostMessageResponse postMessage(proto.MessagesProto.PostMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.MessagesProto.DeleteMessageResponse deleteMessage(proto.MessagesProto.DeleteMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.MessagesProto.GetChatMessagesResponse getChatMessages(proto.MessagesProto.GetChatMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChatMessagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.MessagesProto.EditMessageResponse editMessage(proto.MessagesProto.EditMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.MessagesProto.GetUserLastMessagesResponse getUserLastMessages(proto.MessagesProto.GetUserLastMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserLastMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Messages.
   */
  public static final class MessagesFutureStub
      extends io.grpc.stub.AbstractFutureStub<MessagesFutureStub> {
    private MessagesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.MessagesProto.PostMessageResponse> postMessage(
        proto.MessagesProto.PostMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.MessagesProto.DeleteMessageResponse> deleteMessage(
        proto.MessagesProto.DeleteMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.MessagesProto.GetChatMessagesResponse> getChatMessages(
        proto.MessagesProto.GetChatMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChatMessagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.MessagesProto.EditMessageResponse> editMessage(
        proto.MessagesProto.EditMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.MessagesProto.GetUserLastMessagesResponse> getUserLastMessages(
        proto.MessagesProto.GetUserLastMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserLastMessagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_MESSAGE = 0;
  private static final int METHODID_DELETE_MESSAGE = 1;
  private static final int METHODID_GET_CHAT_MESSAGES = 2;
  private static final int METHODID_EDIT_MESSAGE = 3;
  private static final int METHODID_GET_USER_LAST_MESSAGES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST_MESSAGE:
          serviceImpl.postMessage((proto.MessagesProto.PostMessageRequest) request,
              (io.grpc.stub.StreamObserver<proto.MessagesProto.PostMessageResponse>) responseObserver);
          break;
        case METHODID_DELETE_MESSAGE:
          serviceImpl.deleteMessage((proto.MessagesProto.DeleteMessageRequest) request,
              (io.grpc.stub.StreamObserver<proto.MessagesProto.DeleteMessageResponse>) responseObserver);
          break;
        case METHODID_GET_CHAT_MESSAGES:
          serviceImpl.getChatMessages((proto.MessagesProto.GetChatMessagesRequest) request,
              (io.grpc.stub.StreamObserver<proto.MessagesProto.GetChatMessagesResponse>) responseObserver);
          break;
        case METHODID_EDIT_MESSAGE:
          serviceImpl.editMessage((proto.MessagesProto.EditMessageRequest) request,
              (io.grpc.stub.StreamObserver<proto.MessagesProto.EditMessageResponse>) responseObserver);
          break;
        case METHODID_GET_USER_LAST_MESSAGES:
          serviceImpl.getUserLastMessages((proto.MessagesProto.GetUserLastMessagesRequest) request,
              (io.grpc.stub.StreamObserver<proto.MessagesProto.GetUserLastMessagesResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPostMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.MessagesProto.PostMessageRequest,
              proto.MessagesProto.PostMessageResponse>(
                service, METHODID_POST_MESSAGE)))
        .addMethod(
          getDeleteMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.MessagesProto.DeleteMessageRequest,
              proto.MessagesProto.DeleteMessageResponse>(
                service, METHODID_DELETE_MESSAGE)))
        .addMethod(
          getGetChatMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.MessagesProto.GetChatMessagesRequest,
              proto.MessagesProto.GetChatMessagesResponse>(
                service, METHODID_GET_CHAT_MESSAGES)))
        .addMethod(
          getEditMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.MessagesProto.EditMessageRequest,
              proto.MessagesProto.EditMessageResponse>(
                service, METHODID_EDIT_MESSAGE)))
        .addMethod(
          getGetUserLastMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.MessagesProto.GetUserLastMessagesRequest,
              proto.MessagesProto.GetUserLastMessagesResponse>(
                service, METHODID_GET_USER_LAST_MESSAGES)))
        .build();
  }

  private static abstract class MessagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessagesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.MessagesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Messages");
    }
  }

  private static final class MessagesFileDescriptorSupplier
      extends MessagesBaseDescriptorSupplier {
    MessagesFileDescriptorSupplier() {}
  }

  private static final class MessagesMethodDescriptorSupplier
      extends MessagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MessagesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MessagesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessagesFileDescriptorSupplier())
              .addMethod(getPostMessageMethod())
              .addMethod(getDeleteMessageMethod())
              .addMethod(getGetChatMessagesMethod())
              .addMethod(getEditMessageMethod())
              .addMethod(getGetUserLastMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
