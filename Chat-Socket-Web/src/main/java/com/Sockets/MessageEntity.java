package com.Sockets;

public class MessageEntity {

	private String content;
	private String sender;
	private MassMessage massMessage;
	public enum MassMessage {
		CHAT,
		LEAVE,
		JOIN
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public MassMessage getMassMessage() {
		return massMessage;
	}
	public void setMassMessage(MassMessage massMessage) {
		this.massMessage = massMessage;
	}
	
}
