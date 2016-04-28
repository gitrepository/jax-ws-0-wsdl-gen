package com.ws.publish;

import javax.xml.ws.Endpoint;

import com.ws.service.OffenderService;

public class OffenderServicePublisher {

    public static void main(String[] args) {
	Endpoint.publish("http://localhost:8080/OffenderService", new OffenderService());
    }
}
