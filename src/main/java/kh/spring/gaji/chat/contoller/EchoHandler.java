package kh.spring.gaji.chat.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kh.spring.gaji.chat.model.dto.ChatMessageDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
//@RequestMapping("/echo")
public class EchoHandler extends TextWebSocketHandler {

	private List<WebSocketSession> sessionList = new ArrayList<WebSocketSession>();

	// websocket 연결 시
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("aaaaaa");
		// 세션 리스트에 해당 session을 추가
		sessionList.add(session);

		log.info("{} 연결됨 ", session.getId());
	}

	// 클라이언트가 웹소켓 서버로 메시지를 전송했을 때 실행
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		System.out.println("aaaaavvv");
		// TextMessage의 getPayload메소드를 통해 view에서 보낸 메시지(이름, 채팅내용, 방번호)를 msg변수에 담아줌
		String msg = message.getPayload();
		// 메시지를 구분자(",")를 이용하여 잘라서 배열형태로 담아줌 ex) [손은진, 안녕하세요, 5]
		String[] arr = msg.split(",");

		log.info("{} 로부터 {} 받음", session.getId(), message.getPayload());

		// 메시지 출력
		for (WebSocketSession sess : sessionList) {
			// 메시지 출력 시 배열에 담긴 순서대로 이름, 채팅내용, 방번호 전달
			sess.sendMessage(new TextMessage(arr[0]));

		}

		log.info("메시지 보낸사람 : {}", arr[0]);
//		log.info("메시지 보낸사람 : {}", arr[1]);

//		ChatMessageDto chat = new ChatMessageDto();
//		// 메시지 보낸 사람
//		chat.setSenderId(arr[0]);
//		// 채팅내용
//		chat.setMessage(arr[1]);
//		// 방번호
//		chat.setChatNo(0);
//		db저장 dao, service 작성
	}

	// websocket 연결 종료 시
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		sessionList.remove(session);
		log.info("{} 연결 끊김", session.getId());
	}

}