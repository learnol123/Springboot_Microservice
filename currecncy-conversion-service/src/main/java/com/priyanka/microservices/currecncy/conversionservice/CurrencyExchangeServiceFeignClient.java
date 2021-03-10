package com.priyanka.microservices.currecncy.conversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
 * @FeignClient(name = "currency-excahnge-service",url = "localhoat:8000")
 * public interface CurrencyExchangeServiceFeignClient {
 * 
 * @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
 * public CurrencyConversionBean convertCurrency(@PathVariable String
 * from, @PathVariable String to,
 * 
 * @PathVariable Double quantity) ;
 * 
 * 
 * }
 */


/*
 * @FeignClient(name ="currency-exchange-service")
 * 
 * @RibbonClient(name = "currency-exchange-service") public interface
 * CurrencyExchangeServiceFeignClient {
 * 
 * @GetMapping("/currency-exchange/from/{from}/to/{to}") public
 * CurrencyConversionBean convertCurrency(@PathVariable String
 * from, @PathVariable String to) ;
 * 
 * 
 * }
 */
//Zuul api
@FeignClient(name ="netflix-zuul-api-getaeway-sever")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceFeignClient {
	@GetMapping("currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to) ;

	
}