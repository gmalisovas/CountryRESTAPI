package org.example;

import com.google.gson.Gson;
import org.assertj.core.api.Assertions;
import org.example.controller.*;
import org.example.model.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static junit.framework.TestCase.assertTrue;


@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class CountryInfoRetrieverTest {
	
	@Test
	public void TestGetAllCountries() {
		CountriesInfoService test = new CountriesInfoService();
		List<Country> countries = test.getAllCountries();
		//countries.forEach(System.out::println);
		for(Country country : countries)
		{
			System.out.println(country.toString());
		}
	}
	
	@Test
	public void TestGetCountryByName() {
		CountriesInfoService test = new CountriesInfoService();
		List<Country> countries = test.getCountryByName("greece");
		countries.forEach(System.out::println);
	}
	
	@Test
	public void TestGetCountriesByLanguage() {
		CountriesInfoService test = new CountriesInfoService();
		List<Country> countries = test.getCountriesByLanguage("greek");
		countries.forEach(System.out::println);
	}
	
	@Test
	public void TestGetCountriesByCurrency() {
		CountriesInfoService test = new CountriesInfoService();
		List<Country> countries = test.getCountriesByCurrency("cop");
		countries.forEach(System.out::println);
	}

}
