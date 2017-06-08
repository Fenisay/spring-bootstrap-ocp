package com.amadeus.action.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amadeus.action.resource.Data;
import com.amadeus.action.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	private BookingService odService;

	@RequestMapping(value = "/bookings", method = RequestMethod.GET, produces = "application/json")
	public Data showMessage(@RequestParam(value = "pnr", required = false, defaultValue = "123qwe") String pnr) {

		Data d = new Data();
		d.setData(odService.getDataTest());

		return d;
	}
}