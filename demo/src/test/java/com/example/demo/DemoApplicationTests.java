package com.example.demo;

import com.example.demo.dao.PetDao;
import com.example.demo.domain.Pet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	PetDao petDao;
	@Test
	void addPet(){
		Pet pet=new Pet();
		pet.setPname("asdasd");
		pet.setColor("452125");

		petDao.save(pet);
	}
}
