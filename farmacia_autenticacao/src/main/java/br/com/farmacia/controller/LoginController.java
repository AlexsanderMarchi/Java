package br.com.farmacia.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  // O login (GET e POST /login) agora e feito pelo Spring Security.
  // Depois de logar, ele manda para "/", que redireciona para a home.
  // O logout (POST /logout) tambem e do Spring Security.
  @GetMapping("/")
  public String inicio() {
    return "redirect:/home";
  }

  @GetMapping("/home")
  public String home(Principal principal, Model model) {
    // Principal e o usuario que o Spring Security autenticou
    model.addAttribute("usuario", principal.getName());
    return "home";
  }
}
