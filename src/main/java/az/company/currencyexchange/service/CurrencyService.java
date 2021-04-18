package az.company.currencyexchange.service;

import az.company.currencyexchange.dto.CurrencyResponseDTO;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class CurrencyService {

    private final RestTemplate restTemplate;

    public CurrencyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CurrencyResponseDTO getCurrencyFromAndTo(String from, String to, BigDecimal amount) {
        String url = String.format("https://v6.exchangerate-api.com/v6/a1f03cceb472bbd959a2940a/pair/%s/%s/%s", from, to, amount);
        return restTemplate.exchange(url,
                HttpMethod.GET, null, CurrencyResponseDTO.class).getBody();
    }
}
