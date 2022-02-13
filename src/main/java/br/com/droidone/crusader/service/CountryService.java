package br.com.droidone.crusader.service;

import java.util.Locale;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private Random random = new Random();

    public String getRandomCountry() {
        String[] locales = Locale.getISOCountries();
        var randomIndex = this.random.nextInt(locales.length);
        Locale locale = new Locale("", locales[randomIndex]);
        return locale.getDisplayCountry();
    }
}
