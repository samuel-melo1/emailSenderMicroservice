package com.ms.emailsender.dtos;

import java.util.UUID;

public record EmailRecordDto(Integer userId,
                             String emailTo,
                             String subject,
                             String text) {
}
