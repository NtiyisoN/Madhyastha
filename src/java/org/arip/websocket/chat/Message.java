package org.arip.websocket.chat;

import javax.servlet.http.HttpSession;

/**
 * Created by Arip Hidayat on 21/02/2016.
 */
public class Message {

    private String from;
    private String to;
    private String content;

    @Override
    public String toString() {
        return super.toString();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    void setFrom(HttpSession httpsession) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
