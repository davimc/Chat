package com.github.davimc.Chat.model;

import com.github.davimc.Chat.model.enums.MessageType;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage {
    private String sender;
    private String content;
    private MessageType type;
}
