package com.wjl.maven.pojo.po;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {

	@Value("666")
	private String id;
	@Value("錘子")
	private String phoneName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public Phone() {
		System.out.println("+++++++++++++++++++我来了~~~~~~~~~~~~");
	}
	public Phone(String id, String phoneName) {
		this.id = id;
		this.phoneName = phoneName;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", phoneName=" + phoneName + "]";
	}
	
	
}
