package com.example.CRUDpra.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostRequest {
    private String title;
    private String content;
    private LocalDateTime createdAt;
}
