package com.orive.security.interviewScheduler;

import jakarta.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

    void sendEmail(EmailDto emailDto);
    void sendCalenderInvite(CalenderDto calenderDto) throws IOException, MessagingException;
}
