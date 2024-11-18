package com.s576air.webchat.service;

import com.s576air.webchat.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private final ChatRepository chatRepository;

    @Autowired
    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public boolean saveTextMessage(Long chatroomId, Long userId, String text) {
        return chatRepository.addTextChat(chatroomId, userId, text);
    }

    public void getChats() {
        //
    }

    public void getLastChats() {
        //
    }
}
