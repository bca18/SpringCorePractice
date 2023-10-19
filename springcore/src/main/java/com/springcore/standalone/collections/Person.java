package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	private List<String> friends;
	private Map<String, Integer> items;
	private Set<Integer> set;

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", items=" + items + ", set=" + set + "]";
	}

	public Map<String, Integer> getItems() {
		return items;
	}

	public void setItems(Map<String, Integer> items) {
		this.items = items;
	}
	
	
}
