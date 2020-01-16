package com.bruno.ProjectApiRestful.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.bruno.ProjectApiRestful.domain.Post;
import com.bruno.ProjectApiRestful.domain.User;
import com.bruno.ProjectApiRestful.dto.AuthorDTO;
import com.bruno.ProjectApiRestful.repository.PostRepository;
import com.bruno.ProjectApiRestful.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));		
		userRepository.deleteAll();
		postRepository.deleteAll();
		User mario = new User(null, "Mario red", "Mario@gmail.com");
		User alex = new User(null, "Luigi Green", "Luigi@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		userRepository.saveAll(Arrays.asList(mario, alex, bob));
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para são paulo", new AuthorDTO(mario));
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hj", new AuthorDTO(mario));
		
		postRepository.saveAll(Arrays.asList(post1, post2));
	}

}
