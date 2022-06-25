package in.subscription.springjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {
	
	@Autowired
	private SubscriptionRepository repo;
	
	public List<Subscription_Package> listAll(){
		return repo.findAll();
	}
	
	public void save(Subscription_Package subscription_package) {
		repo.save(subscription_package);
	}
	
	public Subscription_Package get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
