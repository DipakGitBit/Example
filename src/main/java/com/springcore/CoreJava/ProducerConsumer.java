package com.springcore.CoreJava;

import java.util.LinkedList;
import java.lang.Thread;

public class ProducerConsumer {
	private LinkedList<Integer> buffer = new LinkedList<>();
	private final int BUFFER_CAPACITY = 5;

	public static void main(String[] args) {
		ProducerConsumer example = new ProducerConsumer();
		Thread producerThread = new Thread(() -> example.produce());
		Thread consumerThread = new Thread(() -> example.consume());

		producerThread.start();
		consumerThread.start();
	}

	public void produce() {
		while (true) {
			synchronized (buffer) {
				while (buffer.size() == BUFFER_CAPACITY) {
					try {
						buffer.wait(); // Wait if buffer is full
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int value = (int) (Math.random() * 100);
				buffer.add(value);
				System.out.println("Produced: " + value);
				buffer.notify(); // Notify consumer that new data is available
			}
		}
	}

	public void consume() {
		while (true) {
			synchronized (buffer) {
				while (buffer.isEmpty()) {
					try {
						buffer.wait(); // Wait if buffer is empty
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int value = buffer.removeFirst();
				System.out.println("Consumed: " + value);
				buffer.notify(); // Notify producer that buffer has space
			}
		}
	}
}
