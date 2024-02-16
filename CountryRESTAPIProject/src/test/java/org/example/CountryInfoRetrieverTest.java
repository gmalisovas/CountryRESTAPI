package org.example;

import org.example.controller.*;
import org.example.model.*;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class CountryInfoRetrieverTest {
	
	@Test
	public void TestGetAllCountries() {
		CountriesInfoService test = new CountriesInfoService();
		List<Country> countries = test.getAllCountries();
		countries.forEach(System.out::println);
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
