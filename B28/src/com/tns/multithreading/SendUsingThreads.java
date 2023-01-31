package com.tns.multithreading;

public class SendUsingThreads extends Thread 
{
	private String message;
	Sender sender;
	SendUsingThreads(String msg, Sender object)
	{
		message = msg;
		sender = object;
		

	}
	synchronized public void run()
	{
	
		synchronized(sender)
	{
		sender.send(Message);
	}
}
}

	




