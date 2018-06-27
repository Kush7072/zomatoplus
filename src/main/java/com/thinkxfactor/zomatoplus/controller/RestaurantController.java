package com.thinkxfactor.zomatoplus.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repo.ItemRepository;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController  {
	
	@Autowired
	public RestaurantRepository restaurantRepoitory;
	
	@PostMapping("/addrest")
	public Restaurant addRest(@RequestBody Restaurant restaurant) {
		Restaurant rest1= restaurantRepoitory.save(restaurant);
		return rest1;
	}
	
	@Autowired
	public ItemRepository itemRepository;
	
	@PostMapping("/additem")
	public Items addItem(@RequestBody Items item) {
		Items item1=itemRepository.save(item);
		return item1;
	}
	
	@PostMapping("/getRname")
	public List<Restaurant> getRlist(){
		List RList=restaurantRepoitory.findAll();
		return RList;
		
	}
	
	@PostMapping("/getItem")
	public Items getItem(Items Item2) {
		Items item2=itemRepository.findByRestaurantId(Item2.getRestaurantId());
		return item2;
	}
	

}
