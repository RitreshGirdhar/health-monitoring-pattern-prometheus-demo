package com.example.demo.controller;

import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;



}
