package api.share.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.share.training.model.Animale;
import api.share.training.service.TrainingService;

@RestController
@RequestMapping("/training")
public class TrainingController {

	@Autowired
	private TrainingService svc;
	
	@GetMapping("/hello")
	public void ciaoMondo() {
		this.svc.ciaoMondo();
	}
	
	@PostMapping("/animale")
	public Animale stampaInfoAnimale(@RequestBody Animale animale) {
		this.svc.stampaInfoAnimale(animale);
		return animale;
	}
	
	@GetMapping("/animale/{nome}")
	public String stampaInfoAnimale(@PathVariable String nome) {
		return "ciao "+ nome;
	}
	
	@GetMapping("/animale")
	public String stampaNomeAnimale(@RequestParam String nome) {
		return "ciao "+ nome;
	}
	
	@GetMapping("/animale1")
	public String stampaNomeAnimaleHeader(@RequestHeader String nome) {
		return "ciao "+ nome;
	}
	
}
