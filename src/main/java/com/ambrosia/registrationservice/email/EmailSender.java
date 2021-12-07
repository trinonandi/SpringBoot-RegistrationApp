package com.ambrosia.registrationservice.email;

public interface EmailSender {
    void send(String to, String email);
}
