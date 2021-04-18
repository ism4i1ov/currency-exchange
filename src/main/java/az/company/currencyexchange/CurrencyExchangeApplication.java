package az.company.currencyexchange;

import az.company.currencyexchange.dto.CurrencyResponseDTO;
import az.company.currencyexchange.service.CurrencyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Scanner;

@SpringBootApplication
public class CurrencyExchangeApplication implements CommandLineRunner {

    private final CurrencyService currencyService;

    public CurrencyExchangeApplication(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CurrencyExchangeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("From currency: ");
        String fromCurrency = sc.nextLine();
        System.out.println("To currency: ");
        String toCurrency = sc.nextLine();
        System.out.println("Amount: ");
        BigDecimal bigDecimal = sc.nextBigDecimal();
        CurrencyResponseDTO currencyFromAndTo = currencyService.getCurrencyFromAndTo(fromCurrency, toCurrency, bigDecimal);
        BigDecimal conversionResult = currencyFromAndTo.getConversionResult();
        System.out.println("Result: " + conversionResult);
    }
}
