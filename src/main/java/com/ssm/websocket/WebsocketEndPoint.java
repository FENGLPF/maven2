package com.ssm.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * websocket������
 * @author cheny
 *
 */

public class WebsocketEndPoint extends TextWebSocketHandler {

      @Override
      protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        super.handleTextMessage(session, message);

        TextMessage returnMessage = new TextMessage(message.getPayload()+" 发送的数据");
        System.out.println("返回的信息"+returnMessage);
        session.sendMessage(returnMessage);
      }
}
