package br.com.hellospring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller possui o mesmo comportamento que a servlet, conectando o cliente ao servidor
@RestController //abstrai algumas annotations auxiliares para exibição de informação na tela
public class HomeController {
	
	@RequestMapping("/") //significa que é a página inicial (mapeia o endpoint - identificação de funcionalidades na url - que será usado na aplicação)
	//@ResponseBody() - usado em conjunto com o @Controller para exibição de informação na tela
	public String homeMessage() {
		return "Hello World! Hello Meninas!!!";
	}
	
	//@Configuration //quando eu quero criar um comportamento novo
	
	//@Bean 

}
