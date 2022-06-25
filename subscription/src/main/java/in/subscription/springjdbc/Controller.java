package in.subscription.springjdbc;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private SubscriptionService service;
	//List
	@GetMapping("/subscription")
	public List<Subscription_Package> list() {
		return service.listAll();
	}
	//Get
	@GetMapping("/subscription/{id}")
	public ResponseEntity<Subscription_Package> get(@PathVariable Integer id) {
		try {
			Subscription_Package subscription_package = service.get(id);
			return new ResponseEntity<Subscription_Package>(subscription_package, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Subscription_Package>(HttpStatus.NOT_FOUND);
		}
	}
	//Add
	@PostMapping("/subscription")
	public void add(@RequestBody Subscription_Package subscription_package) {
		service.save(subscription_package);	
	}
	//Update
	@PutMapping("/subscription/{id}")
	public ResponseEntity<?> update(@RequestBody Subscription_Package subscription_package,
			@PathVariable Integer id) {
		try {
		Subscription_Package existSubscription_Package = service.get(id);
		service.save(subscription_package);
		
		
		return new ResponseEntity<>(HttpStatus.OK);
	}catch(NoSuchElementException e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	//Delete
	@DeleteMapping("/subscription/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}

