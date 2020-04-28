package com.tts.rsvr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.rsvr.model.Event;
import com.tts.rsvr.service.EventServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/events")
public class EventController {
	
	@Autowired
	private EventServiceImpl eventServiceImpl;
	
	@GetMapping()
	public List<Event> getEvents() {
		return eventServiceImpl.findAll();
	}
	
	@GetMapping("/{id}")
	public Event getEvent(@PathVariable Long id) {
		return eventServiceImpl.findEventById(id);
	}
	
	@PostMapping()
	public Event saveEvent(@RequestBody Event event) {
		return eventServiceImpl.saveEvent(event);
	}
	
	@PutMapping("/{id}")
	public Event updateEvent(@PathVariable Long id, @RequestBody Event event) {
		return eventServiceImpl.updateEventById(id, event);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEvent(@PathVariable Long id) {
		eventServiceImpl.deleteEventById(id);
	}
	

}
