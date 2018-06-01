package com.ssm.websocket;

import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

/**
 * websocket握手类
 * @author cheny
 *
 */
public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor{
        /**
         * 这个拦截器是因为使用websocket的时候springmvc获取不到session中的对象，可以在这拦截器中取出来处理
         */
      @Override
      public boolean beforeHandshake(ServerHttpRequest request,ServerHttpResponse response, WebSocketHandler wsHandler,
          Map<String, Object> attributes) throws Exception {
        System.out.println("开始拦截类");
        return super.beforeHandshake(request, response, wsHandler, attributes);
      }

      @Override
      public void afterHandshake(ServerHttpRequest request,ServerHttpResponse response, WebSocketHandler wsHandler,
          Exception ex) {
        System.out.println("结束拦截类");
        super.afterHandshake(request, response, wsHandler, ex);
      }

    }