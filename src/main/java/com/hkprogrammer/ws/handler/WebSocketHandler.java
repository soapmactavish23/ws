package com.hkprogrammer.ws.handler;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class WebSocketHandler extends TextWebSocketHandler {

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("afterConnectionEstablished session id: " + session.getId());

		new Timer().scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				try {
					session.sendMessage(new TextMessage("Olá " + UUID.randomUUID()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}, 2000L, 2000L);

		super.afterConnectionEstablished(session);
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		System.out.println("handleTextMessage session id: " + session.getId());
		super.handleTextMessage(session, message);
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("afterConnectionClosed session id: " + session.getId());
		super.afterConnectionClosed(session, status);
	}

}
