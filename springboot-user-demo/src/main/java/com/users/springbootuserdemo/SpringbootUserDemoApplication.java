package com.users.springbootuserdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.users.springbootuserdemo.model.User;
import com.users.springbootuserdemo.repository.UserRepository;

@SpringBootApplication
public class SpringbootUserDemoApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootUserDemoApplication.class, args);
	}

	@Autowired
    private UserRepository userRepository;

    @Override
    public void run(String...args) throws Exception {
        this.userRepository.save(new User("hanisha", "patchineelam", "hp@gmail.com"));
        this.userRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
        this.userRepository.save(new User("Tony", "Stark", "tony@gmail.com"));
    }
}