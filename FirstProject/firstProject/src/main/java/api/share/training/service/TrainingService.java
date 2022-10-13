package api.share.training.service;

import org.springframework.stereotype.Service;

import api.share.training.model.Animale;

@Service
public class TrainingService {

	public void ciaoMondo() {
		System.out.println("Hello World!");
	}
	
	public void stampaInfoAnimale(Animale animale) {
		System.out.println(animale.getNome());
		System.out.println(animale.getnZampe());
	}
}
